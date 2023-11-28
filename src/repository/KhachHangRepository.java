/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.KhachHang;

/**
 *
 * @author Phong
 */
public class KhachHangRepository {
    
    private static final List<KhachHang> listKhach = new ArrayList();
    
    static {
        listKhach.add(new KhachHang("0981234567", "PhongTT35"));
        listKhach.add(new KhachHang("123456789", "PhongTT12"));
        listKhach.add(new KhachHang("123", "PhongTT"));
    }
    
    public KhachHang getByPhone(String phone) {
        return listKhach.stream()
                .filter(k -> k.getPhone().equals(phone))
                .findFirst()
                .orElse(null);
    }
    
    public void add(KhachHang kh) {
        listKhach.add(kh);
    }
}
