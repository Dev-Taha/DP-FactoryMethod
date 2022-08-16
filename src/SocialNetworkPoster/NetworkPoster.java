package SocialNetworkPoster;

import SocialNetworkConnector.NetworkConnector;

public abstract class NetworkPoster {

    public void Post(){
        NetworkConnector networkConnector = createConnector();
        networkConnector.Login("taha","12345");
        networkConnector.createPost();
        networkConnector.LogOut();
    }

    public abstract void Comment();

    public abstract NetworkConnector createConnector();
}
