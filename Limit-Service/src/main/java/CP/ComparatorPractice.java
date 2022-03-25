package CP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//public class ComparatorPractice implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.compareTo(o2);
//    }
//
//    public static void main(String[] args) {
//
//        List<String> myList = new ArrayList<>();
//
//        myList.add("Abbu");
//        myList.add("YYYYY");
//        myList.add("Ammu");
//        myList.add("Shohagi Apa");
//        myList.add("Sheuly");
//        myList.add("Hamim");
//        myList.add("Fatiha");
//        myList.add("Shohan");
//        myList.add("ZZZZ");
//
//        ComparatorPractice comparatorPractice = new ComparatorPractice();
//
//        Collections.sort(myList, comparatorPractice);
//
//        for (String val:
//             myList) {
//            System.out.println(val);
//        }
//
//    }
//}

public class ComparatorPractice{



    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Abbu");
        myList.add("YYYYY");
        myList.add("Ammu");
        myList.add("Shohagi Apa");
        myList.add("Sheuly");
        myList.add("Hamim");
        myList.add("Fatiha");
        myList.add("Shohan");
        myList.add("ZZZZ");


        Collections.sort(myList, (o1,o2) -> o2.compareTo(o1));

        for (String val:
                myList) {
            System.out.println(val);
        }

    }
}
