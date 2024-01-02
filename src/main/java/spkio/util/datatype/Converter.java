package spkio.util.datatype;

import java.io.Serializable;

public interface Converter<T> extends Serializable {
	
	T to();

}
