/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10118080.latihan4.kambing;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program hitung kambing
 */
public class PBO10118080Latihan4Kambing {
    public void tambahKambing(){
        int jmlKambing=0;
        
        jmlKambing = jmlKambing +5;
        System.out.println("Jumlah kambing setelah ditambah : "+jmlKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PBO10118080Latihan4Kambing kambingJantan = new PBO10118080Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
