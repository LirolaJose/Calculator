import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {
    public static void inputString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        CheckInput.checkInput(input);
    }
}
