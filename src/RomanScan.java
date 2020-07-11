import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanScan {
    static int num1;
    static int num2;
    static String act;
    static int result;
    public static void romanScan(String input){
        List<String> nums = new ArrayList<>();
        List<String> acts = new ArrayList<>();
        Pattern pNums = Pattern.compile("[X{0,1}IX|IV|V?I{0,3}]{1,3}");
        Pattern pActs = Pattern.compile("[+\\-*/]");
        Matcher numsMatch = pNums.matcher(input);
        Matcher actsMatch = pActs.matcher(input);

        while (numsMatch.find()){
            nums.add(numsMatch.group());
        }
        while (actsMatch.find()){
            acts.add(actsMatch.group());
        }
        num1 = Converter.romanToArabic(nums.get(0));
        num2 = Converter.romanToArabic(nums.get(1));
        act = acts.get(0);
        switch (act){
            case "+": result = Addition.addition(num1, num2);
                System.out.println(Converter.arabicToRoman(result));
                break;
            case "-": result = Subtraction.subtraction(num1, num2);
                System.out.println(Converter.arabicToRoman(result));
                break;
            case "*": result = Multiplication.multiplication(num1, num2);
                System.out.println(Converter.arabicToRoman(result));
                break;
            case "/": result = Division.division(num1, num2);
                System.out.println(Converter.arabicToRoman(result));
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
