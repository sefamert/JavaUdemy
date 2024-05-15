public class GelismisAbone {
    private String isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if(bakiye>0 && bakiye<=120)
            this.bakiye = bakiye;

        this.sehir = sehir;
    }
    public void dogalgazkullan(int miktar){
        if(this.bakiye-miktar < 0){
            System.out.println("Yeterli abkiye yok");
        }
        else  {
            this.bakiye = this.bakiye - miktar;
            if(this.bakiye <=- 0){
                System.out.println("Kredin bitti git yükle. Kredi limiti 120TL");
            }
            else
                System.out.println("Bakiye = " + this.bakiye);
        }
    }
    public void bakiyeOgren(){
        System.out.println("Kalan bakiye = " + this.bakiye);
    }
}
