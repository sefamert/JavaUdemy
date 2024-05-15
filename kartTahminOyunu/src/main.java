import java.util.Scanner;

public class main {
    private static Kart[][] kart = new Kart[4][4];

    public static void main(String[] args) {
        kart[0][0] = new Kart('E');
        kart[0][1] = new Kart('A');
        kart[0][2] = new Kart('B');
        kart[0][3] = new Kart('F');
        kart[1][0] = new Kart('G');
        kart[1][1] = new Kart('A');
        kart[1][2] = new Kart('D');
        kart[1][3] = new Kart('H');
        kart[2][0] = new Kart('F');
        kart[2][1] = new Kart('C');
        kart[2][2] = new Kart('D');
        kart[2][3] = new Kart('H');
        kart[3][0] = new Kart('E');
        kart[3][1] = new Kart('G');
        kart[3][2] = new Kart('B');
        kart[3][3] = new Kart('C');


        oyun();
        System.out.println("tebrikler");

    }

    public static void oyun(){
        while (oyunBittiMi() == false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. tahmininizin i ve j değerlerini birer boşluklu olarak giriniz");
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            kart[i][j].settahmin(true);

            oyunTahtasi();

            System.out.println("2. tahmininizin i ve j değerlerini birer boşluklu olarak giriniz");
            int k = scanner.nextInt();
            int m = scanner.nextInt();

            kart[k][m].settahmin(true);

            oyunTahtasi();

            if(kart[i][j].getDeger() != kart[k][m].getDeger()){
                System.out.println("Tahminleriniz yanlıştır.");
                kart[i][j].settahmin(false);
                kart[k][m].settahmin(false);
                oyunTahtasi();
            }
            oyunBittiMi();
        }

    }

    public static boolean oyunBittiMi(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kart[i][j].istahmin() == false)
                    return false;
            }
        }
        return true;
    }

    public static void oyunTahtasi(){
        for (int i = 0; i < 4; i++) {
            System.out.println("--------------------");
            for (int j = 0; j < 4; j++) {
                if(kart[i][j].istahmin())
                    System.out.print(" |" + kart[i][j].getDeger() + "| ");
                else
                    System.out.print(" | | ");

            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

}
