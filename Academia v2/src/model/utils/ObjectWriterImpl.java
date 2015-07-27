package model.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriterImpl implements ObjectWriter {
	private ObjectOutputStream outStream;

	public ObjectWriterImpl(File f) {
		boolean b = f.exists();
		try {
			FileOutputStream fos = new FileOutputStream(f, b);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			outStream = b ? new MyObjectOutputStream(bos) : new ObjectOutputStream(bos);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void close() throws Exception {
		outStream.close();

	}

	@Override
	public void writeObject(Object input) throws IOException {
		outStream.writeObject(input);

	}

}
