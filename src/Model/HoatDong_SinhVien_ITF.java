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
public class HoatDong_SinhVien_ITF extends javax.swing.JFrame {

    public HoatDong_SinhVien_ITF() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public ArrayList<HoatDong_Class> dshd1 = new ArrayList<>();
    public ArrayList<ThongTinThanhVien> dssv = new ArrayList<>();
    public ArrayList<HoatDong_SinhVien_Class> dshdtk = new ArrayList<HoatDong_SinhVien_Class>();

    public void LoadFileHoatDong() {
        try {
            FileInputStream fis = new FileInputStream("HoatDongQL.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            var resultList = (ArrayList) ois.readObject();
            dshd1 = resultList;
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void resetHoatDong() {
        LoadFileHoatDong();
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        Object[] TieuDe = {"Mã HĐ", "Tên HĐ", "Nơi Diễn Ra", "Kinh Phí"};
        model.setColumnIdentifiers(TieuDe);
        Object[][] rowdata = new Object[dshd1.size()][8];
        for (int i = 0; i < dshd1.size(); i++) {
            rowdata[i][0] = dshd1.get(i).getMaHD();
            rowdata[i][1] = dshd1.get(i).getTenHD();
            rowdata[i][2] = dshd1.get(i).getNoiDienRa();
            rowdata[i][3] = (long) dshd1.get(i).getKinhPhiHD();
        }
        model.setDataVector(rowdata, TieuDe);
        this.table.setModel(model);
        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    public void loadFileTaiKHoan() {
        try {
            FileInputStream fis = new FileInputStream("SINHVIEN.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            var resultList = (ArrayList) ois.readObject();
            dssv = resultList;
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
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void initComponents() {
//
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        jLabel4 = new javax.swing.JLabel();
//        jLabel5 = new javax.swing.JLabel();
//        jLabel6 = new javax.swing.JLabel();
//        txtmasv = new javax.swing.JTextField();
//        txttensv = new javax.swing.JTextField();
//        txtdiachi = new javax.swing.JTextField();
//        jRadio_nam = new javax.swing.JRadioButton();
//        jRadio_nu = new javax.swing.JRadioButton();
//        cbx_nganh = new javax.swing.JComboBox<>();
//        cbx_chucvu = new javax.swing.JComboBox<>();
//        btn_Sua = new javax.swing.JButton();
//        btn_Them = new javax.swing.JButton();
//        btn_Xoa = new javax.swing.JButton();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        table = new javax.swing.JTable();
//        btn_Thoat = new javax.swing.JButton();
//        jPanel1 = new javax.swing.JPanel();
//        jPanel2 = new javax.swing.JPanel();
//        jLabel7 = new javax.swing.JLabel();
//        cbx_TimKiem = new javax.swing.JComboBox<>();
//        btn_Tim = new javax.swing.JButton();
//        jButton1 = new javax.swing.JButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
//        jLabel1.setText("Mã SV");
//
//        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
//        jLabel2.setText("Tên SV");
//
//        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
//        jLabel3.setText("Địa Chỉ");
//
//        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
//        jLabel4.setText("Giới Tính");
//
//        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
//        jLabel5.setText("Ngành ");
//
//        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
//        jLabel6.setText("Chức Vụ");
//
//        jRadio_nam.setText("Nam");
//
//        jRadio_nu.setText("Nữ");
//
//        cbx_nganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hệ Thống Thông Tin", "Khoa Học Máy Tính", "Kỹ Thuật Phần Mềm", "CNTT" }));
//
//        cbx_chucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản trị viên", "Thành viên" }));
//
//        btn_Sua.setBackground(new java.awt.Color(102, 255, 255));
//        btn_Sua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        btn_Sua.setText("Sửa");
//        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btn_SuaActionPerformed(evt);
//            }
//        });
//
//        btn_Them.setBackground(new java.awt.Color(102, 255, 255));
//        btn_Them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        btn_Them.setText("Thêm");
//        btn_Them.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btn_ThemActionPerformed(evt);
//            }
//        });
//
//        btn_Xoa.setBackground(new java.awt.Color(102, 255, 255));
//        btn_Xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        btn_Xoa.setText("Xóa");
//        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btn_XoaActionPerformed(evt);
//            }
//        });
//
//        table.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null},
//                {null, null, null, null, null, null}
//            },
//            new String [] {
//                "ma sv", "ten sv", "dia chi", "gio itinh", "chuc vu", "nganh"
//            }
//        ) {
//            Class[] types = new Class [] {
//                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//        });
//        table.addAncestorListener(new javax.swing.event.AncestorListener() {
//            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
//                tableAncestorAdded(evt);
//            }
//            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
//            }
//            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
//            }
//        });
//        table.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                tableMouseClicked(evt);
//            }
//        });
//        jScrollPane1.setViewportView(table);
//
//        btn_Thoat.setBackground(new java.awt.Color(102, 255, 255));
//        btn_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        btn_Thoat.setText("Thoát");
//        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btn_ThoatActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 0, Short.MAX_VALUE)
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 36, Short.MAX_VALUE)
//        );
//
//        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
//
//        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        jLabel7.setText("Tìm Kiếm Theo ");
//
//        cbx_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã SV", "Tên SV", "Địa Chỉ", "Giới Tính", "Ngành", "Chức Vụ", " " }));
//
//        btn_Tim.setBackground(new java.awt.Color(0, 204, 255));
//        btn_Tim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        btn_Tim.setText("Tìm");
//        btn_Tim.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btn_TimActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jLabel7)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addComponent(cbx_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addComponent(btn_Tim)
//                .addContainerGap(27, Short.MAX_VALUE))
//        );
//        jPanel2Layout.setVerticalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addComponent(cbx_TimKiem)
//                    .addComponent(btn_Tim))
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        jButton1.setBackground(new java.awt.Color(153, 255, 255));
//        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
//        jButton1.setText("Reset");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(15, 15, 15)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addComponent(jLabel5)
//                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                .addGap(18, 18, 18)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addComponent(jRadio_nam)
//                        .addGap(29, 29, 29)
//                        .addComponent(jRadio_nu)
//                        .addGap(0, 0, Short.MAX_VALUE))
//                    .addComponent(cbx_chucvu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(txtmasv)
//                    .addComponent(txttensv)
//                    .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addComponent(cbx_nganh, 0, 1, Short.MAX_VALUE))
//                .addGap(18, 18, 18)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addComponent(btn_Sua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(btn_Them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
//                    .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
//                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addGap(18, 18, 18)
//                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(194, 194, 194))
//                    .addGroup(layout.createSequentialGroup()
//                        .addGap(20, 20, 20)
//                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(14, 14, 14)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addGroup(layout.createSequentialGroup()
//                        .addGap(41, 41, 41)
//                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                        .addComponent(jLabel6)
//                        .addComponent(cbx_chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addGap(37, 37, 37))
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(layout.createSequentialGroup()
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel2)
//                            .addComponent(txttensv))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel3)
//                            .addComponent(txtdiachi))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel4)
//                            .addComponent(jRadio_nam)
//                            .addComponent(jRadio_nu))
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                            .addComponent(jLabel5)
//                            .addComponent(cbx_nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                    .addGroup(layout.createSequentialGroup()
//                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(12, 12, 12))))
//        );
//
//        pack();
//    }// </editor-fold>                        

    public void resetThongTin() {
        loadFileTaiKHoan();
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnNames = {"Mã SV", "Tên SV", "Địa chỉ", "Giới tính", "Chức vụ", "Ngành học"};
        model.setColumnIdentifiers(columnNames);
        Object[][] rowData = new Object[dssv.size()][6];
        for (int i = 0; i < dssv.size(); i++) {
            rowData[i][0] = dssv.get(i).getMaSV();
            rowData[i][1] = dssv.get(i).getTenSV();
            rowData[i][3] = dssv.get(i).getGioiTinh();
            rowData[i][2] = dssv.get(i).getDiaChi();
            rowData[i][5] = dssv.get(i).getNganhHoc();
            rowData[i][4] = dssv.get(i).getChucVu();
        }
        model.setDataVector(rowData, columnNames);
        this.table1.setModel(model);
        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        txtmasv = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Xóa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Thoat = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SV", "Tên SV", "Giưới Tính", "Địa chỉ", "Ngành", "Chức Vụ"
            }
        ));
        table1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã SV", "MÃ HĐ"
            }
        ));
        table2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(table2);

        btn_Them.setBackground(new java.awt.Color(0, 255, 255));
        btn_Them.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mã HĐ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Mã SV");

        Xóa.setBackground(new java.awt.Color(0, 255, 255));
        Xóa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Xóa.setText("Xóa");
        Xóa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XóaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Thông Tin Thành Viên Trong CLB");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Hoạt Động Mà Sinh Viên Tham Gia");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Hoạt Động Của CLB FIT - Media");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Thêm/ Xóa Hoạt Động Mà Sinh Viên Đã Tham Gia");

