import lambda.Test1;
import lambda.Test2;
import object.LongJuanFeng;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    private static void init() {
        logger.info("--------------------------------------------------log info : {}--------------------------------------------------",new Date().toString());
        logger.info("-------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        init();
        //Test1 test1 = new Test1();
        //test1.doTest();

        //Test2 test2 = new Test2();
        //test2.doTest();

    }

    /*class InterfaceTestImpl implements InterfaceTest {
        @Override
        public int testReturn1() {
            return 1;
        }
    }*/
}
