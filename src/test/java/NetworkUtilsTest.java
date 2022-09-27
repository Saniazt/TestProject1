import jUnit1.NetworkUtils;
import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000) // что наш метод исполнится быстрее секнуды
    public void getConnectionShouldReturnFasterThanOneSecond(){
        NetworkUtils.getConnection();
    }
}
