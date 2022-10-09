import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) throws IOException {
        List num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<String> file = Files.readAllLines(Paths.get("data.txt"));

//        file.forEach(System.out::println);

        file.stream()
                .skip(1)
                .limit(5)
                .forEach(System.out::println);
    }
}
