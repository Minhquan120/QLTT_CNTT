/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooffe.kdq;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class From_Menu extends javax.swing.JFrame {

    /**
     * Creates new form From_BangHang
     */
    public From_Menu() {
        initComponents();
       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabMenu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnAmericano = new javax.swing.JButton();
        BtnCafeSua = new javax.swing.JButton();
        BtnCafeDen = new javax.swing.JButton();
        BtnCaramel = new javax.swing.JButton();
        BtnCoffeeLate = new javax.swing.JButton();
        BtnTiramisu = new javax.swing.JButton();
        BtnViennese = new javax.swing.JButton();
        BtnEspresso = new javax.swing.JButton();
        BtnMocCha = new javax.swing.JButton();
        BtnCoffeeCam = new javax.swing.JButton();
        BtnCappuchino = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnResetMon = new javax.swing.JButton();
        btnInphieu = new javax.swing.JButton();
        btnXoamon = new javax.swing.JButton();
        btnThanhTien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        JTabMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTabMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nước Uống", "Số Lượng", "Giá Tiền"
            }
        ));
        JTabMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTabMenu);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("COFFEE ĐKQ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        BtnAmericano.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnAmericano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/americano.jpg"))); // NOI18N
        BtnAmericano.setText("Americano");
        BtnAmericano.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAmericano.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAmericano.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnAmericano.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnAmericano.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnAmericano.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAmericanoActionPerformed(evt);
            }
        });

        BtnCafeSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCafeSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cafe sua lac.jpg"))); // NOI18N
        BtnCafeSua.setText("Cafe Sữa");
        BtnCafeSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCafeSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCafeSua.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnCafeSua.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnCafeSua.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnCafeSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCafeSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCafeSuaActionPerformed(evt);
            }
        });

        BtnCafeDen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCafeDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cafetruyenthong.jpg"))); // NOI18N
        BtnCafeDen.setText("Cafe Đen");
        BtnCafeDen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCafeDen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCafeDen.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnCafeDen.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnCafeDen.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnCafeDen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCafeDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCafeDenActionPerformed(evt);
            }
        });

        BtnCaramel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCaramel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/caramel macchiato.jpg"))); // NOI18N
        BtnCaramel.setText("Caramel");
        BtnCaramel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCaramel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCaramel.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnCaramel.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnCaramel.setOpaque(false);
        BtnCaramel.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnCaramel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCaramel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCaramelActionPerformed(evt);
            }
        });

        BtnCoffeeLate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCoffeeLate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cafe latte.jpg"))); // NOI18N
        BtnCoffeeLate.setText("Coffee Late");
        BtnCoffeeLate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCoffeeLate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCoffeeLate.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnCoffeeLate.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnCoffeeLate.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnCoffeeLate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCoffeeLate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoffeeLateActionPerformed(evt);
            }
        });

        BtnTiramisu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnTiramisu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cafe tiramisu .png"))); // NOI18N
        BtnTiramisu.setText("Tiramisu");
        BtnTiramisu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnTiramisu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTiramisu.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnTiramisu.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnTiramisu.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnTiramisu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnTiramisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTiramisuActionPerformed(evt);
            }
        });

        BtnViennese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnViennese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cappuccino viennese.jpg"))); // NOI18N
        BtnViennese.setText("Viennese");
        BtnViennese.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnViennese.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnViennese.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnViennese.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnViennese.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnViennese.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnViennese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVienneseActionPerformed(evt);
            }
        });

        BtnEspresso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnEspresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/espresso.jpg"))); // NOI18N
        BtnEspresso.setText("Espresso");
        BtnEspresso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEspresso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEspresso.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnEspresso.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnEspresso.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnEspresso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEspressoActionPerformed(evt);
            }
        });

        BtnMocCha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnMocCha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cafe mocha.jpg"))); // NOI18N
        BtnMocCha.setText("Moc Cha");
        BtnMocCha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMocCha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMocCha.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnMocCha.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnMocCha.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnMocCha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnMocCha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMocChaActionPerformed(evt);
            }
        });

        BtnCoffeeCam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCoffeeCam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cafecam.jpg"))); // NOI18N
        BtnCoffeeCam.setText("Coffee Cam");
        BtnCoffeeCam.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCoffeeCam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCoffeeCam.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnCoffeeCam.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnCoffeeCam.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnCoffeeCam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCoffeeCam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCoffeeCamActionPerformed(evt);
            }
        });

        BtnCappuchino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCappuchino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cappuccio.jpg"))); // NOI18N
        BtnCappuchino.setText("Cappuchino");
        BtnCappuchino.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCappuchino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCappuchino.setMaximumSize(new java.awt.Dimension(109, 83));
        BtnCappuchino.setMinimumSize(new java.awt.Dimension(109, 83));
        BtnCappuchino.setPreferredSize(new java.awt.Dimension(109, 83));
        BtnCappuchino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCappuchino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCappuchinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BtnCoffeeLate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtnTiramisu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtnViennese, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BtnAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtnCafeSua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BtnCafeDen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(393, 393, 393)
                            .addComponent(BtnCaramel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnMocCha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCoffeeCam, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCappuchino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCaramel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtnCafeDen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCafeSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnAmericano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCoffeeLate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnTiramisu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnViennese, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnEspresso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnMocCha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCoffeeCam, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCappuchino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tổng Tiền :");

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtTongTien))
                .addContainerGap())
        );

        btnResetMon.setText("Rest Món");
        btnResetMon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResetMon.setMaximumSize(new java.awt.Dimension(59, 21));
        btnResetMon.setMinimumSize(new java.awt.Dimension(59, 21));
        btnResetMon.setPreferredSize(new java.awt.Dimension(59, 21));
        btnResetMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetMonActionPerformed(evt);
            }
        });

        btnInphieu.setText("In Phiếu");
        btnInphieu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInphieu.setMaximumSize(new java.awt.Dimension(59, 21));
        btnInphieu.setMinimumSize(new java.awt.Dimension(59, 21));
        btnInphieu.setPreferredSize(new java.awt.Dimension(59, 21));
        btnInphieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInphieuActionPerformed(evt);
            }
        });

        btnXoamon.setText("Xóa Món");
        btnXoamon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoamon.setMaximumSize(new java.awt.Dimension(59, 21));
        btnXoamon.setMinimumSize(new java.awt.Dimension(59, 21));
        btnXoamon.setPreferredSize(new java.awt.Dimension(59, 21));
        btnXoamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoamonActionPerformed(evt);
            }
        });

        btnThanhTien.setText("Thành Tiền");
        btnThanhTien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoamon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResetMon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInphieu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInphieu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetMon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoamon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public void PhiMon(){
        double sum = 0;

        for (int i = 0; i < JTabMenu.getRowCount(); i++) {
            sum = sum + Double.parseDouble(JTabMenu.getValueAt(i, 2).toString());
        }
        txtTongTien.setText(Double.toString(sum));
        double Tongc = Double.parseDouble(txtTongTien.getText());

        String Tong = String.format(" %.3f", Tongc);
        txtTongTien.setText(Tong + " VNĐ");
    }
    public void GiaoDich(){
        double sum = 0;

        double cash = Double.parseDouble(txtTongTien.getText());
        for (int i = 0; i < JTabMenu.getRowCount(); i++) {
            sum = sum + Double.parseDouble(JTabMenu.getValueAt(i, 2).toString());
        }

        double GiaodichT = (cash);
        String menu = String.format(" %.3f", GiaodichT);
        txtTongTien.setText(menu);
    }
    
    
    private void BtnAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAmericanoActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 35;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Americano", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnAmericanoActionPerformed

    private void BtnCafeSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCafeSuaActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 28;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Cafe Sữa", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnCafeSuaActionPerformed

    private void BtnCafeDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCafeDenActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 22;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Cafe Truyền Thống", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnCafeDenActionPerformed

    private void BtnCaramelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCaramelActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 28;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Caramel", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnCaramelActionPerformed

    private void BtnCoffeeLateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoffeeLateActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 25;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Cafe Late", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnCoffeeLateActionPerformed

    private void BtnTiramisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTiramisuActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 40;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Tiramisu", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnTiramisuActionPerformed

    private void BtnVienneseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVienneseActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 32;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Viennese", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnVienneseActionPerformed

    private void BtnEspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEspressoActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 28;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Espresso", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnEspressoActionPerformed

    private void BtnMocChaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMocChaActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 30;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Coffee Mocha", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnMocChaActionPerformed

    private void BtnCoffeeCamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCoffeeCamActionPerformed
        // TODO add your handling code here:
         int PriceOfItem = 35;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Cafe Cam", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnCoffeeCamActionPerformed

    private void BtnCappuchinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCappuchinoActionPerformed
        // TODO add your handling code here:
        int PriceOfItem = 35;
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.addRow(new Object[]{"Cappuccino", "1", PriceOfItem});
        PhiMon();
    }//GEN-LAST:event_BtnCappuchinoActionPerformed

    private void btnXoamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoamonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        int RemoveItem = JTabMenu.getSelectedRow();
        if (RemoveItem >= 0) {
            model.removeRow(RemoveItem);
        }
        PhiMon();

        if (txtTongTien.equals("tiền mặt")) {
            GiaoDich();
        } else {
            
            txtTongTien.setText("");
            PhiMon();
        

        }
    }//GEN-LAST:event_btnXoamonActionPerformed

    private void btnInphieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInphieuActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Đang in");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try {
            JTabMenu.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Không thấy máy in", e.getMessage());
        }
    }//GEN-LAST:event_btnInphieuActionPerformed

    private void btnResetMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetMonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
        model.setRowCount(0);

        txtTongTien.setText("");
    }//GEN-LAST:event_btnResetMonActionPerformed

    private void btnThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhTienActionPerformed
        // TODO add your handling code here:
        if (txtTongTien.getText().equals("")) {
           JOptionPane.showMessageDialog(this, "Vui Lòng Chọn Món");
            GiaoDich();
        } else {
            DefaultTableModel model = (DefaultTableModel) JTabMenu.getModel();
            model.setRowCount(0);
            txtTongTien.setText("");
            JOptionPane.showMessageDialog(this, "Đã Thanh Toán Thành Công");
            
        }
    }//GEN-LAST:event_btnThanhTienActionPerformed

    private void JTabMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabMenuMouseClicked
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_JTabMenuMouseClicked

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
            java.util.logging.Logger.getLogger(From_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAmericano;
    private javax.swing.JButton BtnCafeDen;
    private javax.swing.JButton BtnCafeSua;
    private javax.swing.JButton BtnCappuchino;
    private javax.swing.JButton BtnCaramel;
    private javax.swing.JButton BtnCoffeeCam;
    private javax.swing.JButton BtnCoffeeLate;
    private javax.swing.JButton BtnEspresso;
    private javax.swing.JButton BtnMocCha;
    private javax.swing.JButton BtnTiramisu;
    private javax.swing.JButton BtnViennese;
    private javax.swing.JTable JTabMenu;
    private javax.swing.JButton btnInphieu;
    private javax.swing.JButton btnResetMon;
    private javax.swing.JButton btnThanhTien;
    private javax.swing.JButton btnXoamon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}