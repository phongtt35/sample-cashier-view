/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import model.SanPham;

/**
 *
 * @author Phong
 */
public class SanPhamRepository {
    
    private static final List<SanPham> dsSanPham = new ArrayList();
    
    static {
        dsSanPham.add(new SanPham(1, "Laptop", 92214.0, 213));
        dsSanPham.add(new SanPham(2, "Tivi", 274123.0, 1212));
        dsSanPham.add(new SanPham(3, "Tủ lạnh", 31233.0, 123));
        
        Random rd = new Random();
        for (int i = 4; i <= 10000; i++) {
            dsSanPham.add(new SanPham(i, "Product " + i, 
                    Math.floor(rd.nextDouble(1000, 1000000)), 
                    rd.nextInt(1, 1000)));
        }
    }
    
    public List<SanPham> getDSSP() {
        return dsSanPham;
    }
    
    public Stream<SanPham> getDSSPStream() {
        return dsSanPham.stream();
    }
    
    public String getTenSP(Integer id) {
        return dsSanPham.parallelStream()
                .filter(sp -> sp.getMaSanPham().equals(id))
                .findFirst()
                .get()
                .getTenSanPham();
    }
}
