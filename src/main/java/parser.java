import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parser {


        private String data;

        public parser(){
            this.data = loadFile();
        }

        private String loadFile(){
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("RawData.txt").getFile());
            StringBuilder result = new StringBuilder("");

            try(Scanner scanner = new Scanner(file)){
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    result.append(line).append("\n");
                }

                scanner.close();
            }catch(IOException e){
                e.printStackTrace();
            }

            return result.toString();
        }

        public String getData() {return data;}

        public Integer numberOfErrors() {
            return null;
        }

//        name [nNaAmMeE]
//        milk [mMiIlLkK]  "(?i:.*milk.*)"
//        bread [bBrReEaAdD]  "(?i:.*bread.*)"
//        cookies [cCoOkKiIeEsS]  "(?i:.*cookies.*)"
//        apples [aApPpPlLeEsS]  "(?i:.*apples.*)"
//
        public void milkPatternMatcher() {
            int count = 0;
            Pattern milkPattern = Pattern.compile("milk",Pattern.CASE_INSENSITIVE);
            Matcher milkMatcher = milkPattern.matcher(data);

            while (milkMatcher.find()) {
                count++;
            }
            System.out.println("name:   Milk       seen: " + count + " " + "times\n");
        }
    public void breadPatternMatcher() {
        int count = 0;
        Pattern breadPattern = Pattern.compile("bread",Pattern.CASE_INSENSITIVE);
        Matcher breadMatcher = breadPattern.matcher(data);

        while (breadMatcher.find()) {
            count++;
        }
        System.out.println("name:   Bread      seen: " + count + " " + "times\n");
    }

    public void cookiesPatternMatcher() {
        int count = 0;
        Pattern cookiesPattern = Pattern.compile("cookies",Pattern.CASE_INSENSITIVE);
        Matcher cookiesMatcher = cookiesPattern.matcher(data);

        while (cookiesMatcher.find()) {
            count++;
        }
        System.out.println("name:   Cookies    seen: " + count + " " + "times\n");
    }
    public void applesPatternMatcher() {
        int count = 0;
        Pattern applesPattern = Pattern.compile("apples",Pattern.CASE_INSENSITIVE);
        Matcher applesMatcher = applesPattern.matcher(data);

        while (applesMatcher.find()) {
            count++;
        }
        System.out.println("name:   Apples     seen: " + count + " " + "times\n");
    }



//        public void nameMatcher() {
//            System.out.println(data.matches("(?i:.*name.*)"));
//        }
//        public void milkMatcher() {
//        System.out.println(data.matches("(?i:.*milk.*)"));
//        }
//        public void breadMatcher() {
//        System.out.println(data.matches("(?i:.*bread.*)"));
//        }
//        public void cookiesMatcher() {
//        System.out.println(data.matches("(?i:.*cookies.*)"));
//        }
//        public void applesMatcher() {
//        System.out.println(data.matches("(?i:.*apples.*)"));
//        }
//        public void threeTwentyThreeMilkMatcher() {
//            System.out.println(data.matches("(?i:.*3.23.*)"));
//        }
//        public void oneTwentyThreeMilkMatcher() {
//        System.out.println(data.matches("(?i:.*1.23.*)"));
//        }
//        public void oneTwentyThreeBreadMatcher() {
//        System.out.println(data.matches("(?i:.*1.23.*)"));
//        }
//        public void threeTwentyFiveCookiesMatcher() {
//        System.out.println(data.matches("(?i:.*3.25.*)"));
//        }
//        public void twentyThreeApplesMatcher() {
//        System.out.println(data.matches("(?i:.*0.23.*)"));
//        }
//        public void twentyFiveApplesMatcher() {
//        System.out.println(data.matches("(?i:.*0.25.*)"));
//        }

}
