import java.util.Arrays;

/**
 *
 */
public class StringsArray {

    public static void main(String[] args) {

        String[] test = {"Two", "evicted", "Abracadabra", "Tree", "Evolution", "Fiver", "8-Ball", "Four", "eleven"};

        System.out.println(Arrays.asList(test));

        System.out.println("//length (shorter to longest)");
        Arrays.sort(test, (s1, s2) -> (s1.length() - s2.length()));   // length (shorter to longest)
        System.out.println(Arrays.asList(test));

        System.out.println("//reverse length");
        Arrays.sort(test, (s1, s2) -> s2.length() - s1.length()); // reverse length
        System.out.println(Arrays.asList(test));

        System.out.println("//first char");
        Arrays.sort(test, (s1, s2) -> s1.charAt(0) - s2.charAt(0));   // first character
        System.out.println(Arrays.asList(test));

        System.out.println("//strings that contain 'e' first");
        Arrays.sort(test, (s1, s2) -> {     // strings that contain 'e' first
            if (s1.charAt(0) == 'e') return -1;
            else return 0;
        });
        System.out.println(Arrays.asList(test));

        System.out.println("//strings that contain 'e' first (method reference)");
        Arrays.sort(test, StringUtils::eChecker);
        System.out.println(Arrays.asList(test));

        System.out.println("//last char");
        Arrays.sort(test, (s1, s2) -> (s1.charAt(s1.length()-1))-s2.charAt(s2.length()-1)); // last character
        System.out.println(Arrays.asList(test));

    }

}
