import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TesterHomeTest {
    @Test
    public void topics(){
        //https网站证书
        //useRelaxedHTTPSValidation();
        get("https://testerhome.com/api/v3/topics.josn")
                .then()
                .body("topics[0].title", containsString("哈哈"));
    }
}
