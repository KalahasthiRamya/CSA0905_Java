package Tree_Map;
import java.util.*;

public class Main {
    public static void main(String[] args){
        TreeMap<Integer,String> TM = new TreeMap<>();

        TM.put(101,"John");
        TM.put(102,"David");
        TM.put(103,"Rahul");
        TM.put(104,"Shiva");
        TM.put(105,"Raju");

        Iterator<Map.Entry<Integer,String>> Itm = TM.entrySet().iterator();
        while(Itm.hasNext()){
            System.out.println(Itm.next());
        }

        System.out.println("-----------------------------------");

        System.out.println("Get Method : "+TM.get(101));
        System.out.println("Contains Key Method : "+TM.containsKey(103));
        System.out.println("Contains Value Method : "+TM.containsValue("Ram"));
        System.out.println("Size of EntrySet : "+TM.size());
        System.out.println("Size of ValueSet : "+(TM.values()).size());
        System.out.println("Size of KeySet : "+(TM.keySet()).size());
        System.out.println("Key Set : "+TM.keySet());
        System.out.println("Values : "+TM.values());
        System.out.println("Entry Set : "+TM.entrySet());

        System.out.println("-----------------------------------");

        TM.remove(101);

        for(Map.Entry<Integer,String> e : TM.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }

        System.out.println("-----------------------------------");
        TM.clear();
        System.out.println("Is Empty Method : "+TM.isEmpty());

        System.out.println("-----------------------------------");
        TM.putIfAbsent(101,"Ram");
        TM.putIfAbsent(102,"Sita");

        TM.replace(102,"Hanuman");
        TM.replaceAll((k,v)->v.toUpperCase());

        TM.forEach((k,v)->System.out.println(k+" : "+v));

        System.out.println("-----------------------------------");

        Iterator<Integer> I1 = TM.keySet().iterator();
        while(I1.hasNext()){
            System.out.println(I1.next());
        }

        System.out.println();

        for(String I2 : TM.values()){
            System.out.println(I2);
        }

    }
}
