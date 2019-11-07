import app.HttpClientService.HttpClientConfig;
import app.HttpClientService.HttpRequest;
import core.framework.module.App;

/**
 * @author Cheffey
 */
public class HttpTestApp extends App {
    @Override
    protected void initialize() {
        bind(HttpClientConfig.class).proxy().addPublicHeader("Content-type", "application/json");
        bind(HttpRequest.class);
    }
}
