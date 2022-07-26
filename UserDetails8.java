public class UserDetails8 {


    //Main method
    public static void main(String[] args) {
        UserDetails8 userDetail = new UserDetails8();
        System.out.println(userDetail.checkFName("Mohit"));
        System.out.println(userDetail.checkLName("Raj"));
        System.out.println(userDetail.checkEmail("Rajmohit.129@gmail.com"));
        System.out.println(userDetail.checkMobileNumber("91 6202968551"));
        System.out.println(userDetail.checkPassword("Sanidev888@"));

    }

    //  This method is used to validate the First Name
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate Last Name
    public boolean checkLName(String lastName) {
        return (lastName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate email Id
    public boolean checkEmail(String email) {
        return (email.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    //This method is used to validate Mobile Number
    public boolean checkMobileNumber(String mobileNumber){
        return (mobileNumber.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }

    //this method is used to validate password
    public boolean checkPassword(String password) {
        return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
    }
}
