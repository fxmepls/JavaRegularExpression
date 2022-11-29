package task;

import java.util.regex.Pattern;

public class RegularRegex {

    static public  boolean IPv4 (String str) {
        String pattern = "(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        return Pattern.matches(pattern, str);
    }

    static public  boolean GUID (String str) {
        String pattern =  "(^\\{[A-Fa-f0-9]{8}-([A-Fa-f0-9]{4}-){3}[A-Fa-f0-9]{12}\\}$)|(^[A-Fa-f0-9]{8}-([A-Fa-f0-9]{4}-){3}[A-Fa-f0-9]{12}$)";
        return Pattern.matches(pattern, str);
    }

    static public  boolean URL (String str) {
        String pattern =  "^(https?://)?(www\\.)?([a-zA-Z][-a-zA-Z0-9]*[a-zA-Z]\\.)+[a-zA-Z]{2,}(/[\\w-.~:?#\\[\\]@!$&'()*+,;%=]+)*/?$";
        return Pattern.matches(pattern, str);
    }

    static public  boolean Password (String str) {
        String pattern =  "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*!()?.-]).{8,}";
        return Pattern.matches(pattern, str);
    }
}
