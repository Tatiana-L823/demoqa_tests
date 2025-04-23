import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JUnitTest {

    @Test
    void firstTest() {
    Assertions.assertTrue(3>2);
    }
    @Test
    void simpleComparisonTest() {
        Assertions.assertTrue(3 > 2, "Expected 3 to be greater than 2");
    }

}
