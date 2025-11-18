import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        //HashMap<Integer,String> map = new HashMap<>(17,.50f);
        HashMap<Integer,String> map = new HashMap();

        //index = hashcode % initial Capacity; 16



        map.put(100000,"Rakesh");
        map.put(102,"Ramesh");
        map.put(103,"Rakesh");
        map.put(104,"Ramesh");
        map.put(105,"Rakesh");
        map.put(106,"Ramesh");
        map.put(107,"Rakesh");
        map.put(108,"Ramesh");
        map.put(109,"Rakesh");
        map.put(10,"Ramesh");
        map.put(13,"Rakesh");
        map.put(4,"Ramesh");
        map.put(5,"Rakesh");
//        map.put(135,"Ramesh");


        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(map);
        System.out.println(table.length);

        for (Integer i : map.keySet()) {
            System.out.println(i.hashCode() + " "+ i.hashCode() % table.length);

        }

        HashMap<Integer,String> hm = new LinkedHashMap<>();





/*
        System.out.println(map.get(1355));
        System.out.println(map.containsKey(1355));
        System.out.println(map.containsValue("Suresh"));
*/

        /*Set<Integer> keys = map.keySet();

        for(Integer key : keys){
            System.out.println(key.hashCode());
        }
*/


        /*map.put(16,"Ramesh");
        map.put(70,"Rakesh");
        map.put(18,"Ramesh");*/
        //map.put(null,"Ramesh");
        //map.put(null,"Rakesh");

        /*Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(map);
        System.out.println(table.length);

        //System.out.println(map.get(101));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Set<Integer> integers= map.keySet();

        for (Integer i : map.keySet()) {
            System.out.println(i.hashCode() + " "+ i.hashCode() % table.length);

        }

        *//*for(Map.Entry<Integer, String> sd : entries){
            sd.setValue(sd.getValue().toUpperCase());
        }*//*
        System.out.println(entries);
*/
       //Buckets : A place where key-value pairs are stored. Think of a bucket as cells in a array
        //Converts a key into a index(bucket location) for storage

        //key, value, Bucket, Hash Function



    }
}
