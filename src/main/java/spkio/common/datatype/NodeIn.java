package spkio.common.datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

import lombok.Builder;

@Builder
public record NodeIn (

	String idFrom,
	String idTo,
	String idKey,
	String idContent,

	String text,
	BigInteger integer,
	BigDecimal decimal,
	Temporal datetime

) {}