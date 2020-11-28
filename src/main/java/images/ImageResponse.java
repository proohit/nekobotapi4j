package images;

import kong.unirest.json.JSONObject;

public class ImageResponse {
    private long color;
    private String message;
    private boolean success;
    private String version;

    public ImageResponse(JSONObject response) {
        this.color = response.getLong("color");
        this.message = response.getString("message");
        this.success = response.getBoolean("success");
        this.version = response.getString("version");
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
