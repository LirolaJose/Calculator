import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String arg[]) throws Exception {
        System.out.println("Please, enter 2 numbers from 1 to 10 in Arabic or Roman numerals and enter the desired action.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        CheckInput.checkInput(input);
    }
}
