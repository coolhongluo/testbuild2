package com.service.testlwh.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestlwh {

        TestlwhDelegate testlwhDelegate = new TestlwhDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testlwhDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}