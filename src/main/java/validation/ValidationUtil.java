package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {
    private final String PHONE_NUMBER = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    private final String EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    private final String DATE = "[0-9]{4}-(0[1-9]|1[0-12])-(0[1-9]|1[0-9]|2[0-9]|3[01])";
    private final String IP_ADRESS = "((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)";

    public boolean phoneValidation(String phone) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean emailValidation(String email) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean dateValidation(String date) {
        Pattern pattern = Pattern.compile(DATE);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public boolean ipValidation(String ip) {
        Pattern pattern = Pattern.compile(IP_ADRESS);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
