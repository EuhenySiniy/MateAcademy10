package validation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationUtilTest {
    ValidationUtil validationUtil;

    @Before
    public void setUp() {
        validationUtil = new ValidationUtil();
    }

    @Test
    public void phoneValidation() {
        String correctNumber = "+38(096)007-75-18";
        assertTrue(validationUtil.phoneValidation(correctNumber));
    }

    @Test
    public void emailValidation() {
        String correctEmail = "qwerty@gmail.com";
        assertTrue(validationUtil.emailValidation(correctEmail));
    }

    @Test
    public void dateValidation() {
        String correctDate = "2012-12-12";
        assertTrue(validationUtil.dateValidation(correctDate));
    }

    @Test
    public void ipValidation() {
        String correctIp = "255.255.255.0";
        assertTrue(validationUtil.ipValidation(correctIp));
    }

    @Test
    public void incorrectPhone() {
        String incorrectNumber = "5248544756";
        assertFalse(validationUtil.phoneValidation(incorrectNumber));
    }

    @Test
    public void incorrectEmail() {
        String incorrectEmail = "olololo";
        assertFalse(validationUtil.emailValidation(incorrectEmail));
    }

    @Test
    public void incorrectDate() {
        String incorrectDate = "null-null-null";
        assertFalse(validationUtil.dateValidation(incorrectDate));
    }

    @Test
    public void incorrectIp() {
        String incorrectIp = "1235.14.1883.1";
        assertFalse(validationUtil.ipValidation(incorrectIp));
    }
}