package app.HttpClientService;

import core.framework.inject.Inject;
import core.framework.json.JSON;
import core.framework.log.Markers;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author Cheffey
 */
public class HttpRequest {
    private final Logger logger = LoggerFactory.getLogger(HttpRequest.class);
    @Inject
    HttpClientConfig httpClientConfig;

    public HttpResponse PUT(String url, Object entity, HashMap headersMap) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        HttpPut httpPut = new HttpPut(url);
        httpPut.setConfig(httpClientConfig.config);
        List<Header> headersList = new ArrayList<Header>();
        Set headersKey = headersMap.keySet();
        for (Object key : headersMap.keySet()) {
            headersMap.get(key);
        }
        httpPut.setHeaders(headers);
        try {
            HttpEntity requestEntity = new StringEntity(JSON.toJSON(entity));
            httpPut.setEntity(requestEntity);
            response = httpClient.execute(httpPut);
            httpClient.close();
        } catch (UnsupportedEncodingException e) {
            logger.error(Markers.errorCode("entity"), "entity format unsupported", e);
        } catch (IOException e) {
            logger.error(Markers.errorCode("IO"), "HttpClientClose", e);
        }
        return null;
    }

    private HttpResponse toHttpResponse(org.apache.http.HttpResponse httpResponse) {

    }
}

