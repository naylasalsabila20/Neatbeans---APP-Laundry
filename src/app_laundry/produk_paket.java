/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_laundry;

/**
 *
 * @author WINDOWS10
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class produk_paket extends javax.swing.JFrame {

    /**
     * Creates new form produk_paket
     */
    Connection con;
    DefaultTableModel tm;
    
    public void connect(){
        con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db_laundry", "root", "");
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
    }
    
    public void tampil_tabel(){
        tm=new DefaultTableModel(null, new Object[] {"Id Paket", "Jenis", "Nama Produk", "Harga"});
        tblproduk.setModel(tm);
        tm.getDataVector().removeAllElements();
        try{
            PreparedStatement s=con.prepareStatement("SELECT * FROM tb_paket");
            ResultSet r=s.executeQuery();
            while(r.next()){
                Object[] data= {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4)
                };
                tm.addRow(data);
            }
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
    }
    public produk_paket() {
        initComponents();
        connect();
        tampil_tabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtidpaket = new javax.swing.JTextField();
        cbjenis = new javax.swing.JComboBox<>();
        txtnmjenis = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduk = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA PRODUK / PAKET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 330, 60));
        jPanel1.add(txtidpaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 199, 410, 44));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kiloan", "selimut", "bed_cover", "kaos", "lainnya" }));
        jPanel1.add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 261, 336, 44));
        jPanel1.add(txtnmjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 335, 410, 50));
        jPanel1.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 406, 410, 49));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Id Paket");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 103, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Jenis");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 65, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nama Paket");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 344, 126, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Harga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        tblproduk.setModel(new javax.swing.table.DefaultTableModel(
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
        tblproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblproduk);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 510, 160));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/floppy-disk.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 120, 39));

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/P.png"))); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 120, 39));

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/delete.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 150, 40));

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/exit.png"))); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 500, 120, 39));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/Frame Sky Light Backdrop Background.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/Frame Sky Light Backdrop Background.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 650, 90));
        jPanel1.add(cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 410, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cari");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 80, 30));

        txtcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/search.png"))); // NOI18N
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_laundry/lont.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 770, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement ps=con.prepareStatement("INSERT INTO tb_paket VALUES (?,?,?,?)");
            ps.setString(1, txtidpaket.getText());
            ps.setString(2, cbjenis.getSelectedItem().toString());
            ps.setString(3, txtnmjenis.getText());
            ps.setString(4, txtharga.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data telah terSimpan");
            tampil_tabel();
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            PreparedStatement ps=con.prepareStatement("UPDATE tb_paket SET jenis=?, nama_paket=?, harga=? WHERE id_paket=?");
            ps.setString(1, cbjenis.getSelectedItem().toString());
            ps.setString(2, txtnmjenis.getText());
            ps.setString(3,  txtharga.getText());
            ps.setString(4,  txtidpaket.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data telah di updete");
            tampil_tabel();
        } catch(Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n" +e+ "\n\n");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null, "Apakah anda yakin='" + txtidpaket.getText() + "'", "Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            try{
                PreparedStatement ps=con.prepareStatement("DELETE FROM tb_paket WHERE id_paket=?");
                ps.setString(1, txtidpaket.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data telah terHapus");
                tampil_tabel();
            } catch(Exception e){
                System.out.print("ERROR KUERI KE DATAABASE:\n" +e+ "\n\n");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprodukMouseClicked
        // TODO add your handling code here:
        int i=tblproduk.getSelectedRow();
        if(i==-1){
            return;
        }
        String Idpaket=(String) tm.getValueAt(i, 0);
        txtidpaket.setText(Idpaket);
        String Jenis=(String) tm.getValueAt(i, 1);
        cbjenis.setSelectedItem(Jenis);
        String Nmjenis=(String) tm.getValueAt(i, 2);
        txtnmjenis.setText(Nmjenis);
        String Harga=(String) tm.getValueAt(i, 3);
        txtharga.setText(Harga);
    }//GEN-LAST:event_tblprodukMouseClicked

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
           tm = new DefaultTableModel (null,
        new Object[] {"Id Paket","Jenis","Nama Paket","Harga"});
        tblproduk.setModel(tm);
        tm.getDataVector().removeAllElements();
        try
        {
            PreparedStatement s=con.prepareStatement("SELECT * from tb_paket where nama_paket LIKE '%"+cr.getText().toString()+"%'");
            ResultSet r=s.executeQuery();
            while(r.next())
            {
                Object[]data={
                r.getString(1),
                r.getString(2),
                r.getString(3),
                r.getString(4)};
                tm.addRow(data);
            }
            }
        catch (Exception e){
            System.out.print("ERROR KUERI KE DATABASE:\n"+e+"\n\n");
        }
    }//GEN-LAST:event_txtcariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(produk_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(produk_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(produk_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(produk_paket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new produk_paket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JTextField cr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblproduk;
    private javax.swing.JButton txtcari;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidpaket;
    private javax.swing.JTextField txtnmjenis;
    // End of variables declaration//GEN-END:variables
}
