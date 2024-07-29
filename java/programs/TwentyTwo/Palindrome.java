package programs.TwentyTwo;

public class Palindrome{


	public static void main(String[] args) {
		String st="A man, a plan, a canal, Panama!";
		Boolean palindrome = isPalindrome(st);
		System.out.println();
		System.out.println(palindrome);

	}
	public static Boolean isPalindrome(String st){

		int start=0;
		int[] count =new int[26];
		while(start<st.length()){
				if(st.charAt(start)>='a'&&st.charAt(start)<='z') {
					count[st.charAt(start)-97]++;
					System.out.print(st.charAt(start));
				}
				else if(st.charAt(start)>='A'&&st.charAt(start)<='Z') {
					count[st.charAt(start)-65]++;
					System.out.print(st.charAt(start));
				}
			start++;
		}

		int c=0;
		for(int i=0;i<count.length;i++){
			if(count[i]==1) {
				c++;
				if(c==2) {
					return false;
				}
			}
			if(count[i]!=2&&c==2){
				return false;
			}
		}
		return true;
	}
}
