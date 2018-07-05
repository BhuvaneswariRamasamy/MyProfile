package com.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class RepeatedCharacter {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the File Name :");
			String fileName = sc.nextLine();
			System.out.println("Enter Character to be counted ");
			char countChar = sc.next().charAt(0);
			int b = 0;
			BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
			int count = 0;
			while ((b = bufferReader.read()) != -1) {
				char t = (char) b;
				if (t == countChar) {
					count++;
				}
			}
			bufferReader.close();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
