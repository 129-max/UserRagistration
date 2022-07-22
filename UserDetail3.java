public class UserDetail3 {

    public static void main(String[] args) {
        UserDetail3 userDetail = new UserDetail3();
        System.out.println(userDetail.checkFName("Mohit"));
        System.out.println(userDetail.checkLName("Raj"));
        System.out.println(userDetail.checkEmail("Rajmohit.129@gmail.com"));

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
    public boolean checkEmail(String email){
        return (email.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }
}

