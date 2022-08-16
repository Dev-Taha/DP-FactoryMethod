package SocialNetworkPoster;

import SocialNetworkConnector.LinkedInConnector;
import SocialNetworkConnector.NetworkConnector;

public class LinkedInPoster extends NetworkPoster{
    @Override
    public void Comment() {
        System.out.println("Welcome to The LinkedIn Application");
    }

    @Override
    public NetworkConnector createConnector() {
        return new LinkedInConnector();
    }
}
