package logica;

import Modelo.Producto;
import Vistas.FormularioLista;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista {
    NodoLista cabecera, ultimo, p, q;
    String columnas[] = {"Posicion", "Codigo", "Nombre", "Precio", "Cantidad", "Total"};

    public Lista() {
        cabecera = null;
        ultimo = null;
    }

    //metodo para comprobar si la lista esta vacia
    public boolean ListaVacia() {
        if (cabecera == null) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo tamaño para contar el numero de productos en la lista
    public int tamano() {
        int cont = 0;
        NodoLista temporal;//Creamos éste auxiliar para recorrer la lista
        temporal = cabecera; //posicionamos a p en el primer nodo
        while (temporal != null) {
            cont++;
            temporal = temporal.siguiente; //Movemos a p al siguiente nodo mientras no sea NULL
        }
        return cont;
    }

    //meotodo para imprimir la lista en la tabla
    public void mostrarLista(JTable tabla) {
        int cont = 0;
        NodoLista temporal;
        temporal = cabecera;
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        if (ListaVacia()) {//si la lista esta vacia se inscriben solamente los titulos
            JOptionPane.showMessageDialog(null, "LISTA VACIA!!!");
            tabla.setModel(modelo);
        } else {
            while (temporal != null) {
                cont += 1;
                Object fila[] = new Object[6];
                fila[0] = cont;
                fila[1] = temporal.info.getCodigo();
                fila[2] = temporal.info.getNombreProducto();
                fila[3] = String.valueOf(temporal.info.getValorUnitario());
                fila[4] = String.valueOf(temporal.info.getStock());
                fila[5] = temporal.info.getTotal();
                modelo.addRow(fila);
                temporal = temporal.siguiente;
            }
            tabla.setModel(modelo);
            AntiRepCode(tabla);
        }
    }

    /*Metodos del inventario*/
    public void AgregarInicio_LS(Producto producto) {
        NodoLista nuevo = new NodoLista();
        nuevo.info = producto;
        if (ListaVacia()) {//comparamos si la lista esta vacia o no con el metodo
            cabecera = nuevo;//si esta vacia asignamos directamente el producto en la cabecera
            ultimo = cabecera;
            ultimo.siguiente = null;
        } else {//si no esta vacia, se mueve la cabecera y luego se adiciona el producto como cabecera
            nuevo.siguiente = cabecera;
            cabecera = nuevo;
        }
        JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO CORRECTAMENTE");
    }

    public void AgregarFinal_LS(Producto producto) {
        NodoLista nuevo = new NodoLista();
        nuevo.info = producto;
        if (ListaVacia()) {//comparamos si la lista esta vacia o no con el metodo
            cabecera = nuevo;//si esta vacia asignamos directamente el producto en el final
            cabecera.siguiente = null;
            ultimo = nuevo;
        } else {//si no esta vacia, se mueve el ultimo y luego se adiciona el producto como ultimo y se apunta al siguiente como nulo
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = null;
        }
        JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO CORRECTAMENTE");
    }

    public void AgregarPosicion_LS(Producto producto, FormularioLista f1) {
        JOptionPane.showMessageDialog(null, "El numero de elementos en el inventario es: " + tamano());
        NodoLista nuevo = new NodoLista();
        nuevo.info = producto;
        int pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la posición:", "AGREGANDO POSICION", JOptionPane.WARNING_MESSAGE));
        if (ListaVacia()) {
            cabecera = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = null;
            JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO CORRECTAMENTE");
        } else {
            if (pos == 1) {
                AgregarInicio_LS(producto);
            } else if (pos == tamano()) {
                //aqui fue arreglado
                q = cabecera;
                while (q.siguiente != ultimo) {
                    q = q.siguiente;
                }
                q.siguiente = nuevo;
                nuevo.siguiente = ultimo;
                JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO CORRECTAMENTE");
            } else if (pos > 1 && pos < tamano()) {
                p = cabecera;
                for (int i = 1; i < pos; i++) {
                    q = p;
                    p = p.siguiente;
                }
                q.siguiente = nuevo;
                nuevo.siguiente = p;
                JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO CORRECTAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "POSICION NO VALIDA, FUERA DE RANGO");
            }
        }
    }

    public void AgregarValor_LS(Producto producto, FormularioLista f1) {
        boolean enco = false;
        NodoLista aux = new NodoLista();
        aux.info = producto;
        String code = (JOptionPane.showInputDialog(null, "Digite el codigo donde desea añadir el producto:", JOptionPane.WARNING_MESSAGE));
        if (ListaVacia()) {//preguntamos si la lista esta vacia
            cabecera = aux;//si esta vacia lo agregamos directamente en la posicion 1 
            ultimo = aux;
            ultimo.siguiente = null;
            JOptionPane.showMessageDialog(null, "LISTA VACIA!");
            JOptionPane.showMessageDialog(null, "Producto agregado en la posicion 1");
            enco = true;
        }else if(cabecera.info.getCodigo().equals(code)){
            AgregarInicio_LS(producto);
            enco = true;
        }else if(ultimo.info.getCodigo().equals(code)){
            AgregarFinal_LS(producto);
            enco = true;
        }else {
            p = cabecera;
            q = p;
            int cont = 0;
            while (enco == false && cont < tamano()) {
                if (p.info.getCodigo().equals(code)) {
                    q.siguiente = aux;//igualamos el siguiente de q a nuestro producto
                    aux.siguiente = p;//igualamos el siguiente de nuestro producto a p
                    JOptionPane.showMessageDialog(null, "PRODUCTO AGREGADO CORRECTAMENTE");
                    enco = true;
                } else {
                    q = p;//igualamos q a p
                    p = p.siguiente;//igualamos p al puntero siguiente de p
                }
            }
        }
        if (enco == false) {//si nada funciona enviamos que el codigo no fue encontrado
            JOptionPane.showMessageDialog(null, "CODIGO NO ENCONTRADO, INTENTE NUEVAMENTE!");
        }
    }

    public void EliminarPosicion_LS(JTable tabla) {
        int pos = tabla.getSelectedRow() + 1;
        if (!ListaVacia()) {//preguntamos si la lista no esta vacia
            if (pos == 1) {//Preguntamos si la posicion es la primera
                JOptionPane.showMessageDialog(null, "El producto " + cabecera.info.getCodigo() + " ha sido eliminado");
                cabecera = cabecera.siguiente;//si no lo esta, simplemente igualamos la cabecera al siguiente de cabecera
            } else if (pos == tamano()) {//preguntamos si la posicion es igual a la ultima
                p = cabecera;
                while (p.siguiente != ultimo) {
                    p = p.siguiente;
                } //luego asignamos a nuestro auxiliar como el ultimo de la lista y apuntamos el siguiente a null
                JOptionPane.showMessageDialog(null, "El producto " + ultimo.info.getCodigo() + " ha sido eliminado");
                ultimo = p;
                ultimo.siguiente = null;
            } else if (pos > 1 & pos < tamano()) {//si la posicion esta dentro de la primera y ultima posicion
                p = cabecera;
                for (int i = 1; i < pos; i++) {//creamos un ciclo para llegar a la posicion
                    q = p;
                    p = p.siguiente;
                }
                JOptionPane.showMessageDialog(null, "El producto " + p.info.getCodigo() + " ha sido eliminado");
                q.siguiente = p.siguiente;//enlazamos q al siguiente de p para dejar a p en el medio
                p = q;//igualamos p a q
            } else {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun elemento");
            }
        }
    }

    public void AgregarImportacion(Producto producto) {
        NodoLista nuevo = new NodoLista();
        nuevo.info = producto;
        if (ListaVacia()) {//comparamos si la lista esta vacia o no con el metodo
            cabecera = nuevo;//si esta vacia asignamos directamente el producto en el final
            cabecera.siguiente = null;
            ultimo = nuevo;
        } else {//si no esta vacia, se mueve el ultimo y luego se adiciona el producto como ultimo y se apunta al siguiente como nulo
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
            ultimo.siguiente = null;
        }
    }

    public int modificar(FormularioLista vista, JTable tabla) {
        NodoLista nuevo = new NodoLista();
        if (tabla.getSelectedRow() != -1) {
            nuevo = cabecera;
        }
        for (int i = 0; i < tabla.getSelectedRow(); i++) {
            nuevo = nuevo.siguiente;
        }
        if (vista.txtCodigo.getText().isEmpty() || vista.txtNombre.getText().isEmpty() || vista.txtPrecio.getText().isEmpty() || vista.txtCantidad.getText().isEmpty()) {
            vista.txtCodigo.setText(nuevo.info.getCodigo());
            vista.txtNombre.setText(nuevo.info.getNombreProducto());
            vista.txtPrecio.setText(String.valueOf(nuevo.info.getValorUnitario()));
            vista.txtCantidad.setText(String.valueOf(nuevo.info.getStock()));
        }
        return tabla.getSelectedRow();
    }

    public void AgregarCambios(FormularioLista vista, int pos) {
        NodoLista nuevo = new NodoLista();
        nuevo = cabecera;
        for (int i = 0; i < pos; i++) {
            nuevo = nuevo.siguiente;
        }
        nuevo.info.setCodigo(vista.txtCodigo.getText());
        nuevo.info.setNombreProducto(vista.txtNombre.getText());
        nuevo.info.setValorUnitario(Integer.valueOf(vista.txtPrecio.getText()));
        nuevo.info.setStock(Integer.valueOf(vista.txtCantidad.getText()));
        nuevo.info.setTotal(Integer.valueOf(vista.txtPrecio.getText()) * Integer.valueOf(vista.txtCantidad.getText()));
    }

    public void AntiRepCode(JTable tabla) {
        NodoLista nuevo = new NodoLista();
        nuevo = cabecera;
        int NumPos = tamano();
        String[] codigos = new String[NumPos];

        for (int i = 0; i < NumPos; i++) {
            codigos[i] = nuevo.info.getCodigo();
            nuevo = nuevo.siguiente;
        }

        for (int i = 0; i < codigos.length; i++) {
            for (int j = 1; j < codigos.length; j++) {
                if (codigos[i].equals(codigos[j]) && i != j) {
                    JOptionPane.showMessageDialog(null, "Los producto en la posicion " + (i + 1) + " y posicion " + (j + 1) + " poseen codigos repetidos");
                    EncontrarCodigos(i, j, tabla);
                }
            }
        }
    }

    public void EncontrarCodigos(int pos1, int pos2, JTable tabla) {
        NodoLista aux = new NodoLista();
        NodoLista aux2 = new NodoLista();
        aux = cabecera;
        aux2 = cabecera;
        for (int i = 0; i < pos1; i++) {
            aux = aux.siguiente;
        }
        for (int i = 0; i < pos2; i++) {
            aux2 = aux2.siguiente;
        }
        aux.info.setCodigo(CodeGen());
        aux2.info.setCodigo(CodeGen());
        JOptionPane.showMessageDialog(null, "los codigos en ambos productos han sido modificados de manera aleatoria");
        mostrarLista(tabla);
    }

    public String CodeGen() {
        String code = "";
        String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int tamano = (int) Math.floor(Math.random() * 10 + 1);
        for (int i = 0; i < tamano; i++) {
            int random = (int) Math.floor(Math.random() * letras.length());
            code += letras.charAt(random);
        }
        return code;
    }
    

}
