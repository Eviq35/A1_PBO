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
public class petarung {
    private String nama;
    private long id;
    private String bela_diri;
    private String kelas;
    

    
    public petarung( long id, String nama, String bela_diri, String kelas){
        this.nama = nama;
        this.id = id;
        this.bela_diri = bela_diri;
        this.kelas = kelas;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    protected String getBela_diri() {
        return bela_diri;
    }

    protected void setBela_diri(String bela_diri) {
        this.bela_diri = bela_diri;
    }

    protected String getKelas() {
        return kelas;
    }

    protected void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void show(){
        System.out.println("ID               : "+getId());
        System.out.println("Nama             : "+getNama());
        System.out.println("Bela Diri        : "+getBela_diri());
        System.out.println("Kelas            : "+getKelas());
    }
}



