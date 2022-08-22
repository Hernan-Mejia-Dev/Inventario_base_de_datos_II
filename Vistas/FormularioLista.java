package Vistas;

import Modelo.Producto;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import logica.ListaSimple;

public class FormularioLista extends javax.swing.JFrame {

    static ListaSimple Lista = new ListaSimple();
    int contAction = 0;
    int pos = 0;
    String columnas[] = {"Codigo", "Nombre", "Precio", "Cantidad", "Total"};
    DefaultTableModel modelo;

    public FormularioLista() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        //colores iniciales de la mayoria de componentes
        InicializarColores();

        modelo = new DefaultTableModel(null, columnas);
        tabla.setModel(modelo);

        //actualizamos el manager del sistema para que se utilice el del sistema donde se ejecuta y no el por defecto
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiarCajasTexto() {

        txtCantidad.setText("");
        txtCodigo.setText("");
        txtPrecio.setText("");
        txtNombre.setText("");

    }

    public Producto Llenado() {
        Producto producto = new Producto();
        producto.setCodigo(txtCodigo.getText());
        producto.setNombreProducto(txtNombre.getText());
        producto.setValorUnitario(Integer.valueOf(txtPrecio.getText()));
        producto.setStock(Integer.valueOf(txtCantidad.getText()));
        producto.setTotal(Integer.valueOf(txtPrecio.getText()) * Integer.valueOf(txtCantidad.getText()));

        return producto;
    }

    public void HabilitarBotones(boolean x) {
        btnAgregar.setEnabled(x);
        btnAgregarFinal.setEnabled(x);
        btnAgregarPosicion.setEnabled(x);
        btnAgregarPosicion.setEnabled(x);
        btnAgregarValor.setEnabled(x);
        btnEliminar.setEnabled(x);
        btnEliminarFinal.setEnabled(x);
        btnEliminarSeleccion.setEnabled(x);
        btnExportar.setEnabled(x);
        btnImportar.setEnabled(x);
    }

