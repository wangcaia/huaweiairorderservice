package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHuaweiairorderservice {

    HuaweiairorderserviceImpl huaweiairorderserviceImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        huaweiairorderserviceImpl = BeanUtils.getBean("huaweiairorderserviceImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: huaweiairorderserviceImpl.add(Integer a, Integer b)
        Integer returnValue = huaweiairorderserviceImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderserviceImpl.sayHei(String name)
        String returnValue = huaweiairorderserviceImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderserviceImpl.sayHello(String name)
        String returnValue = huaweiairorderserviceImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderserviceImpl.sayHi(String name)
        String returnValue = huaweiairorderserviceImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: huaweiairorderserviceImpl.saySomething(String prefix, Person user)
        String returnValue = huaweiairorderserviceImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



