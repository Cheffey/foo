package app;

import app.order.web.HomeController;
import core.framework.module.Module;

import static core.framework.http.HTTPMethod.GET;
import static core.framework.http.HTTPMethod.POST;

/**
 * @author Cheffey
 */
public class WebModule extends Module {
    @Override
    protected void initialize() {
        HomeController home = bind(HomeController.class);
        http().route(POST, "/", home::search);
        http().route(GET, "/:id", home::get);
    }
}
