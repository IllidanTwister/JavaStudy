package com.study.javaweb.test1;

import com.study.javaweb.test1.service.MyNo01Service;
import com.study.javaweb.test1.service.RestTempleTestService;
import org.junit.Assert;
import org.junit.Test;

public class ServiceTests extends BaseTest {

    @Test
    public void test1() {
        MyNo01Service service = new MyNo01Service();
        Assert.assertEquals(Long.valueOf(0L), service.doService01());
    }

    @Test
    public void test2() {
        RestTempleTestService restTempleTestService = new RestTempleTestService();
        restTempleTestService.httpHeadTest();
    }
}
