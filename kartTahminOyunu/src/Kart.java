public class Kart {
    private char deger;
    private boolean tahmin = false;

    public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean istahmin() {
        return tahmin;
    }

    public void settahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
