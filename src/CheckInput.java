import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {
    public static void checkInput(String input) throws IOException {
        Pattern pInput = Pattern.compile("^(([1-9]|10)[\\+\\-\\*\\/]([1-9]|10))$");
        Pattern romanInput = Pattern.compile("^((X{0,1})(IX|IV|V?I{0,3}))[\\+\\-\\*\\/](X{0,1})(IX|IV|V?I{0,3})$");
        Matcher mInput = pInput.matcher(input);
        Matcher romanMatch = romanInput.matcher(input);
        if(mInput.find()){
            ScanInput.scanInput(mInput.group());
        }/*else{
            System.out.println("Wrong input, please, write again");
            InputString.inputString();
        }*/
        if(romanMatch.find()){
            RomanScan.romanScan(input);
        }
    }
}
