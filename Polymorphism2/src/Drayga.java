public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalcanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalcanavar;
    }

    @Override
    public void kutsalCanavarCikar() {
        super.kutsalCanavarCikar();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın Saldırısı Aslan Pençesi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
    }
}
