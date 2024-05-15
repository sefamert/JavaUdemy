import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade programına hoş geldiniz");
        System.out.println("çıkış için q ya basın");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi beyblade i üretmek istiyorsunuz?");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else {
                beybladeFabrikası fabrika = new beybladeFabrikası();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if(beyblade == null)
                    System.out.println("Lütfen geçerli bir beyblade ismi girin");
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarCikar();
                }
            }
        }
    }
}
