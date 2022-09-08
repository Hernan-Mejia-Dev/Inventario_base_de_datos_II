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
import logica.Lista;

public class FormularioLista extends javax.swing.JFrame {

    Lista Lista = new Lista();
    int contAction = 0;
    int pos = 0;
    boolean BtnDisponibles = true;
    String columnas[] = {"Posicion", "Codigo", "Nombre", "Precio", "Cantidad", "Total"};
    DefaultTableModel modelo;
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;

    public FormularioLista() {
        initComponents();
        InicializarColores();
        modelo = new DefaultTableModel(null, columnas);
        tabla.setModel(modelo);
        PanelTransparente.setVisible(false);
        //actualizamos el manager del sistema para que se utilice el del sistema donde se ejecuta y no el por defecto
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTransparente = new LIB.JPanelTransparente();
        Background = new LIB.JPanelRound();
        TxtProcesos = new javax.swing.JLabel();
        btnAgregar = new LIB.FSButtonMD();
        ImgProcesos = new LIB.JEImagePanel();
        btnAgregarValor = new LIB.FSButtonMD();
        btnAgregarFinal = new LIB.FSButtonMD();
        btnAgregarPosicion = new LIB.FSButtonMD();
        btnEliminarSeleccion = new LIB.FSButtonMD();
        btnModificar = new LIB.FSButtonMD();
        BtnExit = new LIB.JEImagePanel();
        Working_Area = new LIB.JPanelTransparente();
        txtCodigo = new LIB.FSTexFieldMD();
        txtNombre = new LIB.FSTexFieldMD();
        txtPrecio = new LIB.FSTexFieldMD();
        txtCantidad = new LIB.FSTexFieldMD();
        TxtWorkingArea = new javax.swing.JLabel();
        IconWorkingArea = new LIB.JEImagePanel();
        Codigo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        Small_Icon = new LIB.JEImagePanel();
        Big_Icon = new LIB.JEImagePanel();
        btnExportar = new LIB.FSButtonMD();
        btnImportar = new LIB.FSButtonMD();
        MarcoTabla = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        txtTabla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout PanelTransparenteLayout = new javax.swing.GroupLayout(PanelTransparente);
        PanelTransparente.setLayout(PanelTransparenteLayout);
        PanelTransparenteLayout.setHorizontalGroup(
            PanelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelTransparenteLayout.setVerticalGroup(
            PanelTransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        getContentPane().add(PanelTransparente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setColorPrimario(new java.awt.Color(255, 255, 255));
        Background.setColorSecundario(new java.awt.Color(102, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtProcesos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtProcesos.setForeground(new java.awt.Color(255, 255, 255));
        TxtProcesos.setText("PROCESOS");
        Background.add(TxtProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

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
        Background.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 162, -1));

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

        Background.add(ImgProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

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
        Background.add(btnAgregarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 162, -1));

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
        Background.add(btnAgregarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 162, -1));

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
        Background.add(btnAgregarPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 162, -1));

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
        Background.add(btnEliminarSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 162, -1));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
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
        Background.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 162, -1));

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

