package pemdasPTI.latsolUAP;

import java.util.Scanner;

public class segitigadanhasil {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String kode1 = a.nextLine();
        String kode2 = a.nextLine();
        String kode3 = a.nextLine();
     
        int kode1Leng = kode1.length();
        int kode2Leng = kode2.length();
        int kode3Leng = kode3.length();

        int angka1;
        angka1 = Integer.parseInt(kode1.substring(kode1Leng-2));
        int angka2;
        angka2 = Integer.parseInt(kode2.substring(kode2Leng-2));
        int angka3;
        angka3 = Integer.parseInt(kode3.substring(kode3Leng-2));

        String x = kode1.substring(0, kode1Leng-2);
        String y = kode2.substring(0, kode2Leng-2);
        String z = kode3.substring(0, kode3Leng-2);

        int sisiA = 0;
        int sisiB = 0;
        int sisiC = 0;

        if (angka1 > angka2 && angka1 > angka3) {
            if (angka2 > angka3) {
                sisiA = angka1; //miring
                sisiB = angka2; //alas
                sisiC = angka3; //t
               
            } else {
                sisiA = angka1; //miring
                sisiB = angka3; //alas
                sisiC = angka2; //t
            }
        } else {
            if (angka2 > angka1 && angka2 > angka3) {
                if (angka1 > angka3) {
                    sisiA = angka2; //miring
                    sisiB = angka1; //alas
                    sisiC = angka3; //t
                } else {
                    sisiA = angka2; //miring
                    sisiB = angka3; //alas
                    sisiC = angka1; 
                }
            } else {
                if (angka3 > angka1) {
                    System.out.println(Integer.toString(c) + "," + a + "," + b);
                } else {
                    System.out.println(Integer.toString(c) + "," + b + "," + a);
                }
            }
        }
    
        
       
        if(sisiA >= (sisiB + sisiC)){
            System.out.println("Bukan segitiga");
        } else if(sisiA * sisiA == (sisiB * sisiB + sisiC * sisiC)){
            System.out.println("Segitiga Siku-siku");
        } else if(sisiA * sisiA > (sisiB * sisiB + sisiC * sisiC)){
            System.out.println("Segitiga Tumpul");
        } else if(sisiA * sisiA < (sisiB * sisiB + sisiC * sisiC)){
            System.out.println("Segitiga Lancip");
        } else if(sisiA == sisiB && sisiA == sisiC && sisiB == sisiC){
            System.out.println("Segitiga Sama Sisi");
        } else if(sisiA == sisiB && sisiA != sisiC && sisiB != sisiC){
            System.out.println("Segitiga Sama Kaki");
        }

        System.out.println(x + y + z);
        int kelilingSegitiga = sisiA + sisiB + sisiC;
        int luasSegitiga = (sisiB * sisiC) / 2;
        System.out.println("Keliling : " + kelilingSegitiga);
        System.out.println("Luas : " + luasSegitiga);
    }
    
}
}







