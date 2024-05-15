public class beybladeFabrikası {
    public Beyblade beybladeUret(String beybladeTuru){
        if(beybladeTuru.equals("Dragon")){
            return new Dragon("takao",800,800,"Mavi Ejderha","Kutsal canvar ile konuşmak");
        }
        else if(beybladeTuru.equals("Dranza")){
            return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu");
        }
        else if(beybladeTuru.equals("Drayga")){
            return new Drayga("Rei",400,1000,"Beyaz KAplan");
        }
        else if(beybladeTuru.equals("Draciel")){
            return new Draciel("Max",800,250,"Mavi Kaplumbağ");
        }
        else
            return null;
    }
}
