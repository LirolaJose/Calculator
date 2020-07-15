import java.util.List;

public class Converter {
    public static int romanToArabic(String input) {
        String inputRome = input.toUpperCase();
        int result = 0;
        List<RomanNumeral> enumRomanNums = RomanNumeral.getReverseSortedValues();
        int i = 0;
        while ((inputRome.length() > 0) && (i < enumRomanNums.size())) {
            RomanNumeral symbol = enumRomanNums.get(i);
            if (inputRome.startsWith(symbol.name())) {
                result += symbol.getValue();
                inputRome = inputRome.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        if (inputRome.length() > 0) {
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }
        return result;
    }

    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range (0,4000]");
        }
        List<RomanNumeral> enumRomanNums = RomanNumeral.getReverseSortedValues();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while ((number > 0) && (i < enumRomanNums.size())) {
            RomanNumeral currentSymbol = enumRomanNums.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
