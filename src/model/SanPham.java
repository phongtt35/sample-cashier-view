package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phong
 */
public class SanPham {
    
    private Integer maSanPham;
    private String tenSanPham;
    private Double giaHienHanh;
    private Integer soLuongTon;

    public SanPham() {
    }

    public SanPham(Integer maSanPham, String tenSanPham, Double giaHienHanh, Integer soLuongTon) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaHienHanh = giaHienHanh;
        this.soLuongTon = soLuongTon;
    }

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getGiaHienHanh() {
        return giaHienHanh;
    }

    public void setGiaHienHanh(Double giaHienHanh) {
        this.giaHienHanh = giaHienHanh;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    
    
}
