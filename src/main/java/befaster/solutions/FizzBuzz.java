package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        List<String> results = new ArrayList<>();
        
        if (number % 3 == 0) {
            results.add("fizz");
        }
        
        if (number % 5 == 0) {
            results.add("buzz");
        }
        
        StringBuilder resultBuilder = new StringBuilder();
        results.stream().forEach((partOfResult) -> {
            resultBuilder.append(partOfResult).append(" ");
        });
        
        if (resultBuilder.toString().isEmpty()) {
            return String.valueOf(number);
        }
        
        return resultBuilder.substring(resultBuilder.length() - 1);
    }

}
