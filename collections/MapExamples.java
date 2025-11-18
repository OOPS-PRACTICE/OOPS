import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap();
        map.put(102,"Ramesh");
        map.put(103,"Rakesh");
        map.put(104,"Ramesh");
        map.put(105,"Rakesh");
        //map.put(106,null);
        //map.put(107,null);
        map.put(108,"Ramesh");
        map.put(109,"Rakesh");
        //map.put(null,"Suresh");

        Set<Integer> keys = map.keySet();
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for(Integer key : keys){
            System.out.println(key);
        }

        for(Map.Entry<Integer, String> mapDetails : entrySet){
            mapDetails.setValue(mapDetails.getValue().toUpperCase());

        }

        map.remove(103);
        map.remove(108,"Ramesh");
        map.isEmpty();
        map.replace(108, "Ramesh","Suresh");
        map.size();

        System.out.println(map);

        HashMap<String,Integer> stringMap = new HashMap<>();
        stringMap.put("Ramesh", 102);
        stringMap.put("Rakesh", 103);
        stringMap.put("Suresh",104);
        Set<String> stringKeys = stringMap.keySet();
        for(String key : stringKeys){
            System.out.println(key + "  " + key.hashCode());
        }


    }
}
