import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {
    public static void checkInput(String input) throws Exception {
        Pattern pInput = Pattern.compile("^(([1-9]|10)[\\+\\-\\*\\/]([1-9]|10))$");
        Pattern romanInput = Pattern.compile("^(X|IX|IV|V?I{0,3})[\\+\\-\\*\\/](X|IX|IV|V?I{0,3})$");
        Matcher mInput = pInput.matcher(input);
        Matcher romanMatch = romanInput.matcher(input);
        try {
            if (mInput.find()) {
                ScanInput.scanInput(input);
            } else if (romanMatch.find()) {
                RomanScan.romanScan(input);
            } else {
                throw new Exception("Incorrect data entry");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
