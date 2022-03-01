package com;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testFindMax(){
        Assertions.assertEquals(8, FindMaximum.findMax(8,5,2));// returns first position TC1.1
        Assertions.assertEquals(34,FindMaximum.findMax(5, 34, 25));// returns second position TC1.2
        Assertions.assertEquals(90,FindMaximum.findMax(54,18,90));// returns third position TC1.3
    }


}