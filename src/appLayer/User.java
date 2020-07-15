package appLayer;

public class User {
    public boolean isValidUserCredentials(String userName, String password){
        if(userName.equals("wangari") && password.equals("kinuthia")){
            return true;
        }
            return false;
    }
}
