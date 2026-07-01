package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class M1_HashMap {
    public static void main(String[] args) {
        Map <String , String > mapping = new HashMap<>();
        mapping.put("In", "India");
        mapping.put("In", "Indiaa");
        mapping.put("Us", "United States");
        mapping.put("Tk", "Turkey");

        System.out.println(mapping);

        Map <String , String > Table = new HashMap<>();

        // put is used for insertion
        Table.put("Pk", "Pakistan");
        Table.put("Bd", "BanglaDesh");
        Table.put("Nz", "NewzeeLand");

        System.out.println("Mapping Before : " + mapping);

        // put all is used to put all the elements into one class object 
        mapping.putAll(Table);
        System.out.println("Mapping after putAll method " + mapping);


        // keySet() returns summry of all the keys in object

        Set <String> keySet = Table.keySet();
        System.out.println("Printing KeySet : " + keySet);

        Collection <String> valueSet = Table.values();
        System.out.println("Printing ValueSet : " + valueSet);

        Set <Map.Entry<String,String>> EntrySet = Table.entrySet();
        System.out.println("Printing EntrySet : " + EntrySet);
        }
}
