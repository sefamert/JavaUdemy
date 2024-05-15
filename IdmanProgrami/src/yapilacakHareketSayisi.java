public class yapilacakHareketSayisi {
    private int pushup;
    private int burpy;
    private  int squad;

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getBurpy() {
        return burpy;
    }

    public void setBurpy(int burpy) {
        this.burpy = burpy;
    }

    public int getSquad() {
        return squad;
    }

    public void setSquad(int squad) {
        this.squad = squad;
    }


    public yapilacakHareketSayisi(int pushup, int burpy, int squad) {
        this.pushup = pushup;
        this.burpy = burpy;
        this.squad = squad;
    }


    public void hareketYap(String hareketTuru, int sayisi){
        if(hareketTuru.equals("burpy"))
        {
            burpyYap(sayisi);
        }
        else if(hareketTuru.equals("squad"))
        {
            pushupYap(sayisi);
        }
        else if(hareketTuru.equals("pushup"))
        {
            squadYap(sayisi);
        }
        else {
            System.out.println("Geçerli bir hareket giriniz");
        }


    }
    public void burpyYap(int sayisi){
        if(this.burpy == 0){
            System.out.println("Yapacak burpy kalmadı...");
        }
        if(this.burpy - sayisi < 0){
            System.out.println("Hedefi gerçekleştirdin.");
            this.burpy = 0;
            System.out.println("Kalan burpy sayısı " + this.burpy);
        }
        else {
            this.burpy = this.burpy - sayisi;
            System.out.println("Kalan burpy sayısı" + this.burpy);
        }
    }
    public void pushupYap(int sayisi){
        if(this.pushup == 0){
            System.out.println("Yapacak pushup kalmadı...");
        }
        if(this.pushup - sayisi < 0){
            System.out.println("Hedefi gerçekleştirdin.");
            this.pushup = 0;
            System.out.println("Kalan pushup sayısı" + this.pushup);
        }
        else {
            this.pushup = this.pushup - sayisi;
            System.out.println("Kalan pushup sayısı" + this.pushup);
        }
    }
    public void squadYap(int sayisi){
        if(this.squad == 0){
            System.out.println("Yapacak squad kalmadı...");
        }
        if(this.squad - sayisi < 0){
            System.out.println("Hedefi gerçekleştirdin.");
            this.squad = 0;
            System.out.println("Kalan squad sayısı" + this.squad);
        }
        else {
            this.squad = this.squad - sayisi;
            System.out.println("Kalan burpy sayısı" + this.squad);
        }
    }

    public boolean idmanBittMi(){
        return (this.squad == 0) && (this.burpy == 0) && (this.pushup == 0);
    }

}