    public void InicializarColores() {
        tabla.setColorBackgoundHead(new Color(38, 45, 61));
        btnExportar.setColorNormal(new Color(38, 45, 61));
        btnImportar.setColorNormal(new Color(38, 45, 61));
        btnAgregar.setColorNormal(new Color(255, 255, 255));
        btnAgregarFinal.setColorNormal(new Color(255, 255, 255));
        btnAgregarPosicion.setColorNormal(new Color(255, 255, 255));
        btnAgregarValor.setColorNormal(new Color(255, 255, 255));
        btnEliminar.setColorNormal(new Color(255, 255, 255));
        btnEliminarFinal.setColorNormal(new Color(255, 255, 255));
        btnEliminarSeleccion.setColorNormal(new Color(255, 255, 255));
        btnModificar.setColorNormal(new Color(255, 255, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelRound2 = new LIB.JPanelRound();
        jPanelRound1 = new LIB.JPanelRound();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        txtCodigo = new LIB.FSTexFieldMD();
        txtNombre = new LIB.FSTexFieldMD();
        txtPrecio = new LIB.FSTexFieldMD();
        txtCantidad = new LIB.FSTexFieldMD();
        jLabel1 = new javax.swing.JLabel();
        jEImagePanel3 = new LIB.JEImagePanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jEImagePanel6 = new LIB.JEImagePanel();
        jEImagePanel2 = new LIB.JEImagePanel();
        btnExportar = new LIB.FSButtonMD();
        btnImportar = new LIB.FSButtonMD();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new LIB.FSButtonMD();
        jEImagePanel5 = new LIB.JEImagePanel();
        btnAgregarValor = new LIB.FSButtonMD();
        btnAgregarFinal = new LIB.FSButtonMD();
        btnEliminar = new LIB.FSButtonMD();
        btnAgregarPosicion = new LIB.FSButtonMD();
        btnEliminarFinal = new LIB.FSButtonMD();
        btnEliminarSeleccion = new LIB.FSButtonMD();
        jEImagePanel7 = new LIB.JEImagePanel();
        btnModificar = new LIB.FSButtonMD();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelRound2Layout = new javax.swing.GroupLayout(jPanelRound2);
        jPanelRound2.setLayout(jPanelRound2Layout);
        jPanelRound2Layout.setHorizontalGroup(
            jPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelRound2Layout.setVerticalGroup(
            jPanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRound1.setColorPrimario(new java.awt.Color(255, 255, 255));
        jPanelRound1.setColorSecundario(new java.awt.Color(102, 255, 255));

        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtCodigo.setPlaceholder("Codigo");
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtNombre.setPlaceholder("Nombre");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtPrecio.setPlaceholder("Precio");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtCantidad.setPlaceholder("Cantidad");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO PRODUCTOS ");

        jEImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CODIGO");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CANTIDAD");

        jEImagePanel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marco.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel6Layout = new javax.swing.GroupLayout(jEImagePanel6);
        jEImagePanel6.setLayout(jEImagePanel6Layout);
        jEImagePanel6Layout.setHorizontalGroup(
            jEImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jEImagePanel6Layout.setVerticalGroup(
            jEImagePanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/donacion-de-alimentos.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnExportar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnExportar.setToolTipText("Guardar Archivos");
        btnExportar.setColorNormal(new java.awt.Color(38, 45, 61));
        btnExportar.setColorPressed(new java.awt.Color(255, 255, 255));

        btnImportar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando.png"))); // NOI18N
        btnImportar.setToolTipText("Cargar Tabla");
        btnImportar.setColorNormal(new java.awt.Color(38, 45, 61));
        btnImportar.setColorPressed(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelTransparente1Layout = new javax.swing.GroupLayout(jPanelTransparente1);
        jPanelTransparente1.setLayout(jPanelTransparente1Layout);
        jPanelTransparente1Layout.setHorizontalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransparente1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jEImagePanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransparente1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransparente1Layout.createSequentialGroup()
                        .addComponent(jEImagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransparente1Layout.createSequentialGroup()
                        .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        jPanelTransparente1Layout.setVerticalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanelTransparente1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jEImagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEImagePanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEImagePanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROCESOS");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar al inicio.png"))); // NOI18N
        btnAgregar.setText("Agregar ");
        btnAgregar.setColorHover(new java.awt.Color(204, 255, 255));
        btnAgregar.setColorNormal(new java.awt.Color(255, 255, 255));
        btnAgregar.setColorPressed(new java.awt.Color(204, 255, 255));
        btnAgregar.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnAgregar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        jEImagePanel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tornillo.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel5Layout = new javax.swing.GroupLayout(jEImagePanel5);
        jEImagePanel5.setLayout(jEImagePanel5Layout);
        jEImagePanel5Layout.setHorizontalGroup(
            jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jEImagePanel5Layout.setVerticalGroup(
            jEImagePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        btnAgregarValor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar valor.png"))); // NOI18N
        btnAgregarValor.setText("Agregar Valor");
        btnAgregarValor.setColorHover(new java.awt.Color(204, 255, 255));
        btnAgregarValor.setColorNormal(new java.awt.Color(255, 255, 255));
        btnAgregarValor.setColorPressed(new java.awt.Color(204, 255, 255));
        btnAgregarValor.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnAgregarValor.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnAgregarValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarValorMouseClicked(evt);
            }
        });

        btnAgregarFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-abajo.png"))); // NOI18N
        btnAgregarFinal.setText("Agregar Final");
        btnAgregarFinal.setColorHover(new java.awt.Color(204, 255, 255));
        btnAgregarFinal.setColorNormal(new java.awt.Color(255, 255, 255));
        btnAgregarFinal.setColorPressed(new java.awt.Color(204, 255, 255));
        btnAgregarFinal.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnAgregarFinal.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnAgregarFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarFinalMouseClicked(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setColorHover(new java.awt.Color(204, 255, 255));
        btnEliminar.setColorNormal(new java.awt.Color(255, 255, 255));
        btnEliminar.setColorPressed(new java.awt.Color(204, 255, 255));
        btnEliminar.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnEliminar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnAgregarPosicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-posicion.png"))); // NOI18N
        btnAgregarPosicion.setText("Agregar Posicion");
        btnAgregarPosicion.setColorHover(new java.awt.Color(204, 255, 255));
        btnAgregarPosicion.setColorNormal(new java.awt.Color(255, 255, 255));
        btnAgregarPosicion.setColorPressed(new java.awt.Color(204, 255, 255));
        btnAgregarPosicion.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnAgregarPosicion.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnAgregarPosicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarPosicionMouseClicked(evt);
            }
        });

        btnEliminarFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar al final.png"))); // NOI18N
        btnEliminarFinal.setText("Eliminar Final");
        btnEliminarFinal.setColorHover(new java.awt.Color(204, 255, 255));
        btnEliminarFinal.setColorNormal(new java.awt.Color(255, 255, 255));
        btnEliminarFinal.setColorPressed(new java.awt.Color(204, 255, 255));
        btnEliminarFinal.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnEliminarFinal.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminarFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarFinalMouseClicked(evt);
            }
        });

        btnEliminarSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar posicion.png"))); // NOI18N
        btnEliminarSeleccion.setText("Eliminar Eleccion");
        btnEliminarSeleccion.setColorHover(new java.awt.Color(204, 255, 255));
        btnEliminarSeleccion.setColorNormal(new java.awt.Color(255, 255, 255));
        btnEliminarSeleccion.setColorPressed(new java.awt.Color(204, 255, 255));
        btnEliminarSeleccion.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnEliminarSeleccion.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminarSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarSeleccionMouseClicked(evt);
            }
        });

        jEImagePanel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        jEImagePanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEImagePanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel7Layout = new javax.swing.GroupLayout(jEImagePanel7);
        jEImagePanel7.setLayout(jEImagePanel7Layout);
        jEImagePanel7Layout.setHorizontalGroup(
            jEImagePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jEImagePanel7Layout.setVerticalGroup(
            jEImagePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarValor.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setColorHover(new java.awt.Color(204, 255, 255));
        btnModificar.setColorNormal(new java.awt.Color(255, 255, 255));
        btnModificar.setColorPressed(new java.awt.Color(204, 255, 255));
        btnModificar.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnModificar.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setColorBackgoundHead(new java.awt.Color(38, 45, 61));
        tabla.setShowGrid(false);
        tabla.setFocusable(false);
        tabla = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int RowIndex, int ColIndex){
                return false;
            }
        };
        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabla);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" PRODUCTOS INGRESADOS");

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRound1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnEliminarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                                    .addComponent(jEImagePanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(jPanelRound1Layout.createSequentialGroup()
                                    .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAgregarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelRound1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jEImagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanelRound1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnAgregarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAgregarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(84, 84, 84)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(212, 212, 212))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))))
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTransparente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEImagePanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRound1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(jPanelRound1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jEImagePanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jEImagePanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEImagePanel7MouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea salir?", "Salir",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jEImagePanel7MouseClicked

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;

        if (!(minusculas || mayusculas)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if (txtCodigo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.AgregarInicio_LS(Llenado());
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFinalMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.AgregarFinal_LS(Llenado());
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }

    }//GEN-LAST:event_btnAgregarFinalMouseClicked

    private void btnAgregarPosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPosicionMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.AgregarPosicion_LS(Llenado());
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }
    }//GEN-LAST:event_btnAgregarPosicionMouseClicked

    private void btnAgregarValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarValorMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.AgregarValor_LS(Llenado());
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }
    }//GEN-LAST:event_btnAgregarValorMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.EliminarInicio_LS();
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarFinalMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.EliminarFinal_LS();
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }
    }//GEN-LAST:event_btnEliminarFinalMouseClicked

    private void btnEliminarSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            Lista.EliminarPosicion_LS(tabla);
            limpiarCajasTexto();
            Lista.mostrarLista(tabla);
        }
    }//GEN-LAST:event_btnEliminarSeleccionMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (contAction == 0) {
                pos = Lista.modificar(this, tabla);
                HabilitarBotones(false);
                contAction = 1;
            } else if (contAction == 1) {
                Lista.AgregarCambios(this, pos);
                Lista.mostrarLista(tabla);
                HabilitarBotones(true);
                contAction = 0;
            }
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnAgregar;
    private LIB.FSButtonMD btnAgregarFinal;
    private LIB.FSButtonMD btnAgregarPosicion;
    private LIB.FSButtonMD btnAgregarValor;
    private LIB.FSButtonMD btnEliminar;
    private LIB.FSButtonMD btnEliminarFinal;
    private LIB.FSButtonMD btnEliminarSeleccion;
    public LIB.FSButtonMD btnExportar;
    public LIB.FSButtonMD btnImportar;
    private LIB.FSButtonMD btnModificar;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel5;
    private LIB.JEImagePanel jEImagePanel6;
    private LIB.JEImagePanel jEImagePanel7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private LIB.JPanelRound jPanelRound1;
    private LIB.JPanelRound jPanelRound2;
    private LIB.JPanelTransparente jPanelTransparente1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public rojerusan.RSTableMetro tabla;
    public LIB.FSTexFieldMD txtCantidad;
    public LIB.FSTexFieldMD txtCodigo;
    public LIB.FSTexFieldMD txtNombre;
    public LIB.FSTexFieldMD txtPrecio;
    // End of variables declaration//GEN-END:variables
}
