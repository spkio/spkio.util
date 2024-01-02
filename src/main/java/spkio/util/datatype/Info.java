package spkio.util.datatype;

import java.util.Date;

import lombok.Builder;

@Builder
public record Info (

	Date update,
	Date delete,
	String trace

) {

	public static Info now() {
		return new Info(new Date(), null, null);
	}

	public static Info now(String trace) {
		return new Info(new Date(), null, trace);
	}

	public static Info delete(String trace) {
		return new Info(new Date(), new Date(), trace);
	}

}