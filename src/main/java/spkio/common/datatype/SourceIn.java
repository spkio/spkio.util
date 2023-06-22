package spkio.common.datatype;

import java.util.Date;

import lombok.Builder;

@Builder
public record SourceIn (

	String name,
	String source,
	Date acquireDate

) {}