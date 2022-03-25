package CP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Traditional Way of Functional Interface

//public class ConsumerPractice implements Consumer<Integer> {
//
//    public static void main(String[] args) {
//        ConsumerPractice consumerPractice =new ConsumerPractice();
//        consumerPractice.accept(123456);
//    }
//
//    @Override
//    public void accept(Integer integer) {
//        String val = "Integer Conversion: "+String.valueOf(integer)+"  To:  "+String.valueOf(integer);
//        System.out.println(val);
//    }
//}

/*
    Using Consumer without functional interface
 */
public class ConsumerPractice{

    public static void main(String[] args) {
        Consumer<Integer>  consumer1 = System.out::println;
        Consumer<Integer>  consumer2 = (val) -> System.out.println(val+1);


        List<Integer> myList = Arrays.asList(1,2,3,4,5);

        myList.stream().forEach(consumer2);

    }

}


