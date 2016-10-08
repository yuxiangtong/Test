import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestListFor {

    @SuppressWarnings("serial")
    public static void main(String[] args) {
        List<String> listA = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
            }
        };

        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listA.size(); j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(listA.get(i) + "-" + listA.get(j));
            }
        }

        System.out.println("==================");
        for (int i = 0; i < listA.size(); i++) {
            for (int j = i + 1; j < listA.size(); j++) {
                System.out.println(listA.get(i) + "-" + listA.get(j));
            }
        }

        System.out.println("====================");
        System.out.println("1".compareTo("1"));
        System.out.println("1".compareTo("2"));
        System.out.println(getSortKey("a","4","0","1"));
    }


    public static String getSortKey(String... args) {
        StringBuffer stringBuffer = new StringBuffer();
        Arrays.sort(args);
        for (int i = 0; i < args.length; i++) {
            stringBuffer.append("_").append(args[i]);
        }
        return stringBuffer.toString().replaceFirst("_", "");
    }

}
