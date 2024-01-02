package spkio.common.util;

import java.text.Normalizer;
import java.util.Random;

public class StringUtil {

	private static final String DIC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private StringUtil() { }

	public static boolean isEmptyOrNull(String s) {
		return s == null || s.trim().length() == 0;
	}

	public static boolean similar(String s1, String s2) {
		return s1 == null || s2 == null ? false
				: stripAccents(s1.trim()).toUpperCase().equals(stripAccents(s2.trim()).toUpperCase());
	}

	public static String stripAccents(String s) {
		return Normalizer.normalize(s, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	}
	
	public static String toHex(byte[] data) {
		StringBuilder sb = new StringBuilder();
	    for (byte b : data) {
	        sb.append(String.format("%02x", b));
	    }
	    return sb.toString();
	}
	
	public static String toHex(byte[] data, int interval, char symbol) {
		String s = toHex(data);
		int l = s.length();
		int d = l / interval + (l % interval == 0 ? 0 : 1);
		s = String.format("%" + (d * interval) + "s", s).replace(' ', '0');
		StringBuffer sb = new StringBuffer(s.substring(0, interval));
		for (int i = 1; i < d; i++) {
			sb.append(symbol + s.substring(i * interval, (i * interval) + interval));
		}
		return sb.toString();
	}
	
	public static String normalizeAZ(String s) {
		return Normalizer.normalize(s.toUpperCase(), Normalizer.Form.NFD).replaceAll("[^\\x41-\\x5A]", "");
	}
	
	public static boolean normequal(String s1, String s2) {
		return normalizeAZ(s1).equals(s2);
	}
	
	public static boolean normcontain(String s1, String s2) {
		return normalizeAZ(s1).contains(normalizeAZ(s2));
	}

	public static String generateAlphaNumeric(int n) {
		return generateAlphaNumeric(n, 0, DIC.length());
	}

	public static String generateAlpha(int n) {
		return generateAlphaNumeric(n, 10, DIC.length());
	}

	public static String generateNumeric(int n) {
		return generateAlphaNumeric(n, 0, 10);
	}

	private static String generateAlphaNumeric(int n, int min, int max) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < n; i++) {
			b.append(DIC.charAt(new Random().nextInt(max - min) + min));
		}
		return b.toString();
	}

}
