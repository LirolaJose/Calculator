import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScanInput {
    static int num1;
    static int num2;
    static String act;
    public static void scanInput(String input){
        List<Integer> nums = new ArrayList<>();
        List<String> acts = new ArrayList<>();
        Pattern pNum = Pattern.compile(("\\b[\\d]+\\b"));
        Pattern pAct = Pattern.compile("[+\\-*/]");
        Matcher mNum = pNum.matcher(input);
        Matcher mAct = pAct.matcher(input);

        while(mNum.find()){
            nums.add(Integer.parseInt(mNum.group()));
        }
        while(mAct.find()){
            acts.add(mAct.group());
        }
        num1 = nums.get(0);
        num2 = nums.get(1);
        act = acts.get(0);
        switch (act){
            case "+":
                System.out.println(Addition.addition(num1, num2));
            break;
            case "-":
                System.out.println(Subtraction.subtraction(num1, num2));
            break;
            case "*":
                System.out.println(Multiplication.multiplication(num1, num2));
            break;
            case "/":
                System.out.println(Division.division(num1, num2));
            break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
