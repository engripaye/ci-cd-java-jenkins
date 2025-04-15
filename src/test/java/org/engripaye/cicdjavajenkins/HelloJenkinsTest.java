package org.engripaye.cicdjavajenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJenkinsTest {
    @Test
    public void TestGreet(){
        assertEquals("Hello CI/CD", HelloJenkins.greet());
    }

}