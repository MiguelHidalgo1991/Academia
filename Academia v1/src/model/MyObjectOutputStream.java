package model;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {

	protected MyObjectOutputStream(OutputStream outStream) throws IOException {
		super(outStream);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
	}

}
