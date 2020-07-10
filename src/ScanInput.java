import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScanInput {
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
        for(int i:nums){
            System.out.println(i);
        }
        for(String s:acts){
            System.out.println(s);
        }
    }
}
