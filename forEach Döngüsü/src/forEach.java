public class forEach {

    public static void main(String[] args) {
        String[] arr = {"Elma","Armut","Kiraz"};
        Deneme[] deneme = {new Deneme("Sefa"), new Deneme("Baliz"), new Deneme("Enes")};

        for (Deneme a : deneme)
            System.out.println(a.getName());


        for(String a : arr)
            System.out.println(a);
    }
}
