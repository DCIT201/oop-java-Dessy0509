public class User {
    private String userId;
    private String loginName;
    private String secretKey;
    private String role;

    public User(){

    }
    public User(String userId, String loginName, String secretKey, String role) {
        this.userId = userId;
        this.loginName = loginName;
        this.secretKey = secretKey;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserID(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
//

//public void checkUserType(String userType){
//
//    if( userType.equalsIgnoreCase("Customer")){
//        userHistory();
//    }


