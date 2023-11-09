/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kien5
 */
public class QuanLiHD_ITF extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiHD_ITF
     */
    public QuanLiHD_ITF() {
        initComponents();
         setLocationRelativeTo(null);
    }
    public ArrayList<HoatDong_Class> dshd1 = new ArrayList<>();

    public void LoadFile() {
        try {
            FileInputStream fis = new FileInputStream("HoatDongQL.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            var resultList = (ArrayList) ois.readObject();
            dshd1 = resultList;
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void reset() {
        LoadFile();
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnNames = {"Mã HĐ", "Tên HĐ", "Nơi Diễn Ra", "Kinh Phí"};
        model.setColumnIdentifiers(columnNames);
        Object[][] rowData = new Object[dshd1.size()][7];
        for (int i = 0; i < dshd1.size(); i++) {
            rowData[i][0] = dshd1.get(i).getMaHD();
            rowData[i][1] = dshd1.get(i).getTenHD();
            rowData[i][2] = dshd1.get(i).getNoiDienRa();
            rowData[i][3] = dshd1.get(i).getKinhPhiHD();
        }
        model.setDataVector(rowData, columnNames);
        this.table.setModel(model);
        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtTenHD = new javax.swing.JTextField();
        txtNoitochuc = new javax.swing.JTextField();
        txtkinhphi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbx_Tim = new javax.swing.JComboBox<>();
        btn_Tim = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã HĐ");

        jLabel2.setText("Tên HĐ");

        jLabel3.setText("Nơi Diễn Ra");

        jLabel4.setText("Kinh Phí");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Tên HĐ", "Nơi Diễn Ra", "Kinh Phí"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel5.setText("Tìm kiếm theo");

        cbx_Tim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã HĐ", "Tên HĐ", "Nơi Diễn Ra" }));

        btn_Tim.setText("Tìm");
        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimActionPerformed(evt);
            }
        });

        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(txtTenHD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoitochuc)
                            .addComponent(txtkinhphi))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Tim)
                        .addGap(208, 208, 208))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Them)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbx_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Tim))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoitochuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtkinhphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_Reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Thoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
        reset();
    }//GEN-LAST:event_tableAncestorAdded

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.rowAtPoint(evt.getPoint());
        String MaHD = (String) table.getValueAt(row, 0);
        String TenHD = (String) table.getValueAt(row, 1);
        String NoiDienRa = (String) table.getValueAt(row, 2);
        long KinhPhi = (long) table.getValueAt(row, 3);
        txtMaHD.setText(MaHD);
        txtTenHD.setText(TenHD);
        txtNoitochuc.setText(NoiDienRa);
        txtkinhphi.setText(String.valueOf(KinhPhi));

    }//GEN-LAST:event_tableMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        LoadFile();
        String MaHD = txtMaHD.getText();
        String TenHD = txtTenHD.getText();
        String NoiDienRa = txtNoitochuc.getText();
        String KinhPhiHD = txtkinhphi.getText();
        long KinhPhiHD1 = 0;
        if (MaHD.isEmpty() || TenHD.isEmpty() || NoiDienRa.isEmpty() || KinhPhiHD.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống 1 trong các danh mục");
        } else {
            boolean check1 = false;
            try {
                KinhPhiHD1 = Long.parseLong(KinhPhiHD);
                check1 = true;

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "Kinh phí phải là 1 con số");
            }
            if (check1) {
                boolean check = false;
                for (HoatDong_Class item : dshd1) {
                    if (item.getMaHD().equals(MaHD)) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    JOptionPane.showMessageDialog(rootPane, "Không đc trùng mã hđ trước đó");
                } else {
                    dshd1.add(new HoatDong_Class(MaHD, TenHD, NoiDienRa, KinhPhiHD1));

                    try {
                        FileOutputStream fos = new FileOutputStream("HoatDongQL.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(dshd1);
                        oos.close();
                        fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    reset();
                    JOptionPane.showMessageDialog(rootPane, "Them Thanh Cong");
                }
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed

        LoadFile();
        String MaHD = txtMaHD.getText();
        String TenHD = txtTenHD.getText();
        String NoiDienRa= txtNoitochuc.getText();
        String KinhPhi = txtkinhphi.getText();
        long KinhPhi1 = 0;
        boolean check = false;
        for (HoatDong_Class item : dshd1) {
            if (item.getMaHD().equals(MaHD)) {
                check = true;
                break;
            }

        }
        if (!check) {
            JOptionPane.showMessageDialog(rootPane, "Trùng 1 mã hoạt dộng");

        } else {
            if (MaHD.isEmpty() || TenHD.isEmpty() || KinhPhi.isEmpty() || NoiDienRa.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không được để trống 1 trong các dữ liệu");
            } else {
                boolean check1 = false;
                try {
                    KinhPhi1 = Long.parseLong(KinhPhi);
                    check1 = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPane, " Kinh phí phải là 1 con số");
                }
                if(check1){
                    for (HoatDong_Class item : dshd1) {
                        if (item.getMaHD().equals(MaHD)) {
                            item.TenHD = TenHD;
                            item.NoiDienRa = NoiDienRa;
                            item.KinhPhiHD = KinhPhi1;
                            break;
                        }
                    }
                    try {
                        FileOutputStream fos = new FileOutputStream("HoatDongQL.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(dshd1);
                        oos.close();
                        fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    reset();
                    JOptionPane.showMessageDialog(rootPane, "Sua Thanh Cong");
                }
            }
        }
        
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txtMaHD.setText("");
        txtTenHD.setText("");
        txtNoitochuc.setText("");
        txtkinhphi.setText("");
        reset();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_TimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimActionPerformed
        LoadFile();
        String MaHD = txtMaHD.getText();
        String TenHD = txtTenHD.getText();
//        String NoiDienRa = txtNoitochuc.getText();
//        long KinhPhiHD = Long.parseLong(txtkinhphi.getText());
        int chon = cbx_Tim.getSelectedIndex();
        if (chon == 0 || chon == -1) {
            if (MaHD.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Mã HĐ ko dc để trống");
            } else {
                boolean check = false;
                for (HoatDong_Class tim : dshd1) {
                    if (tim.getMaHD().equals(MaHD)) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    JOptionPane.showMessageDialog(rootPane, "Không tìm thấy Mã HĐ");
                } else {
                    ArrayList<HoatDong_Class> ds = new ArrayList<>();
                    for (HoatDong_Class tim : dshd1) {
                        if (tim.getMaHD().equals(MaHD)) {
                            ds.add(tim);
                        }
                    }
                    JTable table = new JTable();
                    DefaultTableModel model = new DefaultTableModel();
                    Object[] columnNames = {"Mã HĐ", "Tên HĐ", "Nơi Diễn Ra", "Kinh Phí"};
                    model.setColumnIdentifiers(columnNames);
                    Object[][] rowData = new Object[dshd1.size()][7];
                    for (int i = 0; i < ds.size(); i++) {
                        rowData[i][0] = ds.get(i).getMaHD();
                        rowData[i][1] = ds.get(i).getTenHD();
                        rowData[i][2] = ds.get(i).getNoiDienRa();
                        rowData[i][3] = ds.get(i).getKinhPhiHD();
                    }
                    model.setDataVector(rowData, columnNames);
                    this.table.setModel(model);
                    this.add(new JScrollPane(table));
                    this.pack();
                    this.setVisible(true);
                }
            }
        } else if (chon == 1) {
            if (TenHD.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "KHông đc để trống tên hđ");
            } else {
                boolean check = false;
                for (HoatDong_Class item : dshd1) {
                    if (item.getTenHD().equals(TenHD)) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    JOptionPane.showMessageDialog(rootPane, "KHông tìm thấy tên hđ");
                } else {
                    ArrayList<HoatDong_Class> ds = new ArrayList<>();
                    for (HoatDong_Class tim : dshd1) {
                        if (tim.getTenHD().equals(TenHD)) {
                            ds.add(tim);
                        }
                    }
                    JTable table = new JTable();
                    DefaultTableModel model = new DefaultTableModel();
                    Object[] columnNames = {"Mã HĐ", "Tên HĐ", "Nơi Diễn Ra", "Kinh Phí"};
                    model.setColumnIdentifiers(columnNames);
                    Object[][] rowData = new Object[dshd1.size()][7];
                    for (int i = 0; i < ds.size(); i++) {
                        rowData[i][0] = ds.get(i).getMaHD();
                        rowData[i][1] = ds.get(i).getTenHD();
                        rowData[i][2] = ds.get(i).getNoiDienRa();
                        rowData[i][3] = ds.get(i).getKinhPhiHD();
                    }
                    model.setDataVector(rowData, columnNames);
                    this.table.setModel(model);
                    this.add(new JScrollPane(table));
                    this.pack();
                    this.setVisible(true);
                }
            }
        } else if (chon == 2) {
            String NoiDienRa = txtNoitochuc.getText();
            if (NoiDienRa.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "KHông đc để trống noi dien ra");
            } else {
                boolean check = false;
                for (HoatDong_Class item : dshd1) {
                    if (item.getNoiDienRa().equals(NoiDienRa)) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    JOptionPane.showMessageDialog(rootPane, "KHông tìm thấy noi diễn ra");
                } else {
                    ArrayList<HoatDong_Class> ds = new ArrayList<>();
                    for (HoatDong_Class tim : dshd1) {
                        if (tim.getNoiDienRa().equals(NoiDienRa)) {
                            ds.add(tim);
                        }
                    }
                    JTable table = new JTable();
                    DefaultTableModel model = new DefaultTableModel();
                    Object[] columnNames = {"Mã HĐ", "Tên HĐ", "Nơi Diễn Ra", "Kinh Phí"};
                    model.setColumnIdentifiers(columnNames);
                    Object[][] rowData = new Object[dshd1.size()][7];
                    for (int i = 0; i < ds.size(); i++) {
                        rowData[i][0] = ds.get(i).getMaHD();
                        rowData[i][1] = ds.get(i).getTenHD();
                        rowData[i][2] = ds.get(i).getNoiDienRa();
                        rowData[i][3] = ds.get(i).getKinhPhiHD();
                    }
                    model.setDataVector(rowData, columnNames);
                    this.table.setModel(model);
                    this.add(new JScrollPane(table));
                    this.pack();
                    this.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btn_TimActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn Thoát?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            // Người dùng chọn YES
            MenuForm a = new MenuForm();
            a.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        
        LoadFile();
        String MaHD = txtMaHD.getText();
        String TenHD = txtTenHD.getText();
        String NoiDienRa= txtNoitochuc.getText();
        String KinhPhi = txtkinhphi.getText();
        long KinhPhi1 = 0;
        boolean check = false;
        for (HoatDong_Class item : dshd1) {
            if (item.getMaHD().equals(MaHD)) {
                check = true;
                break;
            }

        }
        if (!check) {
            JOptionPane.showMessageDialog(rootPane, "Trùng 1 mã hoạt dộng");

        } else {
            if (MaHD.isEmpty() || TenHD.isEmpty() || KinhPhi.isEmpty() || NoiDienRa.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Không được để trống 1 trong các dữ liệu");
            } else {
                boolean check1 = false;
                try {
                    KinhPhi1 = Long.parseLong(KinhPhi);
                    check1 = true;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPane, " Kinh phí phải là 1 con số");
                }
                if(check1){
                    for (HoatDong_Class item : dshd1) {
                        if (item.getMaHD().equals(MaHD)) {
                            dshd1.remove(item);
                            break;
                        }
                    }
                    try {
                        FileOutputStream fos = new FileOutputStream("HoatDongQL.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(dshd1);
                        oos.close();
                        fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    reset();
                    JOptionPane.showMessageDialog(rootPane, "Xoa Thanh Cong");
                }
            }
        }
        
    }//GEN-LAST:event_btn_XoaActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiHD_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiHD_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiHD_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiHD_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiHD_ITF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Tim;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbx_Tim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNoitochuc;
    private javax.swing.JTextField txtTenHD;
    private javax.swing.JTextField txtkinhphi;
    // End of variables declaration//GEN-END:variables
}
