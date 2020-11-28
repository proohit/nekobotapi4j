package images;

import requests.ImageRequestExecutor;

public class ImageEndpoints {

    ImageRequestExecutor imageRequestExecutor = new ImageRequestExecutor();

    public String getPgifImageUrl() throws ImageException {
        return imageRequestExecutor.getImageResponse(ImageEndpointTypes.PGIF).getMessage();
    }

    public String getThighImageUrl() throws ImageException {
        return imageRequestExecutor.getImageResponse(ImageEndpointTypes.THIGH).getMessage();
    }

    public String getNekoImageUrl() throws ImageException {
        return imageRequestExecutor.getImageResponse(ImageEndpointTypes.NEKO).getMessage();
    }

}
