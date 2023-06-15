package HashMapEg;

import java.util.HashMap;

public class HashMapEg {

    public static void main(String args[]){
        HashMap<String,String> countryCities = new HashMap<String,String>();
        countryCities.put("England","London");
        countryCities.put("Japan","Tokyo");
        countryCities.put("Nepal","Kathmandu");
        countryCities.put("India","Delhi");

        System.out.println();

        System.out.println(countryCities.get("England"));
        System.out.println(countryCities.size());
        System.out.println();

        for(String i: countryCities.values()){
            System.out.println(i);
        }
        System.out.println();

        for(String i: countryCities.keySet()){
            System.out.println(i);
        }

        System.out.println();






        System.out.println(countryCities.values());

        HashMap<String, Integer> nameAge = new HashMap<String, Integer>();
        nameAge.put("Rajan", 30);
        nameAge.put("Manoj", 25);
        nameAge.put("Enid", 26);
        nameAge.put("Dipesh",25);


        





    }
}
