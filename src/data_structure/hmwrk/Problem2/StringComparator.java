package data_structure.hmwrk.Problem2;
import java.util.Comparator;


class StringComparator implements Comparator<String> {

    public int compare(String a, String b) {
        char firstCharacter = a.charAt(0);
        char secondCharacter = b.charAt(0);
        if (firstCharacter - secondCharacter == 0) { return 0; }
        else if (firstCharacter - secondCharacter < 0) { return -1; }
        return 1;
    }
}
