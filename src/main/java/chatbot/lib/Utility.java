package chatbot.lib;

/**
 * Created by ramgathreya on 5/23/17.
 */
public class Utility {
    public static String generateImageUrl(String baseUrl, String imageUrl) {
        if(imageUrl.startsWith("http") == true) {
            return imageUrl;
        }
        else {
            return baseUrl + imageUrl;
        }
    }
}
