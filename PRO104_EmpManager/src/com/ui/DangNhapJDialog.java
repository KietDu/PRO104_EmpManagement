package com.ui;

import java.awt.Toolkit;
import java.sql.ResultSet;
import com.dao.NhanVienDAO;
import com.helper.DialogHelper;
import com.helper.ShareHelper;
import com.model.NhanVien;
import java.awt.event.KeyEvent;

public final class DangNhapJDialog extends javax.swing.JDialog {

    private java.awt.Frame _mainJFrame;

    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.init();
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
        _mainJFrame = parent;
    }

    @SuppressWarnings("unchecked")
    String userName = "sa";
    String password = "123";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=Polypro";
    ResultSet rs;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 255));

        pnlForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Secure.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 153, 0));
        lblTitle.setText("ĐĂNG NHẬP");

        lblMaNV.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(102, 102, 255));
        lblMaNV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaNV.setText("Tên đăng nhập");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaNVKeyPressed(evt);
            }
        });

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblMatKhau.setForeground(new java.awt.Color(102, 102, 255));
        lblMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMatKhau.setText("Password");

        txtMatKhau.setToolTipText("");
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        btnDangNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/Login-icon-24.png"))); // NOI18N
        btnDangNhap.setText("Login");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polypro/icon/exit-icon-24.png"))); // NOI18N
        btnKetThuc.setText("Cancel");
        btnKetThuc.setToolTipText("");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle)
                            .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))
                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(pnlForm, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.login();
        }
    }//GEN-LAST:event_txtMaNVKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.login();
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        this.login();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        this.exit();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNVActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
 NhanVienDAO dao = new NhanVienDAO();

    void init() {
        setLocationRelativeTo(null);
    }

    void login() {
        String manv = txtMaNV.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        try {
            NhanVien nhanVien = dao.findById(manv);
            if (nhanVien != null) {
                String matKhau2 = nhanVien.getMatKhau();
                if (matKhau.equals(matKhau2)) {
                    ShareHelper.USER = nhanVien;
                    //DialogHelper.alert(this, "Đăng nhập thành công!");
                    this.dispose();
                    _mainJFrame.setVisible(true);
                } else {
                    DialogHelper.alert(this, "Sai mật khẩu!");
                }
            } else {
                DialogHelper.alert(this, "Sai tên đăng nhập!");
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void exit() {
        if (DialogHelper.confirm(this, "Bạn có muốn thoát khỏi ứng dụng không?")) {
            System.exit(0);
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/polypro/icon/Register-icon.png")));
    }
}
