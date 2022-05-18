/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

import POSTTEST4.*;

/**
 *
 * @author Asus Gk
 */
public class Tyson extends petarung{
    
    public Tyson(long id, String nama, String bela_diri, String kelas) {
        super(id, nama, bela_diri, kelas);
    }
    
    @Override
    public void show(){
        System.out.println("ID Tyson               : "+getId());
        System.out.println("Nama                   : "+getNama());
        System.out.println("Bela Diri Tyson        : "+getBela_diri());
        System.out.println("Kelas Tyson            : "+getKelas());
    }
}
