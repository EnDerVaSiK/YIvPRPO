import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;

public class CalculatorSteps {
    private Calculator calculator;
    private int result;

    @Дано("^калькулятор включен$")
    public void калькуляторВключен() {
        calculator = new Calculator();
    }

    @Когда("^я складываю (\\d+) и (\\d+)$")
    public void яСкладываю(int a, int b) {
        result = calculator.add(a, b);
    }

    @Тогда("^на экране должен быть результат (\\d+)$")
    public void наЭкранеДолженБытьРезультат(int expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
}