        Background.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, -1, -1));

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

        TxtWorkingArea.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtWorkingArea.setForeground(new java.awt.Color(255, 255, 255));
        TxtWorkingArea.setText("REGISTRO PRODUCTOS ");

        IconWorkingArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N

        javax.swing.GroupLayout IconWorkingAreaLayout = new javax.swing.GroupLayout(IconWorkingArea);
        IconWorkingArea.setLayout(IconWorkingAreaLayout);
        IconWorkingAreaLayout.setHorizontalGroup(
            IconWorkingAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        IconWorkingAreaLayout.setVerticalGroup(
            IconWorkingAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        Codigo.setForeground(new java.awt.Color(255, 255, 255));
        Codigo.setText("CODIGO");

        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("NOMBRE");

        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("PRECIO");

        Cantidad.setForeground(new java.awt.Color(255, 255, 255));
        Cantidad.setText("CANTIDAD");

        Small_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marco.png"))); // NOI18N

        javax.swing.GroupLayout Small_IconLayout = new javax.swing.GroupLayout(Small_Icon);
        Small_Icon.setLayout(Small_IconLayout);
        Small_IconLayout.setHorizontalGroup(
            Small_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        Small_IconLayout.setVerticalGroup(
            Small_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        Big_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/donacion-de-alimentos.png"))); // NOI18N

        javax.swing.GroupLayout Big_IconLayout = new javax.swing.GroupLayout(Big_Icon);
        Big_Icon.setLayout(Big_IconLayout);
        Big_IconLayout.setHorizontalGroup(
            Big_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        Big_IconLayout.setVerticalGroup(
            Big_IconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addGroup(Working_AreaLayout.createSequentialGroup()
                .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(IconWorkingArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(TxtWorkingArea))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Codigo))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Nombre))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Precio))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Cantidad))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Working_AreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Small_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Big_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Working_AreaLayout.setVerticalGroup(
            Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Working_AreaLayout.createSequentialGroup()
                .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(IconWorkingArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Codigo)
                        .addGap(12, 12, 12)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(Nombre)
                        .addGap(12, 12, 12)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(Precio)
                        .addGap(12, 12, 12)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Cantidad)
                        .addGap(12, 12, 12)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(Working_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(Big_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Working_AreaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(TxtWorkingArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Small_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        Background.add(Working_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

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

        Background.add(MarcoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 630, 280));

        txtTabla.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtTabla.setForeground(new java.awt.Color(255, 255, 255));
        txtTabla.setText(" PRODUCTOS INGRESADOS");
        Background.add(txtTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

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
            PanelTransparente.setVisible(true);
            EsconderTxtFields();
            VisualizarBtn(false);
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarInicio_LS(Llenado());
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                    PanelTransparente.setVisible(false);
                    VisualizarBtn(true);
                    HabilitarTxtFilds();
                    this.setEnabled(true);
                }
            } else {
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
                VisualizarBtn(true);
                this.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFinalMouseClicked
        if (BtnDisponibles == true) {
            PanelTransparente.setVisible(true);
            EsconderTxtFields();
            VisualizarBtn(false);
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarFinal_LS(Llenado());
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                }
            } else {
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
                VisualizarBtn(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarFinalMouseClicked

    private void btnAgregarPosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarPosicionMouseClicked
        if (BtnDisponibles == true) {
            PanelTransparente.setVisible(true);
            EsconderTxtFields();
            VisualizarBtn(false);
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarPosicion_LS(Llenado(), this);
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                }
            } else {
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
                VisualizarBtn(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarPosicionMouseClicked

    private void btnAgregarValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarValorMouseClicked
        if (BtnDisponibles == true) {
            PanelTransparente.setVisible(true);
            EsconderTxtFields();
            VisualizarBtn(false);
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.AgregarValor_LS(Llenado(), this);
                    Lista.mostrarLista(tabla);
                    PanelTransparente.setVisible(false);
                    limpiarCajasTexto();
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Los campos de texto se encuentran vacios");
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                }
            } else {
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
                VisualizarBtn(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnAgregarValorMouseClicked

    private void btnEliminarSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionMouseClicked
        if (BtnDisponibles == true) {
            PanelTransparente.setVisible(true);
            EsconderTxtFields();
            VisualizarBtn(false);
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    Lista.EliminarPosicion_LS(tabla);
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                } catch (Exception e) {
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    VisualizarBtn(true);
                }
            } else {
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
                VisualizarBtn(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los botones se encuentran bloqueados!");
        }
    }//GEN-LAST:event_btnEliminarSeleccionMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        PanelTransparente.setVisible(true);
        EsconderTxtFields();
        VisualizarBtn(false);
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea realizar este proceso?", "Confirmación",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                if (contAction == 0) {
                    if (Lista.ListaVacia() == false) {
                        pos = Lista.modificar(this, tabla);
                        HabilitarBotones(false);
                        contAction = 1;
                        PanelTransparente.setVisible(false);
                        HabilitarTxtFilds();
                        VisualizarBtn(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Lista Vacia!");
                    }
                } else if (contAction == 1) {
                    Lista.AgregarCambios(this, pos);
                    limpiarCajasTexto();
                    Lista.mostrarLista(tabla);
                    PanelTransparente.setVisible(false);
                    HabilitarTxtFilds();
                    HabilitarBotones(true);
                    VisualizarBtn(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ningun elemento ha sido seleccionado");
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
                VisualizarBtn(true);
            }
        } else {
            PanelTransparente.setVisible(false);
            HabilitarTxtFilds();
            VisualizarBtn(true);
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void BtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitMouseClicked
        try {
            PanelTransparente.setVisible(true);
            EsconderTxtFields();
            if (JOptionPane.showConfirmDialog(this, "¿Desea guardar los datos antes de salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                PanelTransparente.setVisible(false);
                HabilitarTxtFilds();
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
    private LIB.JEImagePanel Big_Icon;
    public LIB.JEImagePanel BtnExit;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Codigo;
    private LIB.JEImagePanel IconWorkingArea;
    private LIB.JEImagePanel ImgProcesos;
    private javax.swing.JScrollPane MarcoTabla;
    private javax.swing.JLabel Nombre;
    public LIB.JPanelTransparente PanelTransparente;
    private javax.swing.JLabel Precio;
    private LIB.JEImagePanel Small_Icon;
    private javax.swing.JLabel TxtProcesos;
    private javax.swing.JLabel TxtWorkingArea;
    private LIB.JPanelTransparente Working_Area;
    private LIB.FSButtonMD btnAgregar;
    private LIB.FSButtonMD btnAgregarFinal;
    private LIB.FSButtonMD btnAgregarPosicion;
    private LIB.FSButtonMD btnAgregarValor;
    private LIB.FSButtonMD btnEliminarSeleccion;
    public LIB.FSButtonMD btnExportar;
    public LIB.FSButtonMD btnImportar;
    private LIB.FSButtonMD btnModificar;
    public rojerusan.RSTableMetro tabla;
    public LIB.FSTexFieldMD txtCantidad;
    public LIB.FSTexFieldMD txtCodigo;
    public LIB.FSTexFieldMD txtNombre;
    public LIB.FSTexFieldMD txtPrecio;
    private javax.swing.JLabel txtTabla;
    // End of variables declaration//GEN-END:variables

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
        btnAgregarPosicion.setColorTextNormal(new Color(51, 51, 51));
        btnAgregarValor.setColorTextNormal(new Color(51, 51, 51));
        btnEliminarSeleccion.setColorTextNormal(new Color(51, 51, 51));
        btnModificar.setColorTextNormal(new Color(51, 51, 51));
    }

    public void EsconderTxtFields() {
        txtCodigo.setBackground(new Color(92, 97, 106));
        txtCodigo.setBordeColorFocus(new Color(92, 97, 106));
        txtNombre.setBackground(new Color(92, 97, 106));
        txtNombre.setBordeColorFocus(new Color(92, 97, 106));
        txtPrecio.setBackground(new Color(92, 97, 106));
        txtPrecio.setBordeColorFocus(new Color(92, 97, 106));
        txtCantidad.setBackground(new Color(92, 97, 106));
        txtCantidad.setBordeColorFocus(new Color(92, 97, 106));
    }

    public void HabilitarTxtFilds() {
        txtCodigo.setBackground(new Color(255, 255, 255));
        txtCodigo.setBordeColorFocus(new Color(51, 255, 255));
        txtNombre.setBackground(new Color(255, 255, 255));
        txtNombre.setBordeColorFocus(new Color(51, 255, 255));
        txtPrecio.setBackground(new Color(255, 255, 255));
        txtPrecio.setBordeColorFocus(new Color(51, 255, 255));
        txtCantidad.setBackground(new Color(255, 255, 255));
        txtCantidad.setBordeColorFocus(new Color(51, 255, 255));
    }

    public void VisualizarBtn(boolean x) {
        btnAgregar.setVisible(x);
        btnAgregarFinal.setVisible(x);
        btnAgregarPosicion.setVisible(x);
        btnAgregarValor.setVisible(x);
        btnEliminarSeleccion.setVisible(x);
        btnModificar.setVisible(x);
    }
}