        btn_Thoat.setBackground(new java.awt.Color(0, 255, 255));
        btn_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(0, 255, 255));
        btn_Reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Them))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Thoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Xóa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(jLabel4))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Them)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaHD)
                                    .addComponent(Xóa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Thoat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Reset)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
        resetHoatDong();
    }//GEN-LAST:event_tableAncestorAdded

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.rowAtPoint(evt.getPoint());
        String MaHD = (String) table.getValueAt(row, 0);
        String TenHD = (String) table.getValueAt(row, 1);
        String NoiDienRa = (String) table.getValueAt(row, 2);
        long KinhPhi = (long) table.getValueAt(row, 3);
        txtMaHD.setText(MaHD);
    }//GEN-LAST:event_tableMouseClicked

    private void table1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table1AncestorAdded
        resetThongTin();
    }//GEN-LAST:event_table1AncestorAdded

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int row = table1.rowAtPoint(evt.getPoint());
        String MaSV = (String) table1.getValueAt(row, 0);
        String TenSV = (String) table1.getValueAt(row, 1);
        String GioiTinh = (String) table1.getValueAt(row, 3);
        String DiaChi = (String) table1.getValueAt(row, 2);
        String ChucVu = (String) table1.getValueAt(row, 4);
        String nganh = (String) table1.getValueAt(row, 5);
        txtmasv.setText(MaSV);
    }//GEN-LAST:event_table1MouseClicked

    public void resetSinhVienHD() {
        loadFile2();
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnNames = {"Mã SV", "Mã HĐ"};
        model.setColumnIdentifiers(columnNames);
        Object[][] rowData = new Object[dshdtk.size()][3];
        for (int i = 0; i < dshdtk.size(); i++) {
            rowData[i][0] = dshdtk.get(i).getMaHoatDong();
            rowData[i][1] = dshdtk.get(i).getDsMaSinhVien();
        }
        model.setDataVector(rowData, columnNames);
        this.table2.setModel(model);
        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    public void loadFile2() {
        try {
            FileInputStream fis = new FileInputStream("SinhVienHoatDong123.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            var resultList = (ArrayList) ois.readObject();
            dshdtk = resultList;
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
    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed

        LoadFileHoatDong();
        loadFileTaiKHoan();
        loadFile2();
        String maHD = txtMaHD.getText();
        String maSV = txtmasv.getText();
        if (maHD.isEmpty() || maSV.isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Không để trống!");
        else {
            boolean check1 = false, check2 = false;
            for (HoatDong_Class item : dshd1) {
                if (item.getMaHD().equals(maHD)) {
                    check1 = true;
                    break;
                }
            }
            for (ThongTinThanhVien item : dssv) {
                if (item.getMaSV().equals(maSV)) {
                    check2 = true;
                    break;
                }
            }

            if (!check1) {
                JOptionPane.showMessageDialog(rootPane, "Hoạt động không tồn tại!");
            }
            if (!check2) {
                JOptionPane.showMessageDialog(rootPane, "Sinh viên không tồn tại!");
            }
            if (check1 && check2) {

                boolean ok = false;
                for (HoatDong_SinhVien_Class item : dshdtk) {
                    if (item.getMaHoatDong().equals(maHD)) {
                        for (String y : item.getDsMaSinhVien()) {
                            if (y.equals(maSV)) {
                                ok = true;
                                break;
                            }
                        }
                    }
                }

                if (ok) {
                    JOptionPane.showMessageDialog(rootPane, "Sinh viên đã tồn tại trong hoạt động!");
                } else {
                    boolean flagg = false;
                    for (HoatDong_SinhVien_Class item : dshdtk) {
                        if (item.getMaHoatDong().equals(maHD)) {
                            item.setDsMaSinhVien(maSV);
                            flagg = true;
                            break;
                        }
                    }
                    HoatDong_SinhVien_Class temp = new HoatDong_SinhVien_Class();
                    temp.setMaHoatDong(maHD);
                    temp.setDsMaSinhVien(maSV);
                    if (!flagg) {
                        dshdtk.add(temp);
                    }
                    try {
                        FileOutputStream fos = new FileOutputStream("SinhVienHoatDong123.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(dshdtk);
                        oos.close();
                        fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    resetSinhVienHD();
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                }
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void table2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table2AncestorAdded
        resetSinhVienHD();
    }//GEN-LAST:event_table2AncestorAdded

    private void XóaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XóaActionPerformed

        LoadFileHoatDong();
        loadFileTaiKHoan();
        loadFile2();
        String maHD = txtMaHD.getText();
        String maSV = txtmasv.getText();
        if (maHD.isEmpty() || maSV.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Không để trống!");
        } else {
            boolean check1 = false, check2 = false;
            for (HoatDong_Class item : dshd1) {
                if (item.getMaHD().equals(maHD)) {
                    check1 = true;
                    break;
                }
            }
            for (ThongTinThanhVien item : dssv) {
                if (item.getMaSV().equals(maSV)) {
                    check2 = true;
                    break;
                }
            }

            if (!check1) {
                JOptionPane.showMessageDialog(rootPane, "Hoạt động không tồn tại!");
            }
            if (!check2) {
                JOptionPane.showMessageDialog(rootPane, "Sinh viên không tồn tại!");
            }
            if (check1 && check2) {

                boolean ok = false;
                for (HoatDong_SinhVien_Class item : dshdtk) {
                    if (item.getMaHoatDong().equals(maHD)) {
                        for (String y : item.getDsMaSinhVien()) {
                            if (y.equals(maSV)) {
                                ok = true;
                                break;
                            }
                        }
                    }
                }
                if (!ok) {
                    JOptionPane.showMessageDialog(rootPane, "Sinh viên không tham gia hoạt động đó!");
                } else {

                    for (HoatDong_SinhVien_Class item : dshdtk) {
                        if (item.getMaHoatDong().equals(maHD)) {
                            item.setDsMaSinhVienXoa(maSV);

                            break;
                        }
                    }
                    try {
                        FileOutputStream fos = new FileOutputStream("SinhVienHoatDong123.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(dshdtk);
                        oos.close();
                        fos.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    resetSinhVienHD();
                    JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
                }
            }
        }


    }//GEN-LAST:event_XóaActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
       txtMaHD.setText("");
       txtmasv.setText("");          
    }//GEN-LAST:event_btn_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(HoatDong_SinhVien_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoatDong_SinhVien_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoatDong_SinhVien_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoatDong_SinhVien_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoatDong_SinhVien_ITF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Xóa;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtmasv;
    // End of variables declaration//GEN-END:variables
}
