package com;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testFindMax(){
        Assertions.assertEquals(8.8, FindMaximum.findMax(8.8,3.5,1.2));// returns first position TC1.1
        Assertions.assertEquals(23.34,FindMaximum.findMax(5.9, 23.34, 12.25));// returns second position TC1.2
        Assertions.assertEquals(90.84,FindMaximum.findMax(54.28,18.01,90.84));// returns third position TC1.3
    }


}