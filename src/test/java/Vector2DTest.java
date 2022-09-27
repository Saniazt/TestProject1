import jUnit1.Vector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9; //1e-9 = 0.000......01
    private static Vector2D v1;
    @BeforeClass //выполняется один раз, STATIC
    public static void createNewVector(){
        v1 = new Vector2D();
    }
    @Test
    public void newVectorShouldHaveZeroWeight(){
        Assert.assertEquals(0,v1.length(),EPS);//assertion
    }
    @Test
    public void newVectorShouldHaveZeroXAndZeroY(){ // но так делать не стоит, лучше отдельно
        Assert.assertEquals(0,v1.getX(),EPS);
        Assert.assertEquals(0,v1.getY(),EPS);
    }
}
