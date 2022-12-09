import java.util.Scanner;

public class sol{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();

        long sum = 0;
        String input = "";
        String tgl = "";
        String tipe = "";

        for(int i = 0; i < n; i++){
            input = in.nextLine();
            tgl = input.substring(0,input.indexOf(" "));
            tgl = findDate(tgl);
            tipe = input.substring(input.indexOf(" ") + 1);
            tipe = findType(tipe);

            if(!tipe.contains("Topi")){
                if(tipe.length() == 16) System.out.printf("%-8s%s\n",tipe,tgl);
                else System.out.printf("%-8s\t%s\n",tipe,tgl);
            }

            if(tipe.contains("Topi")){
                if(tipe.length() <= 7) System.out.printf("%-6s\t\t%s\n",tipe,tgl);
                else System.out.printf("%-6s%s\n",tipe,tgl);
                
            }

            if(!tipe.equals("Invalid")) {
                sum += findCount(tipe);
            }
        }
    
        System.out.printf("%s\t\t= %d barang","Total",sum);
        

        in.close();
    }

    static String findType(String tipe){
        char type = tipe.charAt(tipe.length() - 1);
        String typeRes = "";
        long count = 0;
        switch(type){
            case 's' -> {
                typeRes = "Sneakers";
                count = Long.valueOf(tipe.substring(0, tipe.indexOf("s")));
                if(count > 99) return "Invalid";
            }
            case 'T' -> {
                typeRes = "Topi";
                count = Long.valueOf(tipe.substring(0, tipe.indexOf("T")));
                if(count > 99) return "Invalid";
            }
            case 'j' -> {
                typeRes = "Jaket";
                count = Long.valueOf(tipe.substring(0, tipe.indexOf("j")));
                if(count > 99) return "Invalid";
            }
            default -> {
                typeRes = "Invalid";
                return typeRes;
            }
        }
        return count + " " + typeRes;       
    }

    static long findCount(String tipe){
        return Long.valueOf(tipe.substring(0, tipe.indexOf(" ")));
    }

    static String findDate(String date){
        String[] dates = date.split("/");
    
        int tempMonth, tempYear;
        int hari = Integer.parseInt(dates[0]);
        int bulan = Integer.parseInt(dates[1]);
        int tahun = Integer.parseInt(dates[2]);
        String strBulan = "";
        
        if(hari > 30){
            tempMonth = hari / 30;
            bulan += tempMonth;
            hari %= 30;
            if(bulan > 12){
                tempYear = bulan / 12;
                bulan %= 12;
                bulan++;
                tahun += tempYear;
            }
        }

        String[] allMnth = {
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember"
        };

        for(int i = 0; i < 12; i++){
            if(i == bulan - 1){
                strBulan = allMnth[i];
                break;
            }
        }

        return hari + " " + strBulan + " " + tahun;
    }
}
