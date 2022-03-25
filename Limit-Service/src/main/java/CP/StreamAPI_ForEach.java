package CP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI_ForEach {

    public static void main(String[] args) {

        List<Integer> num = List.of(1,2,3,4,5,6,7);

        // Stream For Each wll take a consumer functional interface as param
        num.stream()
                .forEach((var)-> System.out.println(var));

        // How to use it in Map?
        Map<Integer,String> myMap = new HashMap<>();

        myMap.put(1,"val-1");
        myMap.put(2,"val-2");
        myMap.put(3,"val-3");
        myMap.put(4,"val-4");
        myMap.put(5,"val-5");

        //Directly use for each
        myMap.forEach((key,val)-> System.out.println(key+" : "+val));

        // How about other pipelined methods?

        myMap.entrySet().stream()
                .filter((key)->key.getKey()%2==0 ).forEach(System.out::println);


        System.out.println("--------- Removing Odd Keyset -------");

        myMap.keySet().removeAll(
          myMap.entrySet()
                  .stream()
                  .filter(obj-> obj.getKey()%2==1)
                  .collect(Collectors.toList())
        );

        List<Map.Entry<Integer, String>> collect = myMap.entrySet()
                .stream()
                .filter(obj -> obj.getKey() % 2 == 1)
                .collect(Collectors.toList());

        myMap.forEach((key,value)-> System.out.println(key+"  : "+value));

    }
}
