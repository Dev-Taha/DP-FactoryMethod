package SocialNetworkConnector;

public class TelegramConnector implements NetworkConnector{
    @Override
    public void Login(String userName, String password) {
        System.out.println("userName = " + userName );
        System.out.println("password = " + password);
        System.out.println("Login to The Application");
    }

    @Override
    public void createPost() {
        System.out.println("Creating a post ....");
    }

    @Override
    public void LogOut() {
        System.out.println("You are logged out .. !");
    }
}
