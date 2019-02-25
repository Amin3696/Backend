package at.nacs.ex2amazinghelloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AmazingHelloWorldTest {

    @Autowired
   AmazingHelloWorld amazingHelloWorld;

    @Test
    void say() {
        String result = amazingHelloWorld.sayHello();

        String expected = "Hello World";
        Assertions.assertEquals(expected,result);
    }
}