package transliterate;

/**
 *
 */
public class TrLaunch {
    
    public static void main(String[] args) {
        if(args.length!=3) {
            System.out.println("USAGE: It is necessary to enter three Strings: the first for the file to read,");
            System.out.println("the second for a word to replace, the third for the word which replaces the former.");
        } else {
            Tr trans = new Tr();
            trans.tr(args[0], args[1], args[2]);
        }
    }
    
}
