package Vistas;

import Modelo.Producto;
import java.awt.Color;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import logica.ListaSimple;

public class FormularioLista extends javax.swing.JFrame {

    static ListaSimple Lista = new ListaSimple();
    int contAction = 0;
    int pos = 0;
    boolean BtnDisponibles = true;
    String columnas[] = {"Codigo", "Nombre", "Precio", "Cantidad", "Total"};
    DefaultTableModel modelo;
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;

    public FormularioLista() {
        initComponents();
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
        btnEliminarSeleccion.setEnabled(x);
        btnExportar.setEnabled(x);
        btnImportar.setEnabled(x);
        BtnDisponibles = x;
    }

    public void InicializarColores() {
        this.setBackground(new Color(0, 0, 0, 0));
        tabla.setColorBackgoundHead(new Color(38, 45, 61));
        btnExportar.setColorNormal(new Color(38, 45, 61));
        btnImportar.setColorNormal(new Color(38, 45, 61));
        btnAgregar.setColorNormal(new Color(255, 255, 255));
        btnAgregarFinal.setColorNormal(new Color(255, 255, 255));
        btnAgregarPosicion.setColorNormal(new Color(255, 255, 255));
        btnAgregarValor.setColorNormal(new Color(255, 255, 255));
        btnEliminarSeleccion.setColorNormal(new Color(255, 255, 255));
        btnModificar.setColorNormal(new Color(255, 255, 255));
        btnAgregar.setColorTextNormal(new Color(51, 51, 51));
        btnAgregarFinal.setColorTextNormal(new Color(51, 51, 51));
        btnAgregarPosicion.setColorTextNormal(new Color(51,51,51));
        btnAgregarValor.setColorTextNormal(new Color(51,51,51));
        btnEliminarSeleccion.setColorTextNormal(new Color(51,51,51));
        btnModificar.setColorTextNormal(new Color(51,51,51));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new LIB.JPanelRound();
        Working_Area = new LIB.JPanelTransparente();
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
        TxtProcesos = new javax.swing.JLabel();
        btnAgregar = new LIB.FSButtonMD();
        ImgProcesos = new LIB.JEImagePanel();
        btnAgregarValor = new LIB.FSButtonMD();
        btnAgregarFinal = new LIB.FSButtonMD();
        btnAgregarPosicion = new LIB.FSButtonMD();
        btnEliminarSeleccion = new LIB.FSButtonMD();
        BtnExit = new LIB.JEImagePanel();
        btnModificar = new LIB.FSButtonMD();
        MarcoTabla = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        txtTabla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setColorPrimario(new java.awt.Color(255, 255, 255));
        Background.setColorSecundario(new java.awt.Color(102, 255, 255));

        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtCodigo.setPlaceholder("Codigo");
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValidacionTeclasCodigo(evt);
            }
        });

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtNombre.setPlaceholder("Nombre");
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValidacionTeclasNombre(evt);
            }
        });

        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtPrecio.setPlaceholder("Precio");
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValidacionTeclasPrecio(evt);
            }
        });

        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.setBordeColorFocus(new java.awt.Color(51, 255, 255));
        txtCantidad.setPlaceholder("Cantidad");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValidacionTeclasCantidad(evt);
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

        javax.swing.GroupLayout Working_AreaLayout = new javax.swing.GroupLayout(Working_Area);
        Working_Area.setLayout(Working_AreaLayout);
        Working_AreaLayout.setHorizontalGroup(
            Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Working_AreaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jEImagePanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Working_AreaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Working_AreaLayout.createSequentialGroup()
                        .addComponent(jEImagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Working_AreaLayout.createSequentialGroup()
                        .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(Working_AreaLayout.createSequentialGroup()
                                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        Working_AreaLayout.setVerticalGroup(
            Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Working_AreaLayout.createSequentialGroup()
                .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
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
                .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEImagePanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEImagePanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        TxtProcesos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtProcesos.setForeground(new java.awt.Color(255, 255, 255));
        TxtProcesos.setText("PROCESOS");

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

        ImgProcesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tornillo.png"))); // NOI18N

        javax.swing.GroupLayout ImgProcesosLayout = new javax.swing.GroupLayout(ImgProcesos);
        ImgProcesos.setLayout(ImgProcesosLayout);
        ImgProcesosLayout.setHorizontalGroup(
            ImgProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        ImgProcesosLayout.setVerticalGroup(
            ImgProcesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        btnEliminarSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        btnEliminarSeleccion.setText("Eliminar");
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

        BtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        BtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BtnExitLayout = new javax.swing.GroupLayout(BtnExit);
        BtnExit.setLayout(BtnExitLayout);
        BtnExitLayout.setHorizontalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        BtnExitLayout.setVerticalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        MarcoTabla.setViewportView(tabla);

        txtTabla.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtTabla.setForeground(new java.awt.Color(255, 255, 255));
        txtTabla.setText(" PRODUCTOS INGRESADOS");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Working_Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BackgroundLayout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnAgregarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(ImgProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtProcesos))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAgregarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEliminarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAgregarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                            .addComponent(txtTabla)
                            .addGap(212, 212, 212))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                            .addComponent(MarcoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Working_Area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtTabla)
                .addGap(12, 12, 12)
                .addComponent(MarcoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ImgProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TxtProcesos)))
                .addGap(38, 38, 38)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ValidacionTeclasPrecio(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidacionTeclasPrecio
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ValidacionTeclasPrecio

    private void ValidacionTeclasCantidad(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidacionTeclasCantidad
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 & key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ValidacionTeclasCantidad

    private void ValidacionTeclasNombre(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidacionTeclasNombre
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;

        if (!(minusculas || mayusculas)) {
            evt.consume();
        }
    }//GEN-LAST:event_ValidacionTeclasNombre

    private void ValidacionTeclasCodigo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValidacionTeclasCodigo
        if (txtCodigo.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_ValidacionTeclasCodigo

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (BtnDisponibles == true) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarInicio_LS(Llenado());
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFinalMouseClicked
        if (BtnDisponibles == true) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarFinal_LS(Llenado());
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarFinalMouseClicked

    private void btnAgregarPosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPosicionMouseClicked
        if (BtnDisponibles == true) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarPosicion_LS(Llenado());
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarPosicionMouseClicked

    private void btnAgregarValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarValorMouseClicked
        if (BtnDisponibles == true) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarValor_LS(Llenado());
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarValorMouseClicked

    private void btnEliminarSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionMouseClicked
        if (BtnDisponibles == true) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Lista.EliminarPosicion_LS(tabla);
                limpiarCajasTexto();
                Lista.mostrarLista(tabla);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnEliminarSeleccionMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
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
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ningun elemento ha sido seleccionado");
            }
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void BtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseClicked
        try {
            if (JOptionPane.showConfirmDialog(this, "¿Desea guardar los datos antes de salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));//primer tipo extension
                selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));//segundo tipo de extension
                if (selecArchivo.showDialog(null, "Exportar") == JFileChooser.APPROVE_OPTION) {
                    archivo = selecArchivo.getSelectedFile();
                    if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                        JOptionPane.showMessageDialog(null, Inicio.modeloE.Exportar(archivo, this.tabla) + "\n Formato ." + archivo.getName().substring(archivo.getName().lastIndexOf(".") + 1));
                        System.exit(0);
                    }
                }
            } else {
                System.exit(0);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnExitMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.JPanelRound Background;
    public LIB.JEImagePanel BtnExit;
    private LIB.JEImagePanel ImgProcesos;
    private javax.swing.JScrollPane MarcoTabla;
    private javax.swing.JLabel TxtProcesos;
    private LIB.JPanelTransparente Working_Area;
    private LIB.FSButtonMD btnAgregar;
    private LIB.FSButtonMD btnAgregarFinal;
    private LIB.FSButtonMD btnAgregarPosicion;
    private LIB.FSButtonMD btnAgregarValor;
    private LIB.FSButtonMD btnEliminarSeleccion;
    public LIB.FSButtonMD btnExportar;
    public LIB.FSButtonMD btnImportar;
    private LIB.FSButtonMD btnModificar;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public rojerusan.RSTableMetro tabla;
    public LIB.FSTexFieldMD txtCantidad;
    public LIB.FSTexFieldMD txtCodigo;
    public LIB.FSTexFieldMD txtNombre;
    public LIB.FSTexFieldMD txtPrecio;
    private javax.swing.JLabel txtTabla;
    // End of variables declaration//GEN-END:variables
}
