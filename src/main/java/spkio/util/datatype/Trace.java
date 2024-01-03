package spkio.util.datatype;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true, fluent = true)
public record Trace (

    String id,

	String nmRemoteAddress,
	Integer nrRemotePort,
	String nmMethod,

	String nmRequestHeaderUserAgent,
	String nmRequestURL,
	String nmRequestMethod,

	String content,

    String token

) {

	public static Trace id(String id) {
		return new Trace(id, null, null, null, null, null, null, null, null);
	}

}