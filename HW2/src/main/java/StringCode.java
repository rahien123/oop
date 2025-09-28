// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		 // YOUR CODE HERE
		int max=1;
		int size=1;
		if(str.isEmpty()) return 0;
		char current=str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=current) {
				if(size>max){
					max=size;
				}
				size=1;
				current=str.charAt(i);
			}else size++;
		}
		return Math.max(max,size);
	}


	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		StringBuilder sb=new StringBuilder(str);
		int tmp;
		for(int i=0;i<sb.length();i++){
			if(i==sb.length()-1 && Character.isDigit(sb.charAt(i))){
				sb.deleteCharAt(i);
				return sb.toString();
			}
			if(Character.isDigit(sb.charAt(i))){
				tmp=sb.charAt(i)-'0';
				sb.replace(i,i+1,String.valueOf(sb.charAt(i+1)).repeat((int)(sb.charAt(i)-'0')));
				i+=tmp-1;
			}
		}
		return sb.toString(); // YOUR CODE HERE
	}

	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if(len>a.length() || len>b.length())  return false;
		for(int i=0;i<=Math.min(a.length(),b.length())-len;i++){
			if(b.contains(a.substring(i,i+len))){
				return true;
			}
		}
		return false;
	}
}
