package collection.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    static void main() {
        Map<String,Integer> hs= new HashMap<>();
        hs.put("Mayank",12);
        hs.put("Sonal",15);
        hs.put("Sonals",11);
        hs.put("Sonalsa",10);
        System.out.println(hs.get("Sonal"));
        System.out.println(hs);



        //    Fetching all Keys
        for (String data:hs.keySet()){
            System.out.println(data);
        }


        //    fetch for the all values
        for(Integer data1 :hs.values()){
            System.out.println(data1);
        }

//        map entitty
        for (Map.Entry<String, Integer> entry:hs.entrySet()){
            System.out.println("Keys :"+entry.getKey()+ " Values :"+entry.getValue());
        }

//        Java8 foreach method
        hs.forEach((Key, Value)-> {
            System.out.println("Key :" + Key);
            System.out.println("Values :"+Value);
        });
    }

}




