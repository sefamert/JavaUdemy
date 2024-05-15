public class Yonetici extends Calisan { //subclass

    private int sorumOlduguKisiSayisi;
    public Yonetici(String isim, int maas, String departmant,int sorumOlduguKisiSayisi) {
        super(isim, maas, departmant);
        this.sorumOlduguKisiSayisi = sorumOlduguKisiSayisi;
    }

    public void zamYap(int zam){
        System.out.println("Çalışanlara " + zam + "yapıldı.");
    }
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println(sorumOlduguKisiSayisi);
    }

}
