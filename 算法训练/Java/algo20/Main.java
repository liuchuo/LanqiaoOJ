package algo20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		in = reader.readLine().toCharArray();
		post = reader.readLine().toCharArray();
		reader.close();
		pre = new char[in.length];
		findPre(0, in.length - 1, post.length - 1, 0);
		for (char c : pre) {
			System.out.print(c);
		}
	}
	
	private static char[] in, post, pre;
	
	private static void findPre(int inStart, int inEnd, int postIndex, int preIndex) {
		if (inStart > inEnd) return;
		for (int i = inStart; i <= inEnd; i++) {
			if (in[i] == post[postIndex]) {
				pre[preIndex] = in[i];
				findPre(inStart, i - 1, postIndex - (inEnd - i) - 1, preIndex + 1);
				findPre(i + 1, inEnd, postIndex - 1, preIndex + i - inStart + 1);
				return;
			}
		}
	}
	
}
