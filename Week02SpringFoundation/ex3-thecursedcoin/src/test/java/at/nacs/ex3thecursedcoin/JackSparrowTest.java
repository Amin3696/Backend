package at.nacs.ex3thecursedcoin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JackSparrowTest {
    @Autowired
    JackSparrow jackSparrow;

    @Test
    void findCoin() {
        String actual = jackSparrow.findCoin();
        String expected = "I found the CursedCoin!";

        Assertions.assertEquals(expected, actual);
    }
}