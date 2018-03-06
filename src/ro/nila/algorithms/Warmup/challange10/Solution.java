package ro.nila.algorithms.Warmup.challange10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    static String timeConversion(String s) {
        String result = "";
        Pattern hourMinutesSecondsPattern = Pattern.compile("\\d{1,2}\\W\\d{1,2}\\W\\d{1,2}"); //pattern for 07:05:45
        Pattern postOrAfterPattern = Pattern.compile("\\D{2}"); //pattern for PM or AM
        Pattern hourPattern = Pattern.compile("^\\d{2}"); //pattern for 07
        Pattern minutesSecondsPattern = Pattern.compile("\\D\\d{2}\\D\\d{2}"); //pattern for :05:45

        Matcher matcher = hourMinutesSecondsPattern.matcher(s);
        matcher.find();
        String fullHour = matcher.group(); // string = 07:05:45

        matcher.usePattern(postOrAfterPattern).find();
        String postOrAfter = matcher.group(); // string = AM or PM
        matcher.reset();

        matcher.usePattern(hourPattern).find();
        String hour = matcher.group(); // string = 07
        int nr = Integer.valueOf(hour); // int = 7
        matcher.reset();

        matcher.usePattern(minutesSecondsPattern).find();
        String minutesSeconds = matcher.group(); // String :05:45

        switch (postOrAfter.toUpperCase()) {
            case "AM":
                if (nr >= 0 && nr <= 11) {
                    result = fullHour;
                } else {
                    if (nr == 22 || nr == 23) {
                        result = String.valueOf(23 - 12) + minutesSeconds;
                    } else if (nr == 24) {
                        result = "00" + minutesSeconds;
                    } else {
                        result = "0" + String.valueOf(nr - 12) + minutesSeconds;
                    }
                }
                break;
            case "PM":
                if (nr >= 12 && nr <= 23) {
                    result = fullHour;
                } else {
                    if (nr == 24) {
                        result = "00" + minutesSeconds;
                    } else {
                        result = String.valueOf(nr + 12) + minutesSeconds;
                    }
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
