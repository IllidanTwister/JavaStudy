import lambda.Test1;
import lambda.Test2;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import object.LongJuanFeng;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    private static void init() {
        logger.info("--------------------------------------------------log info : {}--------------------------------------------------",new Date().toString());
        logger.info("-------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        init();
        Map<String, String> map = new HashMap<>();
        map.put("1", "11");
        map.put("2", "12");
        map.put("3", "13");
        map.put("4", "14");
        List<Map> list = new ArrayList<>();
        list.add(map);
        map.put("6","16");
        list.add(map);

        LongJuanFeng tmp = new LongJuanFeng("123", true, 999L);
        LongJuanFeng tmp2 = new LongJuanFeng("321", true, 888L);

        List<LongJuanFeng> list2 = new ArrayList<>();
        list2.add(tmp);
        list2.add(tmp);
        list2.add(tmp2);

        String line = "tuoFengFa";
        line=String.valueOf(line.charAt(0)).toUpperCase().concat(line.substring(1));
        StringBuffer sb=new StringBuffer();
        Pattern pattern=Pattern.compile("[A-Z]([a-z\\d]+)?");
        Matcher matcher=pattern.matcher(line);
        while(matcher.find()){
            String word=matcher.group();
            sb.append(word.toLowerCase());
            sb.append(matcher.end()==line.length()?"":"_");
        }

        System.out.println(sb.toString());
        //int a = Integer.parseInt( map2.get("1").toString());
        //System.out.println(a);
        //Test1 test1 = new Test1();
        //test1.doTest();

        //Test2 test2 = new Test2();
        //test2.doTest();

    }

    public static void fun(String a) {
        System.out.println(a);
    }

    /*class InterfaceTestImpl implements InterfaceTest {
        @Override
        public int testReturn1() {
            return 1;
        }
    }*/
}
