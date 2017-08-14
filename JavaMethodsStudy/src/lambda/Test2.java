package lambda;

import object.LongJuanFeng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

public class Test2 {

    public void doTest() {
        List list = new ArrayList<LongJuanFeng>();
        Random random = new Random();
        for(int i = 0; i < 5 ; i++) {
            list.add(new LongJuanFeng("job" + i, random.nextBoolean(), Math.abs(random.nextLong() % 100)));
        }

        list.forEach(n -> System.out.println("LongJuanFeng origin :\n" + n));
        System.out.println();

        myFunc1(list);
        list.forEach(n -> System.out.println("myFunc1 :\n" + n));
        System.out.println();

        myFunc2(list, n -> n.getWork().equals("job1"));
        System.out.println();

    }

    private List myFunc1(List<LongJuanFeng> list) {
        list.forEach(n -> n.setDickLength(n.getDickLength()+1));
        return list;
    }

    private void myFunc2(List<LongJuanFeng> list, Predicate<LongJuanFeng> condition) {
        list.forEach(n -> System.out.println(condition.test(n) ? n : "fail"));
    }

    private List<LongJuanFeng> myFunc3(List<LongJuanFeng> list, Long dickLen) {
        list.stream().filter(a -> a.getDickLength() > dickLen);
        return null;////
    }


}
