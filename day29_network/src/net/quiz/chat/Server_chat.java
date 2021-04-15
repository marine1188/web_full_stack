package net.quiz.chat;

import java.io.*;
import java.util.*;

import java.net.*;
import java.awt.*;

public class Server_chat {
	private ServerSocket serverSocket;
	private ServerGui gui;
	private Socket socket;
	private String msg;
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	private Map<String, DataOutputStream> clientsMap = new HashMap<String, DataOutputStream>();
	
	
	
	public final Map<String, DataOutputStream> getClientsMap() {
		return clientsMap;
	}
	public final void setGui(ServerGui gui) {
		this.gui = gui;
	}
	

	public void setting() throws IOException {
		// TODO Auto-generated method stub
		Collections.synchronizedMap(clientsMap); // 동기화
		serverSocket = new ServerSocket(3333);
		while (true) {
			/** XXX 01. 첫번째. 서버가 할일 분담. 계속 접속받는것. */
			System.out.println("서버 대기중...");
			socket = serverSocket.accept(); // 먼저 서버가 할일은 계속 반복해서 사용자를 받는다.
			System.out.println(socket.getInetAddress() + "에서 접속했습니다.");
			// 여기서 새로운 사용자 쓰레드 클래스 생성해서 소켓정보를 넣어준다
			Receiver receiver = new Receiver(socket);
			receiver.start();
		}
	}

	// 맵의내용(클라이언트) 저장과 삭제
		public void addClient(String nick, DataOutputStream out) throws IOException {
			sendMessage(nick + "님이 접속하셨습니다. \n");
			clientsMap.put(nick, out);

			gui.appendNick(nick+"\n");
		}

		public void removeClient(String nick) {
			sendMessage(nick + "님이 나가셨습니다.\n");
			clientsMap.remove(nick);

		}
		// 메시지 내용 전파
		public void sendMessage(String msg) {
			Iterator<String> it = clientsMap.keySet().iterator();
			String key = "";
			while (it.hasNext()) {
				key = it.next();
				try {
					clientsMap.get(key).writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		class Receiver extends Thread {
			private DataInputStream in;
			private DataOutputStream out;
			private String nick;

			/** XXX 2. 리시버가 한일은 자기 혼자서 네트워크 처리 계속..듣기.. 처리해주는 것. */
			public Receiver(Socket socket) throws IOException {
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());
				nick = in.readUTF();
				addClient(nick, out);
			}

			public void run() {
				try {// 계속 듣기만!!
					while (in != null) {
						msg = in.readUTF();
						//String sav = msg.substring(0,2);

						sendMessage(msg);
						gui.appendMsg(msg);
						toolkit.beep();  // 채팅이 오면 비프음 발생

					}
				} catch (IOException e) {
					// 사용접속종료시 여기서 에러 발생.  여기서 리무브 클라이언트 처리 해줍니다.
					removeClient(nick);

				}
			}
		}



	
	
}
