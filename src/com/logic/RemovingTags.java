package com.logic;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class RemovingTags {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = Integer.parseInt(sc.nextLine());
		while (i-- > 0) {
			String sub = sc.nextLine();
			boolean matchfound = false;

			Pattern remove = Pattern.compile("<(.+)>([^<]+)</\\1>");

			Matcher m = remove.matcher(sub);
			while (m.find()) {

				System.out.println(m.group(2));
				matchfound = true;
			}
			if (!matchfound) {
				System.out.println("none");
			}
		}
		sc.close();
	}
}
