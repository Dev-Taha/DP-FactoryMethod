package Application;

import SocialNetworkPoster.LinkedInPoster;
import SocialNetworkPoster.NetworkPoster;
import SocialNetworkPoster.TelegramPoster;
import SocialNetworkPoster.TwitterPoster;

public class main {
    public static void main(String[] args) {
        NetworkPoster post = new LinkedInPoster();
        post.Comment();
        post.Post();
    }
}
