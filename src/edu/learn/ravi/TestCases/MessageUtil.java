package edu.learn.ravi.TestCases;

public class MessageUtil {
	private static String message;
	public MessageUtil(String message) {
		System.out.println("MessageUtility Running..");
	}
	public static String printMessage()
	{
		System.out.println(message);
		return message;
	}
}