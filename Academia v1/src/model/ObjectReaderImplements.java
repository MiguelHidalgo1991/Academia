package model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReaderImplements implements ObjectReader {
	private ObjectInputStream inStream;

	public ObjectReaderImplements(File f) {
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			inStream = new ObjectInputStream(bis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void close() throws Exception {
		inStream.close();
	}

	@Override
	public Object nextObject() throws IOException {
		try {
			return inStream.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
