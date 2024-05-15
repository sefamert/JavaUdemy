public class PcMuhendis implements IMuhendis{
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendis(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik){
            System.out.println("Askerliğimi yaptım");
        }
        else
            System.out.println("Askerliğim yapmadım");
    }

    @Override
    public String mezuniyetDurumuSorgula(double derece) {
        return "Ortalama" + derece;
    }

    @Override
    public void adliSicilKaydıSorgula() {
        if (adliSicil){
            System.out.println("Adli Sicil Kaydı var");
        }
        else
            System.out.println("Adli Sicil Kaydı yok");

    }

    @Override
    public void isTecrubesiSorgula(String[] array) {
        for (String s: array) {
            System.out.println(s);
        }
    }
}
