package Modelo;

//recursos a utilizar
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import logica.Lista;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;

public class ModeloExcel {

    Workbook wb;//workbook, libro de trabajo que vamos a utilizar
    String columnas[] = {"Codigo", "Nombre", "Precio", "Cantidad", "Total"};//columnas a insertar en la tabla

    //metodo importar
    public String Importar(File archivo, JTable tablaD, Lista Lista) {
        //inicializamos la varible respuesta
        String respuesta = "No se pudo realizar la importación.";
        //creamos el modelo que le asignaremos a la tabla
        DefaultTableModel modeloT = new DefaultTableModel(null, columnas);
        tablaD.setModel(modeloT);//se le asigna el modelo
        tablaD.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);//que la tabla insertada se ajuste al espacio de la tabla anterior
        try {
            //creamos la coneccion entre el archivo y el programa usando de referencia el libro de trabajo
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            //creamos una hoja en blanco con el libro que usamos
            Sheet hoja = wb.getSheetAt(0);
            //creamos un iterador para la fila con el valor de las filas de la hoja
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = -1;//varibale indice fila
            while (filaIterator.hasNext()) {//sera verdadero mientras hayan filas por recorrer                
                indiceFila++;//como nuestra variable indice de fila iniciaba en -1 le sumanos 1 para que se encuentre en la posicion 0
                Row fila = (Row) filaIterator.next();//creamos la variable tipo columna a la que le asignamos el valor de fila iterador next
                Iterator columnaIterator = fila.cellIterator();//creamos el iterador de la columna al que le asignamos el valor del iterador de celdas dentro de la fila
                Object[] listaColumna = new Object[6];//creamos un array de 5 de tipo object (astracto)
                int indiceColumna = -1;//varibale indice columna
                while (columnaIterator.hasNext()) {//sera verdadero mientras hayan columnas por recorrer                    
                    indiceColumna++;//como nuestra varibal indice columna inicia en -1 le sumanos 1 para que se encuentre en la posicion 0
                    Cell celda = (Cell) columnaIterator.next();//creamos la varibale celda donde le asignaremos el valor de la columna siguiente
                    if (indiceFila == 0) {
                        //mientras la fila sea 0 no haremos nada ya que en teoria es donde se encuentran los titulos de nuestra tabla
                        //los cuales estan en el propio modelo a insertar
                        //si desea que el codigo funcione de otra manera modifique la linea 25 dejando el constructor vacio y asigne instrucciones aqui
                    } else {
                        //mientras la fila sea diferente de 0
                        if (celda != null) {//sera verdadero mientras la celda no sea igual a null (no tenga ningun dato dentro)
                            switch (celda.getCellType()) {//analizaremos el dato recibido dentro de la celda
                                case Cell.CELL_TYPE_NUMERIC://si el dato dentro de la celda es tipo numero
                                    listaColumna[indiceColumna] = (int) Math.round(celda.getNumericCellValue());
                                    break;
                                case Cell.CELL_TYPE_STRING://si el dato dentro de la celda es tipo cadena
                                    listaColumna[indiceColumna] = celda.getStringCellValue();
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN://si el dato dentro de la celda es tipo booleano
                                    listaColumna[indiceColumna] = celda.getBooleanCellValue();
                                    break;
                                default://caso por defecto se obtiene el dato independintemente del tipo
                                    listaColumna[indiceColumna] = celda.getDateCellValue();
                                    break;
                            }

                            if (listaColumna[5] != null) {//sera verdadero cuando el array este lleno
                                //añadimos a la lista los datos obtenidos al importar
                                Lista.AgregarImportacion(LlenadoExcel(listaColumna));
                            }
                        }
                    }
                }
                //si el indice de la fila es diferente de 0 añadimos una columna a la tabla
                if (indiceFila != 0) {
                    modeloT.addRow(listaColumna);
                }
            }
            respuesta = "Importación exitosa";//mensaje de que la importacion a sido realizada con exito
        } catch (IOException | InvalidFormatException | EncryptedDocumentException e) {
            //en caso se requiera una validacion
        }
        return respuesta;//retornamos la respuesta
    }

    //metodo exportar
    public String Exportar(File archivo, JTable tablaD) {
        //inicializamos la varible respuesta
        String respuesta = "No se realizo con exito la exportación.";
        //inicializamos las variables numfila y numcolumna con el numero de filas y columnas dentro de la tabla correspondientemente
        int numFila = tablaD.getRowCount(), numColumna = tablaD.getColumnCount();
        if (archivo.getName().endsWith("xls")) {//si el archivo termina en una extension "xls"
            wb = new HSSFWorkbook();//utilizamos el libro de trabajo para crear un archivo con el formato elegido
        } else {//si no, utilizaremos un formato mas global
            wb = new XSSFWorkbook();
        }
        Sheet hoja = wb.createSheet("Pruebita");//creamos una hoja con el libro de trabajo
        try {
            for (int i = -1; i < numFila; i++) {//creamos un ciclo donde nos moveremos de fila en fila
                //creamos una variable tipo columna de nombre fila donde crearemos una fila en cada columna que alternemos
                Row fila = hoja.createRow(i + 1);//como la variable inicia en -1 le añadimos 1 por defecto
                for (int j = 0; j < numColumna; j++) {//creamos un ciclo donde nos moveremos de columna en columna
                    Cell celda = fila.createCell(j);//cramos una variable tipo celda donde crearemos una celda en cada columna de la fila en al que nos encontremos
                    if (i == -1) {//si nos encontramos en la primera posicion de la hoja
                        //le daremos a la selda el valor del nombre de la columna (en este caso el titulo)
                        celda.setCellValue(String.valueOf(tablaD.getColumnName(j)));
                    } else {
                        if (j == 0 || j >= 3) {//si j se encuentra en la posicion de los datos numericos importantes
                            String numero = String.valueOf(tablaD.getValueAt(i, j));
                            celda.setCellValue(Integer.valueOf(numero));
                        } else {//sino
                            celda.setCellValue(String.valueOf(tablaD.getValueAt(i, j)));
                        }
                    }
                    //utilizamos el libro de trabajo para escribir dentro del archivo creado
                    wb.write(new FileOutputStream(archivo));
                }
            }
            //declaramos el mensaje de exportacion exitosa
            respuesta = "Exportación exitosa.";
        } catch (Exception e) {
        }
        //retornamos una respues
        return respuesta;
    }

    //metodo llenadoExcell
    public Producto LlenadoExcel(Object[] Datos) {
        //se utiliza para que los datos obtenidos del archivo puedan ser adaptados a un producto y pudan ser inscritos dentro de la lista
        Producto p = new Producto();
        p.setCodigo((String) Datos[1]);
        p.setNombreProducto((String) Datos[2]);
        p.setValorUnitario((int) Datos[3]);
        p.setStock((int) Datos[4]);
        p.setTotal((int) Datos[5]);
        //retornamos el producto
        return p;
    }
}
