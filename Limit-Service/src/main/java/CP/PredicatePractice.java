package CP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicatePractice implements Predicate<Integer> {
//    @Override
//    public boolean test(Integer integer) {
//        return integer == 234 ? true : false;
//    }
//
//    public static void main(String[] args) {
//        PredicatePractice predicatePractice = new PredicatePractice();
//        System.out.println(predicatePractice.test(232));
//    }
//}

public class PredicatePractice {

    public static void main(String[] args) {

        Predicate<Integer> predicate = val -> val.equals(234);

        System.out.println(predicate.test(23));

        //Using Predicate find out all even & odd numbers from a list

        Predicate<Integer> Even = (val) ->  (val&1) == 0 ? true : false;
        Predicate<Integer> Odd = (val) ->  (val&1) == 1 ? true : false;

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        // Method - 1 : Create Predicate instance first then put it in filter
//        nums.stream()
//                .filter(Even).forEach(System.out::println);
//
//        nums.stream()
//                .filter(Odd).forEach(System.out::println);

        //Method - 2 : Direct put Predicate Parameter box and Expression and body inside filter
        nums.stream()
                .filter(val -> (val&1)==0).forEach(System.out::println);

        nums.stream()
                .filter(val -> (val&1)==1).forEach(System.out::println);


    }
}