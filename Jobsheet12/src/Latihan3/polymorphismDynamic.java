/*
 Created By 21343010-Natasya febriani
 */
package Latihan3;

public class polymorphismDynamic {
    //Run | Debug
    public static void main(String[] args) {
        // creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: "+B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: "+B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: "+B.sukuBunga());
        
    }
}