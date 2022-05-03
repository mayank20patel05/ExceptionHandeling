package generics;

import java.util.Arrays;
import java.lang.Integer;

public class Run {
    public static void main(String[] args) {

        MayankArray<String> a = new MayankArray<>();

        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        a.add("10");
        a.add("11");

        a.print();

        System.out.println(a.contains("11"));

        a.remove("8");

        a.print();
    }
}
