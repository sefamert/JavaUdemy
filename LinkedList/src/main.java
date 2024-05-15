import java.util.LinkedList;
import java.util.ListIterator;

public class main {
    public static void listeyiBastir(LinkedList<String> gidilecekYerler){
        /*for (String s: gidilecekYerler) {
            System.out.println(s);
        }*/

        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void SiraliEkle(LinkedList<String> list, String yeni){
        ListIterator<String> iterator = list.listIterator();

        if (iterator.hasNext()){
            while (iterator.hasNext()){
                int comparison = iterator.next().compareTo(yeni);
                if (comparison == 0){
                    System.out.println("Bu değerin aynısı listenizde var");
                    return;
                }
                else if (comparison < 0){
                    //Yeni değer iterator.next ten daha büyük
                }
                else if (comparison > 0){
                    iterator.previous();
                    iterator.add(yeni);
                    return;
                }


            }
        }
        else
            iterator.add(yeni);

    }
    public static void main(String[] args) {
        LinkedList<String> gidilecekYerler = new LinkedList<>();

        SiraliEkle(gidilecekYerler,"Postane");
        SiraliEkle(gidilecekYerler,"Market");
        SiraliEkle(gidilecekYerler,"Ev");

        listeyiBastir(gidilecekYerler);

        /*gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Ev");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");

        listeyiBastir(gidilecekYerler);
        System.out.println("-----------------------------------");
        gidilecekYerler.add(4,"Alışveriş Merkezi");
        listeyiBastir(gidilecekYerler);

        System.out.println("-----------------------------------");
        gidilecekYerler.remove(3);
        listeyiBastir(gidilecekYerler);*/

    }
}
