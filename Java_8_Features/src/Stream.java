import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


      public static void main(String[] args) {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

            list.stream()
                    .filter(n -> n % 2 == 0)
                    .forEach(System.out::println);

          List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

          nums.stream()
                  .filter(n -> n > 20)
                  .forEach(System.out::println);

          List<Integer> nums4 = Arrays.asList(1, 2, 3, 4);

          List<Integer> result1 = nums4.stream()
                  .map(n -> n * n)
                  .collect(Collectors.toList());

          System.out.println(result1);

          List<Integer> nums3 = Arrays.asList(5, 2, 8, 1);

          nums3.stream()
                  .sorted()
                  .forEach(System.out::println);

          List<Integer> nums2 = Arrays.asList(1, 2, 2, 3, 3, 4);

          List<Integer> result = nums2.stream()
                  .distinct()
                  .collect(Collectors.toList());

          System.out.println(result);

          List<Integer> nums1 = Arrays.asList(10, 20, 30, 40);

          int sum = nums1.stream()
                  .reduce(0, (a, b) -> a + b);

          System.out.println(sum);
        }
}
