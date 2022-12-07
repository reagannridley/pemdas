import java.util.*;

public class tes {
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

        int[] arrayAngka = {angka1,angka2,angka3};
        Arrays.sort(arrayAngka);
        int sisiA = arrayAngka[2];
        int sisiB = arrayAngka[1];
        int sisiC = arrayAngka[0];


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
        double luasSegitiga = ((double) sisiB * sisiC) / 2;
        System.out.println("Keliling : " + kelilingSegitiga);
        System.out.print("Luas : ");
        System.out.printf("%.2f",luasSegitiga);


    }
}
