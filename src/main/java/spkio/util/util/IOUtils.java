package spkio.common.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class IOUtils {
	
	private IOUtils() { }
	
	public static String fileAsString(String filename) throws IOException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream(filename);
		
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	    int nRead;
	    byte[] data = new byte[1024];
	    while ((nRead = stream.read(data, 0, data.length)) != -1) {
	        buffer.write(data, 0, nRead);
	    }
	 
	    buffer.flush();
	    String o = new String(buffer.toByteArray());
	    buffer.close();
	    return o;
	}
	
	public static Properties fileAsProperties(String filename) throws IOException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream stream = loader.getResourceAsStream(filename);
		
		Properties p = new Properties();
		p.load(stream);
		
		return p;
	}

}
