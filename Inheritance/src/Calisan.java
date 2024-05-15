public class Calisan { //superclass veya mainclass
    private String isim;
    private int maas;
    private String departmant;

    public Calisan(String isim, int maas, String departmant) {
        this.isim = isim;
        this.maas = maas;
        this.departmant = departmant;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public void bilgileriGoster(){
        System.out.println(this.isim);
        System.out.println(departmant);
        System.out.println(maas);
    }





}
