package spkio.common.datatype;

import lombok.Builder;

@Builder
public record LinkIn (

	String idFrom,
	String idKey,

	NodeIn node

) {}