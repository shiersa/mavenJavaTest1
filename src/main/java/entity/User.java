package entity;

public class User {
    private String userNo;
    private String userName;
    private String userPassword;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public User(String userNo, String userName, String userPassword){
        this.userNo = userNo;
        this.userName = userName;
        this.userPassword = userPassword;
    }
}
