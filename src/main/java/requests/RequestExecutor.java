package requests;

import kong.unirest.GetRequest;
import kong.unirest.Unirest;

public abstract class RequestExecutor {
    private String BASE_URL = "https://nekobot.xyz/api";

    public GetRequest getRequest(String url) {
        return Unirest.get(BASE_URL + url);
    }
}
