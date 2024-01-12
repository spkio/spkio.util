package spkio.util.exception;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import spkio.util.HTTP;

@Getter @Setter @Accessors(fluent = true, chain = true)
@NoArgsConstructor
public class Code implements Serializable {
	
	private Integer httpStatus = null;
	private String message = null;
	private String key = null;
	private String[] detail = null;
		
	public Code(HTTP.Status httpStatus, String key) {
		this.httpStatus = httpStatus.code;
		this.key = key;
	}

	public Code(HTTP.Status httpStatus, String key, String[] detail) {
		this(httpStatus, key);
		this.detail = detail;
	}

	public Code(String key) {
		this(HTTP.Status.INTERNAL_SERVER_ERROR, key);
	}
		
}
