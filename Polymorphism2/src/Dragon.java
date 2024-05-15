public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }


    @Override
    public void kutsalCanavarCikar() {
        super.kutsalCanavarCikar();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + "ı ortaya çıkarıyor");
        System.out.println(getBeybladeci() + " ın Saldırısı Hayalet Kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı " + kutsalCanavar);
    }
}
