import generators.ImageGenerators;
import images.ImageEndpoints;

public class NekobotApi {
    private ImageEndpoints imageEndpoints;
    private ImageGenerators imageGenerators;

    public NekobotApi() {
        this.imageEndpoints = new ImageEndpoints();
        this.imageGenerators = new ImageGenerators();
    }

    public ImageEndpoints getImageEndpoints() {
        return this.imageEndpoints;
    }

    public ImageGenerators getImageGenerators() {
        return this.imageGenerators;
    }
}
