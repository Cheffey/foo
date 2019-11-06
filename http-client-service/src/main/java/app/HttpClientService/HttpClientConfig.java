package app.HttpClientService;

import core.framework.impl.module.Config;
import core.framework.impl.module.ModuleContext;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author Cheffey
 */
public class HttpClientConfig extends Config {
    private final Logger logger = LoggerFactory.getLogger(HttpClientConfig.class);
    RequestConfig config = RequestConfig.DEFAULT;
    HashMap publicHeaders = new HashMap();
    private ModuleContext context;
    private String name;

    @Override
    protected void initialize(ModuleContext context, String name) {
        this.context = context;
        this.name = name;
    }

    public void proxy(String hostname, int port, String scheme) {
        config = RequestConfig.custom().setProxy(new HttpHost(hostname, port, scheme)).build();
    }

    public void resetRequestConfig() {
        config = config.DEFAULT;
    }

    public void addPublicHeader(String key, String value) {
        publicHeaders.put(key, value);
    }
}
