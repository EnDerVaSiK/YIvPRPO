package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Создаем наш калькулятор
        Calculator calculator = new Calculator();
        // Вызываем метод сложения (именно этот вызов даст нам 100% покрытие)
        int result = calculator.add(5, 7);
        // Проверяем, что 5+7 действительно 12
        Assert.assertEquals(12, result);
    }
}
