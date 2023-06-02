
package vista;


import com.itextpdf.text.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Detalle;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Venta;
import modelo.VentaDAO;




public class Principal extends javax.swing.JFrame {
    int xMouse, yMouse;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    ProductosDAO proDAO = new ProductosDAO();
    Productos pro = new Productos();
    Venta v = new Venta();
    VentaDAO VDAO = new VentaDAO();
    Detalle Dv = new Detalle();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    public void listarProductosT(){
        List<Productos> Listarpro =proDAO.listarProductosT();
        modelo = (DefaultTableModel) TablaProductos.getModel(); 
        Object[] ob = new Object[4];
        for(int i=0; i<Listarpro.size(); i++){
            ob[0] = Listarpro.get(i).getID();
            ob[1] = Listarpro.get(i).getNombre();
            ob[2] = Listarpro.get(i).getPrecio();
            ob[3] = Listarpro.get(i).getIcon();
            modelo.addRow(ob);
        }
        TablaProductos.setModel(modelo);
    }
    public void listarProductosM(){
        List<Productos> Listarpro =proDAO.listarProductosM();
        modelo = (DefaultTableModel) TablaProductos.getModel(); 
        Object[] ob = new Object[4];
        for(int i=0; i<Listarpro.size(); i++){
            ob[0] = Listarpro.get(i).getID();
            ob[1] = Listarpro.get(i).getNombre();
            ob[2] = Listarpro.get(i).getPrecio();
            ob[3] = Listarpro.get(i).getIcon();
            modelo.addRow(ob);
        }
        TablaProductos.setModel(modelo);
    }
    public void listarProductosA(){
        List<Productos> Listarpro =proDAO.listarProductosA();
        modelo = (DefaultTableModel) TablaProductos.getModel(); 
        Object[] ob = new Object[4];
        for(int i=0; i<Listarpro.size(); i++){
            ob[0] = Listarpro.get(i).getID();
            ob[1] = Listarpro.get(i).getNombre();
            ob[2] = Listarpro.get(i).getPrecio();
            ob[3] = Listarpro.get(i).getIcon();
            modelo.addRow(ob);
        }
        TablaProductos.setModel(modelo);
    }
    public void listarProductosD(){
        List<Productos> Listarpro =proDAO.listarProductosD();
        modelo = (DefaultTableModel) TablaProductos.getModel(); 
        Object[] ob = new Object[4];
        for(int i=0; i<Listarpro.size(); i++){
            ob[0] = Listarpro.get(i).getID();
            ob[1] = Listarpro.get(i).getNombre();
            ob[2] = Listarpro.get(i).getPrecio();
            ob[3] = Listarpro.get(i).getIcon();
            modelo.addRow(ob);
        }
        TablaProductos.setModel(modelo);
    }
    public void listarProductosAll(){
        List<Productos> Listarpro =proDAO.listarProductosAll();
        modelo = (DefaultTableModel) TablaProductos.getModel(); 
        Object[] ob = new Object[4];
        for(int i=0; i<Listarpro.size(); i++){
            ob[0] = Listarpro.get(i).getID();
            ob[1] = Listarpro.get(i).getNombre();
            ob[2] = Listarpro.get(i).getPrecio();
            ob[3] = Listarpro.get(i).getIcon();
            modelo.addRow(ob);
        }
        TablaProductos.setModel(modelo);
    }
    public void BuscarPro(String cod){
        String codi = cod;
        List<Productos> Listarpro =(List<Productos>) proDAO.BuscarPro(codi);
        modelo = (DefaultTableModel) TablaProductos.getModel(); 
        Object[] ob = new Object[4];
        for(int i=0; i<Listarpro.size(); i++){
                ob[0] = Listarpro.get(i).getID();
                ob[1] = Listarpro.get(i).getNombre();
                ob[2] = Listarpro.get(i).getPrecio();
                ob[3] = Listarpro.get(i).getIcon();
            
            modelo.addRow(ob);
        }
        TablaProductos.setModel(modelo);
    }
    public void LimpiarTable(){
        for(int i= 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    public void RegistarVentaDetalle(){
        for (int i = 0; i < Tabla_Carrito.getRowCount(); i++) {
            
            int ID = Integer.parseInt(Tabla_Carrito.getValueAt(i, 0).toString()); 
            String producto = (String) Tabla_Carrito.getValueAt(i, 1); 
            double prec = Double.parseDouble(Tabla_Carrito.getValueAt(i, 2).toString());
            int cant = Integer.parseInt(Tabla_Carrito.getValueAt(i, 3).toString());     
            double total = Double.parseDouble(Tabla_Carrito.getValueAt(i, 4).toString()); 
            System.out.println(ID);
            System.out.println(producto);
            System.out.println(prec);
            System.out.println(cant);
            System.out.println(total);
            
            Dv.setID(ID);
            Dv.setProducto(producto);
            Dv.setPrecio(prec);
            Dv.setCantidad(cant);
            Dv.setTotal(total);
            VDAO.RegistarVentaDetalle(Dv);
            
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        Banner = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        Agregar_carrito = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Carrito = new javax.swing.JTable();
        Cantidad_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JPanel();
        Panel_Busqueda = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Barra_exit = new javax.swing.JPanel();
        Exit = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setForeground(new java.awt.Color(255, 255, 255));
        BackGround.setPreferredSize(new java.awt.Dimension(810, 520));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Banner.setBackground(new java.awt.Color(51, 51, 255));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shoppingadd.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shoppingverifi.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Agregar_carrito.setText("Agregar al Carrito");
        Agregar_carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_carritoActionPerformed(evt);
            }
        });

        Tabla_Carrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio", "Cantidad", "Total", "Icon"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Carrito);

        Cantidad_txt.setText("1");
        Cantidad_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad_txtActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad");

        javax.swing.GroupLayout BannerLayout = new javax.swing.GroupLayout(Banner);
        Banner.setLayout(BannerLayout);
        BannerLayout.setHorizontalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BannerLayout.createSequentialGroup()
                            .addComponent(jButton6)
                            .addContainerGap())
                        .addGroup(BannerLayout.createSequentialGroup()
                            .addComponent(Agregar_carrito)
                            .addGap(15, 15, 15)))
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cantidad_txt)
                        .addContainerGap())))
        );
        BannerLayout.setVerticalGroup(
            BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(BannerLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(BannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Agregar_carrito)))
                .addContainerGap())
        );

        BackGround.add(Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 560, 160));

        Busqueda.setBackground(new java.awt.Color(255, 255, 255));
        Busqueda.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Busqueda.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Busqueda.setForeground(new java.awt.Color(153, 153, 153));
        Panel_Busqueda.setText("Busqueda");
        Panel_Busqueda.setBorder(null);
        Panel_Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Panel_BusquedaMousePressed(evt);
            }
        });
        Panel_Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Panel_BusquedaActionPerformed(evt);
            }
        });
        Panel_Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Panel_BusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Panel_BusquedaKeyTyped(evt);
            }
        });
        Busqueda.add(Panel_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, 174, 43));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Busqueda32.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Busqueda48.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Busqueda.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 6, 53, 52));
        Busqueda.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 46, 174, 10));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basketball32.png"))); // NOI18N
        jButton1.setText("DEPORTE");
        jButton1.setBorder(null);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/basketball48.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Busqueda.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 260, 90));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/secador32.png"))); // NOI18N
        jButton2.setText("ASEO Y LIMPIEZA");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.setPreferredSize(new java.awt.Dimension(119, 32));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/secador48.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Busqueda.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 90));

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chef32.png"))); // NOI18N
        jButton3.setText("MERCADO");
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(119, 32));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chef48.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        Busqueda.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 90));

        jButton4.setBackground(new java.awt.Color(153, 255, 51));
        jButton4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/joystick32.png"))); // NOI18N
        jButton4.setText("TECNOLOGIA");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.setPreferredSize(new java.awt.Dimension(119, 32));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/joystick32.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/joystick48.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Busqueda.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 260, 90));

        BackGround.add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 260, 460));

        Barra_exit.setBackground(new java.awt.Color(255, 255, 255));
        Barra_exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_exitMouseDragged(evt);
            }
        });
        Barra_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_exitMousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setForeground(new java.awt.Color(255, 255, 255));

        ExitTxt.setBackground(new java.awt.Color(255, 255, 255));
        ExitTxt.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ExitTxt.setForeground(new java.awt.Color(0, 0, 0));
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Barra_exitLayout = new javax.swing.GroupLayout(Barra_exit);
        Barra_exit.setLayout(Barra_exitLayout);
        Barra_exitLayout.setHorizontalGroup(
            Barra_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_exitLayout.createSequentialGroup()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 770, Short.MAX_VALUE))
        );
        Barra_exitLayout.setVerticalGroup(
            Barra_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BackGround.add(Barra_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio", "Icon"
            }
        ));
        jScrollPane2.setViewportView(TablaProductos);

        BackGround.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 560, 327));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (Tabla_Carrito.getRowCount()>0){
            for (int i = 0; i < Tabla_Carrito.getRowCount(); i++) {
                //borro detalle de venta anterior, para generar una nueva compra
                VDAO.BorrarVenta();
                RegistarVentaDetalle();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Tabla sin datos");
        }
        User_Info c= new User_Info();
        c.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        LimpiarTable();
        listarProductosT();
    }//GEN-LAST:event_jButton4MouseClicked

    private void ExitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMousePressed

    }//GEN-LAST:event_ExitTxtMousePressed

    private void Barra_exitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_exitMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse , y - yMouse); 
    }//GEN-LAST:event_Barra_exitMouseDragged

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        Exit.setBackground(Color.red);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
        Exit.setBackground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void Panel_BusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_BusquedaMousePressed
        LimpiarTable();
        listarProductosAll();
        Panel_Busqueda.setText("");
        Panel_Busqueda.setForeground(Color.black);
    }//GEN-LAST:event_Panel_BusquedaMousePressed

    private void Panel_BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Panel_BusquedaActionPerformed
      
    }//GEN-LAST:event_Panel_BusquedaActionPerformed

    private void Barra_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_exitMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();  
    }//GEN-LAST:event_Barra_exitMousePressed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        LimpiarTable();
        listarProductosM();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        LimpiarTable();
        listarProductosA();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        LimpiarTable();
        listarProductosD();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void Agregar_carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_carritoActionPerformed

        int  FilaSeleccionada = TablaProductos.getSelectedRow();
        if(FilaSeleccionada!= -1){
            modelo2 = (DefaultTableModel) Tabla_Carrito.getModel();  
            String ID, Producto, Precio,Icon, Cant, Importe;
            double  x;
            ID=TablaProductos.getValueAt(FilaSeleccionada, 0).toString();
            Producto=TablaProductos.getValueAt(FilaSeleccionada, 1).toString();
            Precio=TablaProductos.getValueAt(FilaSeleccionada, 2).toString();
            Icon=TablaProductos.getValueAt(FilaSeleccionada, 3).toString();
            Cant=Cantidad_txt.getText();
            x = (Double.parseDouble(Precio)* Integer.parseInt(Cant));
            Importe= String.valueOf(x);
            String Datos[]= {ID, Producto, Precio, Cant ,Importe, Icon};
            Tabla_Carrito.setModel(modelo2);
            modelo2.addRow(Datos);

        }else{
            JOptionPane.showMessageDialog(this,"Error, elija producto");
        }
    }//GEN-LAST:event_Agregar_carritoActionPerformed

    private void Panel_BusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Panel_BusquedaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){            
                BuscarPro(Panel_Busqueda.getText());
                }
    }//GEN-LAST:event_Panel_BusquedaKeyPressed
    
    
    private void Panel_BusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Panel_BusquedaKeyTyped

    }//GEN-LAST:event_Panel_BusquedaKeyTyped

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void Cantidad_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cantidad_txtActionPerformed
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Agregar_carrito;
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel Banner;
    private javax.swing.JPanel Barra_exit;
    private javax.swing.JPanel Busqueda;
    private javax.swing.JTextField Cantidad_txt;
    private javax.swing.JPanel Exit;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JTextField Panel_Busqueda;
    private javax.swing.JTable TablaProductos;
    public javax.swing.JTable Tabla_Carrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
