import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegValidation {

    @Test
    public void testUserFirstName_whenValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            isFNameValid = userRegistration.checkFName("Mohit");
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals("Success", isFNameValid);
        }

    }

    @Test
    public void testFirstName_WhenValueIsInvalid_shouldReturnException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.checkFName("Mohit");
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testFirstName_WhenPassNullValue_shouldNullValueException() {
        UserRegistration userRegistration = new UserRegistration();
        String isFNameValid = null;
        try {
            userRegistration.checkFName(null);
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testLastName_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String islNameValid = null;
        try {
            islNameValid = userRegistration.checkLName("Kumar");
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals("Success" , islNameValid);
        }
    }

    @Test
    public void testLastName_WhenValueIsInvalid_ShouldThrowInvalidException(){
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkLName("Raj");
        }
        catch (invalidDetailExceptions e){
            Object InvalidDetailExceptions;
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testLastName_WhenValueIsNull_ShouldThrowNullPointerException(){
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkLName(null);
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testEmailId_WhenValueIsValid_ShouldReturnSuccess(){
        UserRegistration userRegistration = new UserRegistration();
        String isEmailValid = null;
        try {
            isEmailValid = userRegistration.checkEmail("rajmohit.129@gmail.com");
        }
        catch (invalidDetailExceptions e)
        {
            Assert.assertEquals("Success", isEmailValid);
        }
    }

    @Test
    public void testEmailId_WhenValueIsInvalid_ShouldThrowInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkEmail("Mr.@.com");
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testEmailId_WhenValueIsNull_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkEmail(null);
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testMobileNum_WhenValueIsValid_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isPhoneValid = null;
        try {
            isPhoneValid = userRegistration.checkPhoneNumber("91 6202968551");
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals("Success", isPhoneValid);
        }
    }

    @Test
    public void testMobileNum_WhenValueIsInvalid_ShouldInvalidDetailException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPhoneNumber("77777");
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }

    @Test
    public void testMobileNum_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPhoneNumber(null);
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void testPassword_WhenSatisfyRule2_ShouldReturnSuccess() {
        UserRegistration userRegistration = new UserRegistration();
        String isValidPassword = null;
        try {
            isValidPassword = userRegistration.checkPassword("MR@111");
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals("Success", isValidPassword);
        }
    }

    @Test
    public void testPassword_WhenNotSatisfyRule2_ShouldThrowInvalidPassException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPassword("abc");
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_INVALID, e.type);
        }
    }


    @Test
    public void testPassword_WhenPassedNullValue_ShouldThrowNullPointerException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.checkPassword(null);
        }
        catch (invalidDetailExceptions e){
            Assert.assertEquals(invalidDetailExceptions.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void mood_Analyser_Test_Happy() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodHappy = null;
        try {
            isMoodHappy = userRegistration.moodAnalyse("Mohit", "raj", "91 6202968551", "rajmohit.129@gmail.com", "9999@Mohit");
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals("HAPPY", isMoodHappy);
        }
    }

    @Test
    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = null;
        try {
            isMoodSad = userRegistration.moodAnalyse("Mohit", "Raj", "6202968551", "Rajmohit.129@gmail.com", "Sanidev888@");
        }
        catch (invalidDetailExceptions e) {
            Assert.assertEquals("SAD", isMoodSad);
        }
    }
}