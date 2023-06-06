package spkio.common.datatype;

import lombok.Builder;

@Builder
public record ContentOut(

	String filename,
	String type,
	Long size

) {}
