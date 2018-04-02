/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

public class segitiga {
    double alas;
    double tinggi;
    
    void cetakInfo(){
       System.out.println("=================");      
       System.out.println("alas :"+alas);
       System.out.println("tinggi :"+tinggi);
       System.out.println("=================");
    }
       
       double hitungLuas(){
        double luas;
        luas=alas*tinggi;
        return luas;
       }
       
       void cetakLuas(){
           System.out.println("Luas adalah:"+hitunglahLuas());
        
    }
    }
    
}
