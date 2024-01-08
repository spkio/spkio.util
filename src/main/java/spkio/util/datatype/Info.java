package spkio.util.datatype;

import java.util.Date;

import lombok.Builder;

@Builder
public record Info (

	Date update,
	Date delete,
	Trace trace

) {

	public static Info now() {
		return new Info(new Date(), null, null);
	}

	public static Info now(String idTrace) {
		return new Info(new Date(), null, Trace.id(idTrace));
	}

	public static Info now(Trace trace) {
		return new Info(new Date(), null, trace);
	}

	public static Info remove() {
		return new Info(new Date(), new Date(), null);
	}

	public static Info info(Date update, Date delete, String idTrace) {
		return new Info(update, delete, Trace.id(idTrace));
	}

}