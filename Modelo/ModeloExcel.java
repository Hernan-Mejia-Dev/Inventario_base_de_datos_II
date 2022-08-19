
package Modelo;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import logica.ListaSimple;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;

public class ModeloExcel {
    Workbook wb;
    String columnas[] = {"Codigo", "Nombre", "Precio", "Cantidad", "Total"};
    
    public String Importar(File archivo, JTable tablaD, ListaSimple Lista){
        String respuesta="No se pudo realizar la importación.";
        DefaultTableModel modeloT = new DefaultTableModel(null,columnas);
        tablaD.setModel(modeloT);
        tablaD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        try {
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila=-1;
            while (filaIterator.hasNext()) {                
                indiceFila++;
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
                Object[] listaColumna = new Object[5];
                int indiceColumna=-1;
                while (columnaIterator.hasNext()) {                    
                    indiceColumna++;
                    Cell celda = (Cell) columnaIterator.next();
                    if(indiceFila==0){
                        
                    }else{
                        if(celda!=null){
                            switch(celda.getCellType()){
                                case Cell.CELL_TYPE_NUMERIC:
                                    listaColumna[indiceColumna]= (int)Math.round(celda.getNumericCellValue());
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    listaColumna[indiceColumna]= celda.getStringCellValue();
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:
                                    listaColumna[indiceColumna]= celda.getBooleanCellValue();
                                    break;
                                default:
                                    listaColumna[indiceColumna]=celda.getDateCellValue();
                                    break;
                            }
                            
                            if(listaColumna[4]!=null){
                                Lista.AgregarTabla(LlenadoExcel(listaColumna));
                            }
                        }                        
                    }
                }
                if(indiceFila!=0)modeloT.addRow(listaColumna);
            }
            respuesta="Importación exitosa";
        } catch (IOException | InvalidFormatException | EncryptedDocumentException e) {

        }
        return respuesta;
    }
    
    public String Exportar(File archivo, JTable tablaD){
        String respuesta="No se realizo con exito la exportación.";
        int numFila=tablaD.getRowCount(), numColumna=tablaD.getColumnCount();
        if(archivo.getName().endsWith("xls")){
            wb = new HSSFWorkbook();
        }else{
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Pruebita");
        
        try {
            for (int i = -1; i < numFila; i++) {
                Row fila = hoja.createRow(i+1);
                for (int j = 0; j < numColumna; j++) {
                    Cell celda = fila.createCell(j);
                    if(i==-1){
                        celda.setCellValue(String.valueOf(tablaD.getColumnName(j)));
                    }else{
                        if(j>=2){
                            String numero = String.valueOf(tablaD.getValueAt(i, j));
                            celda.setCellValue(Integer.valueOf(numero));
                        }else{
                            celda.setCellValue(String.valueOf(tablaD.getValueAt(i, j)));
                        }
                    }
                    wb.write(new FileOutputStream(archivo));
                }
            }
            respuesta="Exportación exitosa.";
        } catch (Exception e) {

        }
        return respuesta;
    }
    
    public Producto LlenadoExcel(Object[] listaColumna){      
        Producto p = new Producto();
        p.setCodigo((String) listaColumna[0]);
        p.setNombreProducto((String) listaColumna[1]);
        p.setValorUnitario((int) listaColumna[2]);
        p.setStock((int) listaColumna[3]);
        p.setTotal((int) listaColumna[4]);
        return p;
    }
}
