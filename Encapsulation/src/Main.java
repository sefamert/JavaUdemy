public class Main {
    public static void main(String[] args) {

       /* Abone abone = new Abone();
        abone.isim = "Sefa";
        abone.bakiye = 200;
        abone.sehir = "Ankara";

        abone.dogalgazkullan(200);*/

        GelismisAbone abone = new GelismisAbone("sefa",200,"Ankara");
        abone.bakiyeOgren();
    }
}
