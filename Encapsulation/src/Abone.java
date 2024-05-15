public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;

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
