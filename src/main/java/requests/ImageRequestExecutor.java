package requests;

import images.ImageEndpointTypes;
import images.ImageException;
import images.ImageResponse;

public class ImageRequestExecutor extends RequestExecutor {

    private final String QUERY_TYPE = "type";
    private final String IMAGE_URL = "/image";

    public ImageResponse getImageResponse(ImageEndpointTypes type) throws ImageException {
        var jsonResponse = this.getRequest(IMAGE_URL).queryString(QUERY_TYPE, type.getType()).asJson().getBody()
                .getObject();
        var imageReponse = new ImageResponse(jsonResponse);

        if (!imageReponse.isSuccess()) {
            throw new ImageException(imageReponse.getMessage());
        }

        return imageReponse;
    }

}
