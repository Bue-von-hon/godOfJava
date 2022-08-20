import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefTest {

    static void func1(List<Integer> arr) {
        System.out.println("call func1");
        System.out.println("변경 전 : "+arr.toString());
        arr = Arrays.asList(4, 5, 6);
        System.out.println("변경 후 : "+arr.toString());
    }

    static void func2(final List<Integer> arr) {
        System.out.println("call func2");
        System.out.println("변경 전 : "+arr.toString());
        // final로 선언한 파라미터라 아래와 같이 변경하게 되면 컴파일 에러가 출력된다
        //arr = Arrays.asList(4, 5, 6);
        //System.out.println("변경 후 : "+arr.toString());
    }

    public static void main(String[] args) {
        func1(Arrays.asList(1, 2, 3));
        func2(Arrays.asList(1, 2, 3));
    }
}
