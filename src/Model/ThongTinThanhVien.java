/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author kien5
 */
public class ThongTinThanhVien implements Serializable{
    private String MaSV, TenSV, GioiTinh,DiaChi, ChucVu, NganhHoc;

    public ThongTinThanhVien() {
    }

    public ThongTinThanhVien(String MaSV, String TenSV, String GioiTinh, String DiaChi, String ChucVu, String NganhHoc) {
        this.MaSV = MaSV;
        this.TenSV = TenSV;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.ChucVu = ChucVu;
        this.NganhHoc = NganhHoc;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getNganhHoc() {
        return NganhHoc;
    }

    public void setNganhHoc(String NganhHoc) {
        this.NganhHoc = NganhHoc;
    }
    
}
