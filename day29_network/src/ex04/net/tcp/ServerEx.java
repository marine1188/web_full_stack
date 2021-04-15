package ex04.net.tcp;
import java.io.*;
import java.net.*;
public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		//소켓
		ServerSocket server = null;
		Socket client = null;
		
		System.out.println("연결됨 ... 나는 서버야!!");
		try {
			server = new ServerSocket(9999);
			client = server.accept();
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//키보드로 부터 입력스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			//클러이언트의 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();//클라이언트에서 한행으 문자열 읽음
				///클라이어트가 "exit"를 보내면 연결 종료
				if(inputMessage.equalsIgnoreCase("exit"))break;
				//클라이언트가 보낸메세지 화면 출력
				System.out.println(inputMessage);
				//키보드에서 한 행의 문자열 읽음
				String outputMessage = stin.readLine();
				//키보드에서 읽은 문자열 전송
				bw.write("marine 서버"+" "+ outputMessage+"\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {	client.close();  server.close();	 } 
			catch (IOException e) {	System.out.println("클라이언트와 채팅 중 오류 발생.....");	}
		}
	}
}
