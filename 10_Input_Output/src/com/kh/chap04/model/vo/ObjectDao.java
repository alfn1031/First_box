package com.kh.chap04.model.vo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDao {
	
	// 출력
	public void outputFile() {
		Message m = new Message("김민수", "반가워요~");
		
		try(ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("e_object.txt"))){
			fos.writeObject(m);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inputFile() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.txt"))){
			Message m = (Message)ois.readObject();
			System.out.println(m);			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
