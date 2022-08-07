package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void test1 () {
        SQRService service = new SQRService();

        int actual = service.computation (150, 350);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test2 () {
        SQRService service = new SQRService();

        int actual = service.computation (100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
