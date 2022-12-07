import java.util.*;

public class sol{
    public static void main(String[] args) {
        /*
         * A = sisi miring
         * B = sisi alas
         * C = sisi tinggi
         */
        Scanner in = new Scanner(System.in);
        String strTinggi = in.nextLine();
        String strAlas = in.nextLine();
        String strMiring = in.nextLine();

        int lenT = strTinggi.length();
        int lenA = strAlas.length();
        int lenM = strMiring.length();

        int a1 = Integer.parseInt(strTinggi.substring(lenT - 2));
        int b = Integer.parseInt(strAlas.substring(lenA - 2));
        int c = Integer.parseInt(strMiring.substring(lenM - 2));

        int[] arr = {a1,b,c};

        Arrays.sort(arr);
        int m = arr[2];
        int t = arr[1];
        int a = arr[0];
        
        String iden1 = strTinggi.substring(0,lenT - 2);
        String iden2 = strAlas.substring(0,lenA - 2);
        String iden3 = strMiring.substring(0,lenM - 2);

        String identity = iden1 + iden2 + iden3;

        String type = typeIdentify(m, t, a);
        
        System.out.println(type);
        System.out.println(identity);
        System.out.printf("Keliling : %d\n",a + t + m);
        System.out.printf("Luas : %.2f",0.5 * (double)a * (double)t);

        in.close();
    }

    static int pow(int n){
        return (int) Math.pow(n,2);
    }

    static String typeIdentify(int m, int t, int a){
        String type = "";
        int counter = 0;
        if(m >= t + a) {
            type += "Bukan Segitiga";
            counter++;
        }
        else if(pow(m) == pow(t) + pow(a)) {
            type += "Segitiga Siku-siku";
            counter++;
        }
        else if(pow(m) > pow(t) + pow(a)) { 
            type += "Segitiga Tumpul";
            counter++;
        }
        else if(pow(m) < pow(t) + pow(a)) {
            type += "Segitiga Lancip";
            counter++;
        }
        if(pow(m) == pow(t) && pow(t) ==  pow(a)) {
            if(counter > 0){
                type += "\n";
            }
            type += "Segitiga Sama Sisi";
            counter++;
            
        }
        else if((pow(m) == pow(t) && pow(t) !=  pow(a)) || (pow(m) != pow(t) && pow(t) ==  pow(a))) {
            if(counter > 0){
                type += "\n";
            }  
            type += "Segitiga Sama Kaki";
        }
        return type;

    }
}