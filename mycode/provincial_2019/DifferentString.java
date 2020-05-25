package provincial_2019;

import java.util.HashSet;
import java.util.Set;

/*
 * 1.要求找个数 , count或者size();
 * 2.要求不重复，set;
 * 3.提取子字符串，substring();
 * */
public class DifferentString {
    public static void main(String[] args) {
        String str = "0100110001010001";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
