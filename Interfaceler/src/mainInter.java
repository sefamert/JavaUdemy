public class mainInter {
    public static void main(String[] args) {
        //Interfacelerden bir obje oluşturamayız. Sadece Interfaceler onu implement eden classların onjelerine referans olabilir

        PcMuhendis muhendis1 = new PcMuhendis(false,false);

        muhendis1.askerlikDurumuSorgula();
        muhendis1.adliSicilKaydıSorgula();
        System.out.println(muhendis1.mezuniyetDurumuSorgula(3.07));
        String[] tecrube = {"Vestel","OBSS","Aselsan"};
        muhendis1.isTecrubesiSorgula(tecrube);

        MakineMuhendis muhendis2 = new MakineMuhendis(true,false);

        String[] tecrube2 = {};
        String[] referans = {"Emre","Kivanç"};
        muhendis2.isTecrubesiSorgula(tecrube2);
        muhendis2.referansSorgula(referans);
        muhendis2.adliSicilKaydıSorgula();
        muhendis2.askerlikDurumuSorgula();
        muhendis2.mezuniyetDurumuSorgula(2.5);
    }
}
