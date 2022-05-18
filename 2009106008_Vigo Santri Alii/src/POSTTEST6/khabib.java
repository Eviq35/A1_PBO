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
public class khabib extends petarung{
    
    public khabib(long id, String nama, String bela_diri, String kelas) {
        super(id, nama, bela_diri, kelas);
    }
    
    @Override
    public void show(){
        System.out.println("ID Khabib              : "+getId());
        System.out.println("Nama                   : "+getNama());
        System.out.println("Bela Diri Khabib       : "+getBela_diri());
        System.out.println("Kelas Khabib           : "+getKelas());
    }
    public void show(String alamat, int usia){
        System.out.println("ID Khabib              : "+getId());
        System.out.println("Nama                   : "+getNama());
        System.out.println("Bela Diri Khabib       : "+getBela_diri());
        System.out.println("Kelas Khabib           : "+getKelas());
        System.out.println("Alamat                 :"+alamat);
        System.out.println("Usia                   :"+usia);
    }
    
}
