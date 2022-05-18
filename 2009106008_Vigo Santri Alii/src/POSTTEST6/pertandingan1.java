/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

/**
 *
 * @author Asus Gk
 */
public class pertandingan1 implements jadwal{
    String tempat, jam, petarung1, petarung2, channel;
    
    public pertandingan1 (String tempat, String jam,String petarung1,String petarung2,String channel){
        this.tempat = tempat;
        this.jam = jam;
        this.petarung1 = petarung1;
        this.petarung2 = petarung2;
        this.channel = channel; 
    }
    
    
    
    @Override
    public void pertandingan() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           System.out.println("Tempat   : "+ this.tempat);
           System.out.println("Jam      : "+ this.jam);
           System.out.println("Channel  : " + this.channel);
           System.out.println(this.petarung1 + " VS " + this.petarung2);
           
    }

    @Override
    public void hasil() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println("Pemenang adalah " + this.petarung1);
    }
}
