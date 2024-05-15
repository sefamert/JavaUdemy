import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>();

        arrayList.add("Metalice");
        arrayList.add("Duman");
        arrayList.add("Redd");
        arrayList.add("Metalice");

        /*System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(5));

        System.out.println(arrayList.size());*/

        System.out.println(arrayList.size());
        for (String a : arrayList){
            System.out.println(a);
        }

        System.out.println();
        //arrayList.remove("Metalice");
        //arrayList.remove(1);

        System.out.println(arrayList.indexOf("Metalice"));
        System.out.println(arrayList.lastIndexOf("Metalice"));
        System.out.println();

        arrayList.set(3,"Degisti");
        for (String a : arrayList){
            System.out.println(a);
        }
    }
}
