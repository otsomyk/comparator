package comparator;

public class Comparator implements java.util.Comparator <String> {

	@Override
    public int compare(String o1, String o2) {
        int result = o1.compareTo(o2);
        if ( result == 0){
            return 0;
        } else if ( result > 0){
            return 1;
        } else{
            return -1;
        }
    }
}
