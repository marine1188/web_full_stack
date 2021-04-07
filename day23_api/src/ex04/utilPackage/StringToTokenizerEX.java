package ex04.utilPackage;

import java.util.StringTokenizer;

public class StringToTokenizerEX {
// 토근 설정
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer token = new StringTokenizer("박정희/노태우/전두환/김영삼","/");
		//복합 토근
		//StringTokenizer token = new StringTokenizer("사과=10|초코렛=3|삼페인=1","=|",true);
		// 기본은 띄어 쓰기 / ~~~~,토근 설정
	
		while(token.hasMoreElements()) {// 다음 도큰이 있다면...
			System.out.println(token.nextToken());
		}
	}

}
