package 欢聚时代.serializeAndSocket.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import 欢聚时代.serializeAndSocket.MyObject;
import 欢聚时代.serializeAndSocket.Sender;

public class SenderImpl implements Sender{
	
	@Override
	public byte[] send(MyObject myObject) {
		// TODO Auto-generated method stub
		ByteArrayOutputStream baot = new ByteArrayOutputStream();
		byte[] bytes = null;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baot);
			oos.writeObject(myObject);
			oos.flush();
			bytes = baot.toByteArray();
			oos.close();
			baot.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bytes;
	}

}
