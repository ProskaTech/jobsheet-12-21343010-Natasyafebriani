/*
Created By 21343010-Natasya febriani
 */
package Latihan1;

public class RodaEmpat extends Kendaraan 
{
    double NaikHargaKe = 8;// 1 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi, harga mobil menjadi Rp." + hargaDasar);
    }  
}