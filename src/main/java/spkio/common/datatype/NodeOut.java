package spkio.common.datatype;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import lombok.Builder;

@Builder
public record NodeOut (

	String id,
	String key,
	Map<String, String> attributes, // <keys, <links, element>>
	Map<String, NodeOut> dictionary,
	ContentOut content,

	String text,
	BigInteger integer,
	BigDecimal decimal,
	Temporal datetime

) {}