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
public class HoatDong_Class implements Serializable{
    public String MaHD, TenHD, NoiDienRa;
     public long KinhPhiHD;

    public HoatDong_Class(String MaHD, String TenHD, String NoiDienRa, long KinhPhiHD) {
        this.MaHD = MaHD;
        this.TenHD = TenHD;
        this.NoiDienRa = NoiDienRa;
        this.KinhPhiHD = KinhPhiHD;
    }

    public HoatDong_Class() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTenHD() {
        return TenHD;
    }

    public void setTenHD(String TenHD) {
        this.TenHD = TenHD;
    }

    public String getNoiDienRa() {
        return NoiDienRa;
    }

    public void setNoiDienRa(String NoiDienRa) {
        this.NoiDienRa = NoiDienRa;
    }

    public long getKinhPhiHD() {
        return KinhPhiHD;
    }

    public void setKinhPhiHD(long KinhPhiHD) {
        this.KinhPhiHD = KinhPhiHD;
    }
     
}
