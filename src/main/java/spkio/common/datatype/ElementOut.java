package spkio.common.datatype;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import lombok.Builder;

@Builder
public record ElementOut (

	String id,
	String key,
	Map<String, String> attributes, // <keys, <links, element>>
	Map<String, ElementOut> dictionary,
	ContentOut content,

	String text,
	BigInteger integer,
	BigDecimal decimal,
	Temporal datetime

) {}