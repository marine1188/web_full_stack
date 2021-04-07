package ex02.string;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 999;
		String str = "abc";
		System.out.println("str:" + str);
		
		char data [] = {'a','b','d'};
		str = new String(data);
		System.out.println("str :" + str);
		System.out.println("kbs");
		
		String msg = "defghij 12345";
		System.out.println("korea" + msg);// korea defghij 12345
		System.out.println(msg);
		
		msg = msg.concat("Seoul");//문자열 결합
		System.out.println(msg);
		
		String str2 = "abcdf".substring(2);// 중간 문자열 추출
		System.out.println(str2); // cdef
		
		str2 = "mu Seon lie li go".substring(2,5);//시작값 포함 끝값 미포함
		System.out.println(str2);
		
		System.out.println(msg+":"+str2);
		
		
	}

}
