import jUnit1.MyMath;
import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)// ожидаем что при этом тесте будет выброс этого исключения
    public void zeroDenominatorShouldThrowException(){
        MyMath.divide(1,0);
    }
}
