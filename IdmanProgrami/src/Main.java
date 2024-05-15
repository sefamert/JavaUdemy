import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Araba araba1 = new Araba();
        araba1.setRenk("Kırmızı");
        araba1.setKapilar(4);
        araba1.setModel("ford");
        araba1.setMotor("16valf");
        System.out.println(araba1.getRenk());
        System.out.println(araba1.getKapilar());
        System.out.println(araba1.getModel());
        System.out.println(araba1.getMotor());
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdmana hoşgeldinnnn");
        String idman = "Geçerli Hareketler..\n"
                +"squad\n"
                +"burpy\n"
                +"squad\n";
        System.out.println(idman);
        System.out.println("Bir idman oluşturun");
        System.out.println("Burpy sayısı");
        int burpy = scanner.nextInt();
        System.out.println("Squad sayısı");
        int squad = scanner.nextInt();
        System.out.println("Pushup sayısı");
        int pusup = scanner.nextInt();
        scanner.nextLine();

        yapilacakHareketSayisi hareketler = new yapilacakHareketSayisi(pusup,burpy,squad);
        System.out.println("İdman başlıyor");

        while (hareketler.idmanBittMi() == false) {
            System.out.println("Hareket türü giriniz.");
            String tur = scanner.nextLine();
            System.out.println("Hareket sayısını giriniz.");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            hareketler.hareketYap(tur,sayi);
        }


    }
}
