import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args){
        List num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        num.stream()
                .skip(1)
                .limit(7)
                .forEach(obj -> System.out.print(obj));
    }
}
