
package Vistas;
import Modelo.ClienteDAO;
import Modelo.ProductoDAO;
import Modelo.VentasDAO;
import Modelo.Cliente;
import Modelo.Producto;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Modelo.Ventas;
import java.util.ArrayList;
import Modelo.DetalleVentas;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
public class VentasForm extends javax.swing.JInternalFrame {
    
    ProductoDAO pdao = new ProductoDAO();
    VentasDAO vdao=new VentasDAO();
    ClienteDAO cdao = new ClienteDAO();
    
    Producto p = new Producto();
    Ventas v = new Ventas();
    DetalleVentas  dv = new DetalleVentas();
    Cliente cliente = new Cliente();
    
    int idp=0;
    int cant=0;
    double precio;
    double tpagar;
    
    DefaultTableModel modelo=new DefaultTableModel();
    
    public VentasForm() {
        initComponents();
        generarNumeroBoleta();
       fecha();
        
    }
    //metodo para agregar la fecha al txtfieldfechaventa
    void fecha(){
        Calendar calendar = new GregorianCalendar();
        txtfechaventa.setText(""+calendar.get(calendar.YEAR)+"-"+(calendar.get(calendar.MONTH)+1)+"-"+calendar.get(calendar.DAY_OF_MONTH));
    }
 //metodo para mostrar el numero de boleta 
    void generarNumeroBoleta(){
        String serie=vdao.NumeroBoleta();
        if (serie==null) {
            txtNumeroBoleta.setText("00001");
        } else{
            int increment=Integer.parseInt(serie);
            increment=increment+1;
            txtNumeroBoleta.setText("0000"+increment);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNumeroBoleta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCodigoCliente = new javax.swing.JTextField();
        txtEmpleado = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        txtProducto = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtCodigoProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        SpinCantidad = new javax.swing.JSpinner();
        btnAgregarVenta = new javax.swing.JButton();
        txtfechaventa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnCancelarventa = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();

        setClosable(true);
        setTitle("Sistema Ventas");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeroBoleta.setEditable(false);
        txtNumeroBoleta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero de Boleta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 0, 255))); // NOI18N
        jPanel2.add(txtNumeroBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 167, 75));

        jLabel3.setText("Telefono 945-926-648");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 320, -1));

        jLabel2.setText("Venta de todo producto tecnologicos");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SECCION  VENTAS \"Importaciones Impacto\"");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 48));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gow.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 250, 190));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo de cliente"));
        jPanel3.add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 159, 52));

        txtEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        jPanel3.add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 130, 50));

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 84, 53));

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 6, 84, 50));

        txtProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));
        jPanel3.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 275, 52));

        txtCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel3.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 275, 52));

        txtCodigoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo de Producto"));
        jPanel3.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 86, 159, 62));

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 159, 62));

        txtStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Stock"));
        jPanel3.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 159, 62));

        SpinCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jPanel3.add(SpinCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 160, 70));

        btnAgregarVenta.setText("agregar venta");
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 140, 60));

        txtfechaventa.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha venta"));
        jPanel3.add(txtfechaventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 130, 60));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnCancelarventa.setText("Cancelar");
        btnCancelarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarventaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        txtTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Total a pagar"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnCancelarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Cod", "Producto", "Cantidad", "Precio unitario", "importe"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarventaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
    buscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
     buscarProducto();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
       agregarProducto();
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
if(txtTotal.getText().equals("")){
    JOptionPane.showMessageDialog(this, "Debe ingresar los datos");
    
}else{
    guardarVenta();
     guardarDetalle();
     actualizarStock() ;
     generarNumeroBoleta();
     JOptionPane.showMessageDialog(this, "Se realizo la venta con exito");
     
     nuevo();
}
     
    }//GEN-LAST:event_btnGenerarVentaActionPerformed
    
    
    void nuevo(){
        limpiarTabla();
        txtCliente.setText("");
        txtCodigoCliente.setText("");
        txtCodigoProducto.setText("");
        SpinCantidad.setValue(1);
        txtProducto.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtTotal.setText("");
        txtCodigoCliente.requestFocus();
        
    }
    
