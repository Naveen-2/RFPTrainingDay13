package com;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testFindMax(){
        Assertions.assertEquals("Peach", FindMaximum.findMax("Peach","Apple","Banana"));// returns first position TC1.1
        Assertions.assertEquals("Peach",FindMaximum.findMax("Apple","Peach","Banana"));// returns second position TC1.2
        Assertions.assertEquals("Peach",FindMaximum.findMax("Apple","Banana", "Peach"));// returns third position TC1.3
    }


}