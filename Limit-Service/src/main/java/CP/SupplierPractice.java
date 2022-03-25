package CP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierPractice implements Supplier<Integer> {
//    @Override
//    public Integer get() {
//        return 786;
//    }
//
//    public static void main(String[] args) {
//        SupplierPractice practice = new SupplierPractice();
//        System.out.println(practice.get());
//    }
//}

public class SupplierPractice {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
          return 123;
        };

        System.out.println(supplier.get());


        // Mainly used inside orElse

        List<Integer> nums = List.of();

        int v = nums.stream()
                .findAny().orElseGet(()-> 54);

        System.out.println(v);

    }
}
