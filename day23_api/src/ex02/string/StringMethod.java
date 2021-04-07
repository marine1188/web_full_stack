package ex02.string;

public class StringMethod {
	public static void main(String[] args) {
		//객체 생성
		String s1 = "happy seongkyu";
		String s2 = "BUSAN";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2.hashCode());
		System.out.println(s2);
		
		System.out.println("-------------------------------");
		s2 = s2.replace("EO", "Korea");
		System.out.println(s2.hashCode()); // -1910762226
		System.out.println(s2);
		
		//s1 = s1.concat(s2); //문자열 결합
		s1 = s1 + s2;
		System.out.println(s1);
		System.out.println("================");
		String s3 = new String("     ab   cd       ");
		System.out.println(s3);
		System.out.println(s3.length());//문자열 길이
		s3 = s3.trim(); // 공백 제거
		System.out.println(s3.length());
		System.out.println(s3);
		System.out.println("=======================");
		
		String s4 = new String("ab/defghi/34566/kerigid/93742");
		String[] s5 = s4.split("/"
				+ "");
		
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된" + i + "번 문자열:" + s5[i]);
		}
		System.out.println("================");
		String s6 = "010-2733-0000";
		String[]s7 = s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		
		System.out.println("====================");
		String s8 = "1234566abcdef 9893534 94589345 string";
		char ch = s8.charAt(10);
		System.out.println(ch);
		
		s8 = s8.substring(3);
		System.out.println(s8); // 3번 인텍스 부터 끝까지 출력
		
		s8 = s8.substring(5,7);// 시작위치 값 포함 , 끝값 미포함
		System.out.println(s8);
		
		System.out.println("+++++++++소문자 대문자 변환++++++++");
		System.out.println("소문자 출력 toLowerCase():"+ s2.toLowerCase());
		System.out.println("대문자 출력 toUpperCase():"+ s1.toUpperCase());
		
		System.out.println(s1.length()); // 문자열 길이
		char[] ch2 = s1.toCharArray();
		
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]+"\n");
		}
		
	
	}
}
