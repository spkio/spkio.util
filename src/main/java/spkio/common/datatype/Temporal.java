package spkio.common.datatype;

import lombok.Builder;

@Builder
public record Temporal (

    Integer year,
	Integer month,
	Integer day,
	Integer hour,
	Integer minute,
	Integer second,
	Integer about

){}
