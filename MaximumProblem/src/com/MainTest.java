package com;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testFindMax(){
        Integer x = 8;
        Integer y = 5;
        Integer z = 2;
        Assertions.assertEquals(8, FindMaximum.findMax(x,y,z));
    }

}