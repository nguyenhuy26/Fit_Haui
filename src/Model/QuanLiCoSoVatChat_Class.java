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
public class QuanLiCoSoVatChat_Class implements Serializable{
    public String MaVatTu, TenVatTu, TinhTrang;
    public int SoLuong;
    public long KinhPhi;
    public String DoKhanHiem;

    public QuanLiCoSoVatChat_Class(){
    }

    public QuanLiCoSoVatChat_Class(String MaVatTu, String TenVatTu, String TinhTrang, int SoLuong, long KinhPhi, String DoKhanHiem) {
        this.MaVatTu = MaVatTu;
        this.TenVatTu = TenVatTu;
        this.TinhTrang = TinhTrang;
        this.SoLuong = SoLuong;
        this.KinhPhi = KinhPhi;
        this.DoKhanHiem = DoKhanHiem;
    }

    public String getMaVatTu() {
        return MaVatTu;
    }

    public void setMaVatTu(String MaVatTu) {
        this.MaVatTu = MaVatTu;
    }

    public String getTenVatTu() {
        return TenVatTu;
    }

    public void setTenVatTu(String TenVatTu) {
        this.TenVatTu = TenVatTu;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getKinhPhi() {
        return KinhPhi;
    }

    public void setKinhPhi(long KinhPhi) {
        this.KinhPhi = KinhPhi;
    }

    public String getDoKhanHiem() {
        
        return DoKhanHiem;
    }

    public void setDoKhanHiem(String DoKhanHiem) {
        this.DoKhanHiem = DoKhanHiem;
    }

    
}
