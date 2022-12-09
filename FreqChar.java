import java.util.*;

public class FreqChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();
        char[] ascii = kata.toCharArray();
        Arrays.sort(ascii);

        char t = ascii[0], c;
        int counter = 0, n = ascii.length - 1;
        
        for(int j = 0; j < ascii.length; j++){
            c = ascii[j];
            if(t != c) {
                System.out.printf("%c: %d\n",t,counter);
                t = c;
                counter = 1;
                if(j == n) System.out.printf("%c: %d\n",t,counter);
                continue;
            }
            counter++;
            if(j == n) System.out.printf("%c: %d\n",t,counter);
        }
    }
}
