package spkio.util.exception;

public class SpkioException extends Exception {
	
	private final Code code;
	
	public SpkioException(Code code) {
		super();
		this.code = code;
	}

	public SpkioException(Code code, Throwable e) {
		super(e);
		this.code = code;
		this.code.message(e.getMessage());
	}

	public SpkioException(Code code, String... detail) {
		super();
		this.code = code;
		this.code.detail(detail);
	}

	public SpkioException(Code code, Throwable e, String... detail) {
		super(e);
		this.code = code;
		this.code.message(e.getMessage());
		this.code.detail(detail);
	}

	public Code getCode() {
		return code;
	}
	
	public String[] getDetail() {
		return code.detail();
	}
	
}
