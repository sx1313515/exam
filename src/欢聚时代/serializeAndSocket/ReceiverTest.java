package ����ʱ��.serializeAndSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import ����ʱ��.serializeAndSocket.impl.ReceiverImpl;

public class ReceiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server;
		try {
			server = new ServerSocket(7778);
			System.out.println("�������������ȴ��ͻ��˵�����");
			Socket socket = server.accept();
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[1024];
			is.read(bytes);
			ReceiverImpl receive = new ReceiverImpl();
			MyObject no = null;
			no = receive.receive(bytes);
			System.out.println(no.toString());
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			osw.write("������˵��������ϣ�");
			osw.flush();
			socket.shutdownOutput();
			//�ر���Դ
			os.close();
			osw.close();
			socket.close();
			//while(is.read())
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
