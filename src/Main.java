import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ToUpperCaseConverter implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> nums = List.of("one", "two", "three");
        ToUpperCaseConverter converter = new ToUpperCaseConverter();
        nums.stream().map(String::toUpperCase).forEach(converter);

        Stream<String> myStream = Stream.of("one", "two", "three");
        myStream.forEach(item -> System.out.println(item));

        IntStream intStream = IntStream.range(1, 101);
        intStream.forEach(item -> System.out.print(item + " "));

        IntStream.range(1, 51).boxed().map(item -> item.toString()).forEach(System.out::println);


        System.out.println(IntStream.range(1,10).boxed().map(item -> item.toString()).toArray(item -> new String[9]));
    }
}
