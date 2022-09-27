import jUnit1.Vector2D;
import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroWeight(){
        Vector2D v1 =new Vector2D(); //action - создали новый вектор

        Assert.assertEquals(0,v1.length(),1e-9);//assertion
        //1e-9 = 0.000......01
    }
    @Test
    public void newVectorShouldHaveZeroX(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0,v1.getX(),1e-9);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Vector2D v1 = new Vector2D();
        Assert.assertEquals(0,v1.getY(),1e-9);
    }
}
