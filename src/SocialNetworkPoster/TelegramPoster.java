package SocialNetworkPoster;

import SocialNetworkConnector.NetworkConnector;
import SocialNetworkConnector.TwitterConnector;

public class TelegramPoster extends NetworkPoster{
    @Override
    public void Comment() {
        System.out.println("Welcome to The Telegram Application");
    }

    @Override
    public NetworkConnector createConnector() {
        return new TwitterConnector();
    }
}
