/*
 Created By 21343010-Natasya febriani
 */
package Latihan6;

public class BuahUtama {
  //  Run | Debug
    public static void main(String[] args){
        //Menggunakan constructor untuk menginisiasasi
        EncapsulationBuah Apel = new EncapsulationBuah("Apel","Rp.3000","Merah");
        //Menggunakan getter ke nilai
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga: "
                           +Apel.getPrice()+"\nWarna: "+Apel.getColor());         
        //update harga dan warna menggunakan setter
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println( "\nInformasi terkait Apel setelah di update");
        //Menggunakan getter untuk mendapatkan nilai
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga: "
                            +Apel.getPrice()+"\nWarna: "+Apel.getColor());
    }  
}