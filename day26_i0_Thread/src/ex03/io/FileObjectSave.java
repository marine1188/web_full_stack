package ex03.io;
/*파일 읽고 쓰기 하기*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Reader;

public class FileObjectSave {
	public static void main(String[] args)  throws Exception {
		String name, id, pwd, phone, temp;
		name = id=pwd=phone=temp =null;
		boolean gender = true;
		int age = 0;
		
		/*InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader); */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File("members.txt");
		
		FileOutputStream fos = new FileOutputStream(f, true);   // append mode
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("------------ 회원 정보 입력 하기 ---------------------");
		System.out.print("이름 >> "); 			name = br.readLine();
		System.out.print("ID >> "); 				id = br.readLine();
		System.out.print("Password >> "); 		pwd = br.readLine();
		
		System.out.print("성별(m, f) >> "); 		temp = br.readLine();
		if( temp.toLowerCase().equals("m") ) 		gender = true;
		else gender = false;
		
		System.out.print("나이 >> "); 			age = Integer.parseInt(br.readLine());
		System.out.print("연락처 >> "); 		phone = br.readLine();
		
		oos.writeObject(name);
		oos.writeObject(id);
		oos.writeObject(pwd);
		oos.writeObject(gender);
		oos.writeObject(age);
		oos.writeObject(phone);
		
		System.out.println("members.txt   save!!!");
	}
}









