public class Yazilimci extends Calisan{
    private String bildidiDiller;
    public Yazilimci(String isim, int maas, String departmant,String bildidiDiller) {
        super(isim, maas, departmant);
        this.bildidiDiller = bildidiDiller;
    }
    public void formatAt(String isletimsistemi){
        System.out.println(getIsim()+" İşletim sistemini yüklüyor");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Bilinen diller " + bildidiDiller);
    }
}
