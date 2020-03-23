import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parser {


    private String data;

    public parser() {
        this.data = loadFile();
    }

    private String loadFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("RawData.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getData() {
        return data;
    }

    public Integer numberOfErrors() {
        int count = 0;
        Pattern errorPattern = Pattern.compile(":;", Pattern.CASE_INSENSITIVE);
        Matcher errorMatcher = errorPattern.matcher(data);

        while (errorMatcher.find()) {
            count++;
        }
        System.out.println("Errors              seen: " + count + " " + "times");
        return null;
    }

    public void showGroceryList() {
        milkPatternMatcher();
        printDoubleDash();
        threeTwentyThreeMilkMatcher();
        printSingleDash();
        oneTwentyThreeMilkMatcher();
        printEmptyLine();
        breadPatternMatcher();
        printDoubleDash();
        oneTwentyThreeBreadMatcher();
        printSingleDash();
        printEmptyLine();
        cookiesPatternMatcher();
        printDoubleDash();
        twoTwentyFiveCookiesMatcher();
        printSingleDash();
        printEmptyLine();
        applesPatternMatcher();
        printDoubleDash();
        twentyFiveApplesMatcher();
        printSingleDash();
        twentyThreeApplesMatcher();
        printEmptyLine();
        numberOfErrors();
    }

    //milk
    public void milkPatternMatcher() {
        int count = 0;
        Pattern milkPattern = Pattern.compile("milk", Pattern.CASE_INSENSITIVE);
        Matcher milkMatcher = milkPattern.matcher(data);

        while (milkMatcher.find()) {
            count++;
        }
        System.out.println("name:    Milk       seen: " + count + " " + "times");
    }

    public void threeTwentyThreeMilkMatcher() {
        int count = 0;
        Pattern milk325Pattern = Pattern.compile("3.23", Pattern.CASE_INSENSITIVE);
        Matcher milk325Matcher = milk325Pattern.matcher(data);

        while (milk325Matcher.find()) {
            count++;
        }
        System.out.println("Price:   3.23       seen: " + count + " " + "times");
    }

    public void oneTwentyThreeMilkMatcher() {
        int count = 0;
        Pattern milk123Pattern = Pattern.compile("1.23", Pattern.CASE_INSENSITIVE);
        Matcher milk123Matcher = milk123Pattern.matcher(data);

        while (milk123Matcher.find()) {
            count++;
        }
        System.out.println("Price:   1.23       seen: " + count + " " + "times");
    }


    //bread
    public void breadPatternMatcher() {
        int count = 0;
        Pattern breadPattern = Pattern.compile("bread", Pattern.CASE_INSENSITIVE);
        Matcher breadMatcher = breadPattern.matcher(data);

        while (breadMatcher.find()) {
            count++;
        }
        System.out.println("name:   Bread       seen: " + count + " " + "times");
    }

    public void oneTwentyThreeBreadMatcher() {
        int count = 0;
        Pattern bread123Pattern = Pattern.compile("1.23", Pattern.CASE_INSENSITIVE);
        Matcher bread123Matcher = bread123Pattern.matcher(data);

        while (bread123Matcher.find()) {
            count++;
        }
        System.out.println("Price:   1.23       seen: " + count + " " + "times");
    }


    //cookies
    public void cookiesPatternMatcher() {
        int count = 0;
        Pattern cookiesPattern = Pattern.compile("cookies", Pattern.CASE_INSENSITIVE);
        Matcher cookiesMatcher = cookiesPattern.matcher(data);

        while (cookiesMatcher.find()) {
            count++;
        }
        System.out.println("name: Cookies       seen: " + count + " " + "times");
    }

    public void twoTwentyFiveCookiesMatcher() {
        int count = 0;
        Pattern cookies225Pattern = Pattern.compile("2.25", Pattern.CASE_INSENSITIVE);
        Matcher cookies225Matcher = cookies225Pattern.matcher(data);

        while (cookies225Matcher.find()) {
            count++;
        }
        System.out.println("Price:   2.25       seen: " + count + " " + "times");
    }


    //apples
    public void applesPatternMatcher() {
        int count = 0;
        Pattern applesPattern = Pattern.compile("apples", Pattern.CASE_INSENSITIVE);
        Matcher applesMatcher = applesPattern.matcher(data);

        while (applesMatcher.find()) {
            count++;
        }
        System.out.println("name:  Apples       seen: " + count + " " + "times");
    }

    public void twentyThreeApplesMatcher() {
        int count = 0;
        Pattern apples23Pattern = Pattern.compile("0.23", Pattern.CASE_INSENSITIVE);
        Matcher apples23Matcher = apples23Pattern.matcher(data);

        while (apples23Matcher.find()) {
            count++;
        }
        System.out.println("Price:   0.23       seen: " + count + " " + "times");
    }

    public void twentyFiveApplesMatcher() {
        int count = 0;
        Pattern apples25Pattern = Pattern.compile("0.23", Pattern.CASE_INSENSITIVE);
        Matcher apples25Matcher = apples25Pattern.matcher(data);

        while (apples25Matcher.find()) {
            count++;
        }
        System.out.println("Price:   0.25       seen: " + count + " " + "times");
    }

    public void printDoubleDash() {
        System.out.println("=============       =============");
    }

    public void printSingleDash() {
        System.out.println("-------------       -------------");
    }

    public void printEmptyLine() {
        System.out.println("");
    }
}
