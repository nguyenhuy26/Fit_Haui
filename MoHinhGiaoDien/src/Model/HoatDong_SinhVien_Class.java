/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author kien5
 */
public class HoatDong_SinhVien_Class implements Serializable{

     private String maHoatDong;
    private ArrayList<String> dsMaSinhVien = new ArrayList<String>();
    public ArrayList<String> getDsMaSinhVien() {
        return dsMaSinhVien;
    }
    void setDsMaSinhVienXoa(String y) {
        this.dsMaSinhVien.remove(y);
    }
    public HoatDong_SinhVien_Class(String maHoatDong) {
        this.maHoatDong = maHoatDong;
    }

    public String getMaHoatDong() {
        return maHoatDong;
    }

    

    public void setMaHoatDong(String maHoatDong) {
        this.maHoatDong = maHoatDong;
    }

    public void setDsMaSinhVien(String ma) {
        this.dsMaSinhVien.add(ma);
    }

    public HoatDong_SinhVien_Class() {
    }
}
