public class UserDetails {

    public static void main(String[] args) {
        UserDetail userDetails = new UserDetail();
        System.out.println(userDetails.checkFName("Mohit"));
        System.out.println(userDetails.checkLName());

    }

    //  This method is used to validate the First Name
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate Last Name
    public boolean checkLName(String lastName) {
        return (lastName.matches("[A-Z][a-z]{3,}"));
    }
}

