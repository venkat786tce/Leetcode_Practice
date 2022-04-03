

public class LengthOfLongestSubstring {

	public static long findLongestSubstring(String str) {

		if (str == null || str.length() == 0) {
			return 0;
		}
		long len = 0;
		String test = "", ret = "";
		int i = 0, j = 0;
		for (char ch : str.toCharArray()) {
			String s = String.valueOf(ch);
			if (test.contains(s)) {
				test = test.substring(test.indexOf(ch) + 1);
			}
			test = test + s;
			if (Math.max(len, test.length()) != len) {
				ret = test;
			}
			len = Math.max(len, test.length());
		}
		System.out.println("longest substring without repeating char :" + ret);
		return len;
	}

	public static void main(String[] args) {
		String str = "testeeeawsdes";
		System.out.println("longest substring length: " + findLongestSubstring(str));
	}

}
