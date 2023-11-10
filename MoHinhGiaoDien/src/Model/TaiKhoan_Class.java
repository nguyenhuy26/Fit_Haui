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
public class TaiKhoan_Class implements Serializable{
     public String TenDN;
     public String MatKhau;
public TaiKhoan_Class(){
}

    public TaiKhoan_Class(String TenDN, String MatKhau) {
        this.TenDN = TenDN;
        this.MatKhau = MatKhau;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    

}