package SocialNetworkConnector;

public interface NetworkConnector {
    public void Login(String userName,String password);
    public void createPost();
    public void LogOut();
}
