package spkio.common.datatype;

import lombok.Builder;

@Builder
public record SourceIn (

	String name,
	String source,
	Temporal acquireDate

) {}