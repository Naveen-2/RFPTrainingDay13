package com;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testFindMax(){
        Assertions.assertEquals("Peach", FindMaximum.findMax("Peach","Apple","Banana"));// returns first position TC1.1
        Assertions.assertEquals("Peach",FindMaximum.findMax("Apple","Peach","Banana"));// returns second position TC1.2
        Assertions.assertEquals("Peach",FindMaximum.findMax("Apple","Banana", "Peach"));// returns third position TC1.3
        Assertions.assertEquals(9, FindMaximum.findMax(9,8,5));// returns first position TC1.1
        Assertions.assertEquals(34,FindMaximum.findMax(23,34,12));// returns second position TC1.2
        Assertions.assertEquals(98,FindMaximum.findMax(24,56, 98));// returns third position TC1.3
        Assertions.assertEquals(9.3, FindMaximum.findMax(9.3,8.2,5.6));// returns first position TC1.1
        Assertions.assertEquals(34.21,FindMaximum.findMax(23.87,34.21,12.23));// returns second position TC1.2
        Assertions.assertEquals(98.76,FindMaximum.findMax(34.98,55.87, 98.76));// returns third position TC1.3
    }


}