package com.aurionpro.model;

public class StringUtil {

	public String truncateAInFirst2Place(String string) {
		int a = string.length();
		String str1 = string.substring(0, 2);
		String str2 = string.substring(2, a);

		if (str1 == "aa") {
			System.out.println(str2);
			return str2;
		}
		if ((str1.charAt(0) == 'a' && str1.charAt(1) != 'a')) {
			System.out.println(Character.toString(str1.charAt(1)) + str2);
			return Character.toString(str1.charAt(1)) + str2;

		} else if ((str1.charAt(0) != a && str1.charAt(1) == a)) {
			System.out.println(Character.toString(str1.charAt(0)) + str2);

			return Character.toString(str1.charAt(0)) + str2;
		}
		return string;

	}

	public boolean firstAndLast2CharAreEqual(String string) {
		int a = string.length();
		String str1 = string.substring(0, 2);
		String str2 = string.substring(a - 2, a);
		System.out.println(str1);
		System.out.println(str2);
		if (str1.equalsIgnoreCase(str2)) {
			return true;
		} else
			return false;

	}
}
