/*
 Created By 21343010-Natasya febriani
 */
package Latihan1;

public class JavaInheritance 
{
    //Run | Debug
    public static void main(String[]args)
    {
      // Membuat objek kendaraan roda dua
      RodaDua sepeda = new RodaDua();
      // Menbuat objek kendaraan roda empat
      RodaEmpat mobil = new RodaEmpat();
      
      sepeda.tampilkanHarga();
      sepeda.hargaAkhir();
      
      mobil.tampilkanHarga();
      mobil.hargaAkhir();
    }
}