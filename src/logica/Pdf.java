/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import accesoDatos.AccesoBD;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Pdf {
    
        AccesoBD acceso;
        
        public Pdf(){
            acceso = new AccesoBD();
            System.out.print("hola");
            
            System.out.print("");

        }
        

    public void createPdf(String nombreDocumento, String identificacionCliente, String evento, String costo,String pago,String cambio) throws IOException, DocumentException {
        Font FONT = new Font(FontFamily.HELVETICA, 16, Font.NORMAL, GrayColor.BLACK);
            
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/Users/Alexandra/Desktop/"+nombreDocumento+".pdf")); //CAMBIAR RUTA
        document.open();
        PdfContentByte cb = writer.getDirectContentUnder();
        
        Image img = Image.getInstance("/Users/Alexandra/Desktop/re.jpg");
        img.scaleToFit(500, 900);
        float width = img.getScaledWidth();
        float height = img.getScaledHeight();
        PdfTemplate template = cb.createTemplate(width, height);

        template.addImage(img, width, 0, 0, height, 0, 0);
        ColumnText.showTextAligned(template, Element.ALIGN_RIGHT,
                new Phrase(identificacionCliente,FONT), 400,243 , 0);
        ColumnText.showTextAligned(template, Element.ALIGN_RIGHT,
                new Phrase(evento,FONT), 400,203 , 0);
        ColumnText.showTextAligned(template, Element.ALIGN_RIGHT,
                new Phrase(costo,FONT), 400,149, 0);
          ColumnText.showTextAligned(template, Element.ALIGN_RIGHT,
                new Phrase(pago,FONT), 400,103, 0);
            ColumnText.showTextAligned(template, Element.ALIGN_RIGHT,
                new Phrase(cambio,FONT), 400,68, 0);
        
        java.util.Date fecha = new Date();
        System.out.println (fecha);
       
         ColumnText.showTextAligned(template, Element.ALIGN_RIGHT,
                new Phrase(String.valueOf(fecha),FONT), 410,33, 0);

       
        document.add(Image.getInstance(template));

        document.close();
    }
    public boolean crearCertificado(String nombrePersona, String nombreEvento, String rutaArchivo, String nombreArchivo, String year, String month, String day){
            try {
                Font FONT = new Font(FontFamily.TIMES_ROMAN, 18, Font.ITALIC, GrayColor.BLACK);
                Document document = new Document(PageSize.A4.rotate());
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo+"/"+nombreArchivo+".pdf")); //CAMBIAR RUTA
                document.open();
                PdfContentByte cb = writer.getDirectContentUnder();
                Image img = Image.getInstance("src/gui/images/certificado.png");
                img.scaleToFit(800, 560);
                float width = img.getScaledWidth();
                float height = img.getScaledHeight();
                PdfTemplate template = cb.createTemplate(width, height);
                template.addImage(img, width, 0, 0, height, 0, 0);
                //nombre persona
                ColumnText.showTextAligned(template, Element.ALIGN_CENTER,
                        new Phrase(nombrePersona,FONT), 370,367 , 0);
                //mes
                ColumnText.showTextAligned(template, Element.ALIGN_CENTER,
                        new Phrase(month,FONT), 230, 200 , 0);
                //dia
                ColumnText.showTextAligned(template, Element.ALIGN_CENTER,
                        new Phrase(day,FONT), 370, 200 , 0);
                //year
                ColumnText.showTextAligned(template, Element.ALIGN_CENTER,
                        new Phrase(year,FONT), 545, 200 , 0);
                //evento
                ColumnText.showTextAligned(template, Element.ALIGN_CENTER,
                        new Phrase(nombreEvento,FONT), 370,295 , 0);
                document.add(Image.getInstance(template));
                document.close();
                
            } catch (DocumentException ex) {
                Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } catch (IOException ex) {
                Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
            return true;
    }
    
    public boolean generarPdfConsulta(String consultaSql, String ruta, String nombreDocumento, String textoTitulo) {
        Connection conn = acceso.getConnetion();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet query_set = stmt.executeQuery(consultaSql);
            ResultSetMetaData rsmd = query_set.getMetaData();

            /* Step-2: Initialize PDF documents - logical objects */
            Document my_pdf_report = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(my_pdf_report, new FileOutputStream(ruta+"/"+nombreDocumento+".pdf"));
            my_pdf_report.open();


            //we have four columns in our table
            int columnCount = rsmd.getColumnCount();
            PdfPTable my_report_table = new PdfPTable(columnCount);
            PdfPCell table_cell = new PdfPCell(new Phrase(textoTitulo));
            table_cell.setColspan(columnCount);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            my_report_table.addCell(table_cell);

            //create a cell object
            for (int i = 1; i <= columnCount; i++ ) {
                String nameColumn = rsmd.getColumnName(i);
                table_cell=new PdfPCell(new Phrase(nameColumn));
                my_report_table.addCell(table_cell);
            }
            while (query_set.next()) {   
                for (int i = 1; i <= columnCount; i++ ) {
                    String nameColumn = rsmd.getColumnName(i);
                    String content = query_set.getString(nameColumn);
                    table_cell=new PdfPCell(new Phrase(content));
                    my_report_table.addCell(table_cell);
                }
            }
            /* Attach report table to PDF */
            my_pdf_report.add(my_report_table);                       
            my_pdf_report.close();

            /* Close all DB related objects */
            query_set.close();
            stmt.close(); 
            conn.close();      
        } catch (SQLException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (DocumentException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        /* Define the SQL query */
        return true;
    }
        
}



class Main {
	public static void main (String [] abc) throws IOException, FileNotFoundException, DocumentException, SQLException  {
                Pdf pdf = new Pdf();
                //pdf.crearCertificado("CARLOS FERNANDO TOVAR", "PROGRAMACION POR RESTRICCIONES", "/home/tovar/Desktop", "archivo");
                //pdf.createPdf("archivo", "1144197211", "Google Games", "50000","3000","1000");
                //pdf.generarPdfConsulta("select * from inscripciones", "/Users/Alexandra/Desktop", "leksaoa2.pdf", "Reporte de inscripciones :O");
	}
}