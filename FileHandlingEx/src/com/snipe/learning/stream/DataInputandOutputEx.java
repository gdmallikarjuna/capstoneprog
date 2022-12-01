package com.snipe.learning.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputandOutputEx {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		DataOutputStream dataOutputStream =
                new DataOutputStream(
                        new FileOutputStream("F:\\Support\\Training\\sugamys_secondinnings\\java_backend\\day4\\files\\stdinfo.txt"));

        dataOutputStream.writeInt(123);
        dataOutputStream.writeFloat(123.45F);
        dataOutputStream.writeLong(789);

        dataOutputStream.close();

        DataInputStream dataInputStream =
                new DataInputStream(
                        new FileInputStream("F:\\Support\\Training\\sugamys_secondinnings\\java_backend\\day4\\files\\stdinfo.txt"));

        int   int123     = dataInputStream.readInt();
        float float12345 = dataInputStream.readFloat();
        long  long789    = dataInputStream.readLong();

        dataInputStream.close();

        System.out.println("int123     = " + int123);
        System.out.println("float12345 = " + float12345);
        System.out.println("long789    = " + long789);
	}

}
