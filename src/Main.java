import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String arg[]) throws IOException {
        System.out.println("Please, write nums and operation.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        ScanInput.scanInput(input);
    }
}
