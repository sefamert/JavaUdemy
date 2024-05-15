public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE","ASUS","18.5",resolution);
        Kasa kasa = new Kasa("shadow blade","shadow","temperli cam");
        Anakart anakart = new Anakart("b250","ASUS",10,"Windows 10");
        Bilgisayar bilgisayar = new Bilgisayar(monitor,kasa,anakart);

        bilgisayar.getKasa().bilgisayariAc();
        bilgisayar.getMonitor().monitoruKapat();
        bilgisayar.getAnakart().isletimSistemiYukle("ubuntu");
    }
}
