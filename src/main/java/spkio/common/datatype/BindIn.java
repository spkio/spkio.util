package spkio.common.datatype;

import lombok.Builder;

@Builder
public record BindIn (

	String idFrom,
	String idTo,
	String idKey

) {}