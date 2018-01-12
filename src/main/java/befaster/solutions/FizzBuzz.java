package befaster.solutions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        List<String> results = new ArrayList<>();
        
        if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            results.add("fizz");
        }
        
        if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            results.add("buzz");
        }
        
        if (isDeluxe(number)) {
            results.add("deluxe");
        }
        
        if (results.isEmpty()) {
            return String.valueOf(number);
        }
        
        return concatenate(results, " ");
    }
    
    public static String getDeluxeString(int number) {
        List<String> results = new ArrayList<>();
        
        if (number % 2 != 0) {
            results.add("fake");
        }
        
        results.add("deluxe");
        
        return concatenate(results, " ");
    }
    
    private static String concatenate(List<String> strings, String separator) {
        StringBuilder resultBuilder = new StringBuilder();
        strings.stream().forEach((currentString) -> {
           resultBuilder.append(currentString).append(separator);
        });
        
        return resultBuilder.delete(resultBuilder.length() - separator.length(),
                resultBuilder.length()).toString();
    }
    
    static boolean isDeluxe(Integer number) {
        if (number < 10) {
            return false;
        }
        
        int currentDigit, prevDigit = -1;
        
        while (number > 0) {
            currentDigit = number % 10;
            
            if (prevDigit != -1 && currentDigit != prevDigit) {
                return false;
            }
            
            number = number/10;
            prevDigit = currentDigit;
        }
        
        return true;
    }

}