void limpiarTabla(){
    
    for (int i = 0; i <modelo.getRowCount(); i++) {     
        modelo.removeRow(i);
        i=i-1;
        
    }
}


//metodo para capturar la cantidad de cada producto que se agrega al detalle de la venta
    //y para restar la cantidad vendida en el detalle obtenido
    void actualizarStock(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            
            idp=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            p=pdao.listarID(idp);
            int sp=p.getStock()-cant;
            pdao.actualizarStock(sp,idp);
        }
        
    }



//metodo para agregar los datos a la tabla ventas de la base de datos
    void guardarVenta(){
        int idv=1;
        int idc=cliente.getId();
        String serie=txtNumeroBoleta.getText();
        String fecha=txtfechaventa.getText();
        double monto=tpagar;
        String estado="1";
        
        v.setIdCliente(idc);
        v.setIdEmpleado(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
        
    }
    //metodo para agregar los datos a la tabla detalle_ventas de la base de datos
    void guardarDetalle(){
        String idv=vdao.IdVentas();
        int idve= Integer.parseInt(idv);
    
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            int idps=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            int cants=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());     
            double pre=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idps);
            dv.setCantidad(cants);
            dv.setPreVenta(pre);
            vdao.GuardarDetalleVentas(dv);
        }
        
        
    }
    //metodo para agregar producto
    void  agregarProducto(){
    double total;
    int item=0;
    modelo=(DefaultTableModel)TablaDetalle.getModel();
     item=item+1;
     idp=p.getIdPro();
     String nomp=txtProducto.getText();
      precio=Double.parseDouble(txtPrecio.getText());
      cant=Integer.parseInt(SpinCantidad.getValue().toString());
     total=cant*precio;
     int stock=Integer.parseInt(txtStock.getText());
    ArrayList lista = new ArrayList();
    if(stock>0){
        lista.add(item);
        lista.add(txtCodigoProducto.getText());
        lista.add(nomp);
        lista.add(cant);
        lista.add(precio);
        lista.add(total);
        Object[] ob = new Object[6];
        ob[0]=lista.get(0);
        ob[1]=lista.get(1);
        ob[2]=lista.get(2);
        ob[3]=lista.get(3);
        ob[4]=lista.get(4);
        ob[5]=lista.get(5);
         modelo.addRow(ob);
        TablaDetalle.setModel(modelo);
        calcularTotal();
    }else{
        JOptionPane.showMessageDialog(this,"Stock producto no disponible");
    }
}
    //metodo que calcula el total de la venta 
void calcularTotal(){
    tpagar=0;
    for (int i = 0; i <TablaDetalle.getRowCount(); i++) {
        cant=Integer.parseInt(TablaDetalle.getValueAt(i,3).toString());
        precio=Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
        tpagar=tpagar+(cant*precio);
    }
    txtTotal.setText(""+tpagar+"0");
}
//metodo que busca un producto
    void buscarProducto(){
    int id=Integer.parseInt(txtCodigoProducto.getText());
    if (txtCodigoProducto.getText().equals("")) {
        JOptionPane.showMessageDialog(this,"Debe ingresar el codigo de producto");        
    }else{
        Producto p = pdao.listarID(id);
        if(p.getIdPro()!=0){
            txtProducto.setText(p.getNom());
            txtPrecio.setText(""+p.getPrecio());
            txtStock.setText(""+p.getStock());
        }else{
            JOptionPane.showMessageDialog(this,"Producto no registrado");
         txtCodigoProducto.requestFocus();
        }
    }
}
    void buscarCliente(){
        int r;
     String cod=txtCodigoCliente.getText();
        if (txtCodigoCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar cod cliente");                      
        }else{
           cliente =cdao.listaID(cod);
         if(cliente.getDni()!=null){
             txtCliente.setText(cliente.getNom());
             txtCodigoProducto.requestFocus();
             
         }else{
            r=JOptionPane.showConfirmDialog(this, "cliente no registrado, desea registrar?");
                if(r==0){
                    ClienteForm cf = new ClienteForm();
                    Menu.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                    
                } 
         }   
        }
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinCantidad;
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnAgregarVenta;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelarventa;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtNumeroBoleta;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtfechaventa;
    // End of variables declaration//GEN-END:variables
}
