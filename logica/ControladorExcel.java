
package logica;

//recursos a utilizar
import Vistas.FormularioLista;
import Modelo.ModeloExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ControladorExcel implements ActionListener{
    ModeloExcel modeloE = new ModeloExcel(); //inicializamos nuestro modelo excel
    FormularioLista vistaE= new FormularioLista(); //inicializamos nuestro formulario
    JFileChooser selecArchivo = new JFileChooser(); //inicializamos nuestro seleccionador de archivos
    ListaSimple Lista = new ListaSimple();//inicializamos nuestra lista
    File archivo;//inicializamos nuestro archivo
    int contAccion=0;//inicializamos nuestro contador de accion

   //metodo contructor    
    public ControladorExcel(FormularioLista vistaE, ModeloExcel modeloE, ListaSimple Lista){
        this.vistaE= vistaE;//igualamos el formulario dentro de la clase al insertado por parametros
        this.modeloE=modeloE;//igualamos el modelo excel dentro de la clase al insertado por parametros
        this.Lista=Lista;//igualamos la lista dentro de la clase a la insertada por parametros
        this.vistaE.btnImportar.addActionListener(this);//agramos un ActionListener al boton de importar
        this.vistaE.btnExportar.addActionListener(this);//agramos un ActionListener al boton de exportar
    }
    
    //metodo agregar filtro
    public void AgregarFiltro(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));//primer tipo extension
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));//segundo tipo de extension
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {//metodo en caso de accion
        contAccion++;//contador de acciones se sumara +1 cada vez que haya una accion
        if(contAccion==1)AgregarFiltro();//si es la primera vez que se acciona, se ejecuta el agregar filtro
        
        if(e.getSource() == vistaE.btnImportar){//si es el evento es efectuado por el boton importar
            if(selecArchivo.showDialog(null, "Seleccionar archivo")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    JOptionPane.showMessageDialog(null, 
                            modeloE.Importar(archivo, vistaE.tabla, Lista) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1), 
                            "IMPORTAR EXCEL", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Elija un formato valido.");
                }
            }
        }
        
        if(e.getSource() == vistaE.btnExportar){//si el evento es efectuado pro el boton exportar
            if(selecArchivo.showDialog(null, "Exportar")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    JOptionPane.showMessageDialog(null, modeloE.Exportar(archivo, vistaE.tabla) + "\n Formato ."+ archivo.getName().substring(archivo.getName().lastIndexOf(".")+1));
                }else{
                    JOptionPane.showMessageDialog(null, "Elija un formato valido.");
                }
            }
        }
    }
}