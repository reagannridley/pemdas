import java.util.Scanner;

public class Laman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lmn = in.nextInt();
        int crnt = in.nextInt();
        int rng = in.nextInt();

        int split = rng / 2;
        boolean isPrev = (crnt != 1);
        boolean isNext = (lmn - crnt != 0);

        int count = 0;
        if(isPrev) {
            System.out.print("Prev ");
            if(split + crnt > lmn) split += (split + crnt) - lmn;
            for(int i = split; i > 0; i--){
                if(crnt - i < 1 ) continue;
                System.out.print(crnt - i + " ");
                count++;
            }
        }
        

        System.out.print(crnt + " ");

        split = rng - count;
        if(isNext){
            for(int i = 1; i <= split; i++){
                System.out.print(crnt + i + " ");
            }
            System.out.print("Next");
        }

    }
}
