public class MakineMuhendis implements IMuhendis{
    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendis(boolean askerlik, boolean adliSicil) {
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
        if (array.length == 0){
            System.out.println("İş tecrübesi bulunmuyor");
        }
        else {
            for (String s: array) {
                System.out.println(s);
            }
        }
    }

    public void referansSorgula(String[] array){

        if (array.length == 0){
            System.out.println("Referans bulunmuyor");
        }
        else {
            for (String s: array) {
                System.out.println(s);
            }
        }
    }
}
