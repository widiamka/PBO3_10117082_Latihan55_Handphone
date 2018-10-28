/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan55_handphone;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan berbagai 
* jenis handphone dengan spesifikasinya dengan konsep inheritance
 */
public class PBO3_10117082_Latihan55_Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Android andro= new Android("Samsung", "Android", "Grand", 3000000);
        andro.displayProduct();
        andro.setKeyStore("234ibfd3840fo");
        System.out.println("Andriod Key Store : " + andro.getKeyStore()+"\n");

        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN : " + bb.getPinBB()+"\n");

        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.displayProduct();
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("WP Key Store : " + wp.getWpKeyStore());
    }
    
}
