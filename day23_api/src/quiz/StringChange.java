package quiz;

public class StringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 대문자는 대문자로 소문자는 소문자로 변환하기
		String str ="abcDEFGHei jwEMPYmnpw";
		String result ="";
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				result += Character.toLowerCase(str.charAt(i));
			}
			else
				result += Character.toUpperCase(str.charAt(i));
		}
		
		System.out.println(result);
	}

}
