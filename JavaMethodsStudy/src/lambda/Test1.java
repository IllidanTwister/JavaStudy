package lambda;

import java.util.*;

//lambda表达式测试
public class Test1 {
    public void doTest() {
        List<String> list = Arrays.asList("aboluo", "mimiya", "justimoer", "fugury", "qouseng");

        sortTest1(list);
        sortTest2(list);
        sortTest3(list);
        sortTest4(list);
        sortTest5(list);
        sortTest6(list);

        System.out.println(list);
    }

    private List<String> sortTest1(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        return list;
    }

    private List<String> sortTest2(List<String> list) {
        Collections.sort(list, (String a, String b) -> {return b.compareTo(a);});
        return list;
    }

    private List sortTest3(List<String> list) {
        Collections.sort(list, (a,b)->a.compareTo(b));
        return list;
    }

    private List sortTest4(List<String> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    private List sortTest5(List<String> list) {
        Collections.sort(list, Comparator.naturalOrder());
        return list;
    }

    private List sortTest6(List<String> list) {
        Collections.sort(list, this::myRandCompare);
        return list;
    }

    private int myRandCompare(String a, String b) {
        Random random = new Random();
        return random.nextInt();
    }
}
