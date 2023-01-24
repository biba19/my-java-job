package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleClassTest {
@Test
void SampleTest (){
        final int CHOSEN_VALUE =5;
        SampleClass sampleClass = new SampleClass(CHOSEN_VALUE);
        assertEquals(CHOSEN_VALUE,sampleClass.getNumber());
    }

}