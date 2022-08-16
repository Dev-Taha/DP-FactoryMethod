package SocialNetworkPoster;

import SocialNetworkConnector.NetworkConnector;
import SocialNetworkConnector.TwitterConnector;

public class TwitterPoster extends NetworkPoster{
    @Override
    public void Comment() {
        System.out.println("Welcome to The Twitter Application");
    }

    @Override
    public NetworkConnector createConnector() {
        return new TwitterConnector();
    }
}
