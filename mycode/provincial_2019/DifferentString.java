package provincial_2019;

import java.util.HashSet;
import java.util.Set;

/*
 * 1.Ҫ���Ҹ��� , count����size();
 * 2.Ҫ���ظ���set;
 * 3.��ȡ���ַ�����substring();
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
