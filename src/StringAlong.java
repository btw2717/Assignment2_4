/**
 * The StringAlong class creates String objects, StringBuffer objects, and StringBuilder objects to use
 * methods inherent in each class upon said objects and output the results to the screen.
 * @author Sapper
 * email: email@yoohoo.com
 * Created: 24SEP2017
 * @version 1.0
 */
public class StringAlong {
    /**
     * The main() method is the entry point of the application. main() uses a number of methods upon
     * the appropriate objects and prints the results.
     * @param args command line arguments passed to the application
     */
    public static void main(String[] args) {

        String chatty = "Learning to use String class methods with a knife.";
        System.out.println("Original phrase: \"" + chatty + "\"");
        System.out.println();

        char carat = chatty.charAt(18);
        System.out.println("Character at index of 18 is: " + carat);
        System.out.println();

        String add = chatty.concat(" Which is pretty confusing so far.");
        System.out.println("Original phrase with additional concatenation:\n" + add);
        System.out.println();

        boolean equals1 = chatty.equals("not even close");
        System.out.println("Original phrase is equal to \"not even close\": " + equals1);
        boolean equals2 = chatty.equals("learning to use string class methods with a knife.");
        System.out.println("Original phrase is equal to" +
                " \"learning to use string class methods with a knife\": " + equals2);
        boolean equals3 = chatty.equals("Learning to use String class methods with a knife.");
        System.out.println("Original phrase is equal to original phrase: " + equals3);
        System.out.println();

        boolean equalsCase1 = chatty.equalsIgnoreCase("learning to use string class methods with a knife.");
        System.out.println("Original phrase is equal ignoring case to original phrase in all lower case: " + equalsCase1);
        boolean equalsCase2 = chatty.equalsIgnoreCase("wrong again.");
        System.out.println("Original phrase is equal ignoring case to \"wrong again.\": " + equalsCase2);
        System.out.println();

        int index1 = chatty.indexOf("kn");
        System.out.println("Index of \'kn\' in original phrase: " + index1);
        int index2 = chatty.indexOf("class");
        System.out.println("Index of \'class\' in original phrase: " + index2);
        int index3 = chatty.indexOf("with");
        System.out.println("Index of \'with\' in original phrase: " + index3);
        System.out.println();

        int last1 = chatty.lastIndexOf("e");
        System.out.println("Last index of \'e\' in original phrase: " + last1);
        int last2 = chatty.lastIndexOf("z");
        System.out.println("Last index of \'z\' in original phrase: " + last2);
        System.out.println();

        String letterCase1 = chatty.toLowerCase();
        System.out.println("Original phrase in lower case: " + letterCase1);
        String letterCase2 = chatty.toUpperCase();
        System.out.println("Original phrase in upper case: " + letterCase2);
        System.out.println();

        String letterReplace = chatty.replace('l','w');
        System.out.println("All \'l\' characters replaced by \'w\' characters: " + letterReplace);
        System.out.println();

        String sub1 = chatty.substring(37);
        System.out.println("Substring of original phrase beginning at index 37: " + sub1);
        String sub2 = chatty.substring(12,26);
        System.out.println("Substring of original phrase beginning at index 12 and ending at index 26: " + sub2);
        System.out.println();

        String value1 = chatty.valueOf('i');
        System.out.println("Value of character \'i\': " + value1);
        System.out.println();

        String space = "         So much whitespace!          ";
        String spaceTrim = space.trim();
        System.out.println("Untrimmed: " + space);
        System.out.println("Now trimmed: " + spaceTrim);
        System.out.println();

        StringBuffer buff = new StringBuffer("Messing with the StringBuffer class.");
        System.out.println("StringBuffer object \'buff\' = " + buff);
        System.out.println();

        int cap = buff.capacity();
        System.out.println("Capacity of \'buff\': " + cap);
        System.out.println();

        int length = buff.length();
        System.out.println("Length of \'buff\': " + length);
        System.out.println();

        StringBuilder build = new StringBuilder("Messing with the StringBuilder class.");
        System.out.println("StringBuilder object = " + build);
        System.out.println();

        StringBuilder app = build.append(buff);
        System.out.println("\'build\' appended by \'buff\': " + app);
        System.out.println();

        StringBuilder rep = build.replace(0,7,"Playing");
        System.out.println("Replacing \"Messing\" with \"Playing\": " + rep);

    }
}
