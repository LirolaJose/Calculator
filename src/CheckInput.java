import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {
    public static void checkInput(String input) throws IOException {
        Pattern pInput = Pattern.compile("^(([1-9]|10)[\\+\\-\\*\\/]([1-9]|10))$");
        Matcher mInput = pInput.matcher(input);
        if(mInput.find()){
            ScanInput.scanInput(mInput.group());
        }else{
            System.out.println("Wrong input, please, write again");
            InputString.inputString();
        }
    }
}
