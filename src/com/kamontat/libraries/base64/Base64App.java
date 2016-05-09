package com.kamontat.libraries.base64;

import java.util.*;

/**
 * @author kamontat
 * @since 10/5/59 - 00:01
 */
public class Base64App {
	public static void main(String[] args) {
		String text = "Base64 finally in Java 8!";
		String url = "www.google.com";

		String encoded = Base64.getEncoder().encodeToString(text.getBytes());
		String encodedUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
		System.out.println("encoded = " + encoded);
		System.out.println("encodedUrl = " + encodedUrl);

		String decoded = new String(Base64.getDecoder().decode(encoded));
		String decodedUrl = new String(Base64.getDecoder().decode(encodedUrl));
		System.out.println("decoded = " + decoded);
		System.out.println("decodedUrl = " + decodedUrl);
	}
}