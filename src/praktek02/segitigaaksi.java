
package praktek02;


public class segitigaaksi {
    public static void main(String[] args) {
        segitiga r1 = new segitiga ();
        r1.alas = 5;
        r1.tinggi = 6;
        
        r1.cetakInfo();
        System.out.println("Luas segitiga ="+r1.hitungLuas());
        r1.cetakLuas();
        
        
        segitiga r2 =  new segitiga();
        r2.cetakInfo();
        
        segitiga r3 = new segitiga(50.30);
        r3.cetakInfo();
    }
        
    }
 
