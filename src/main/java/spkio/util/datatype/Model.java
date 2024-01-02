package spkio.util.datatype;

import java.util.List;
import java.util.stream.Collectors;

public final class Model {

	private Model() { }

	public final static <T> List<T> to(List<? extends Converter<T>> vos) {
		return vos.stream().map(Converter::to).collect(Collectors.toList());
	}

	public final static <T> List<T> parallelTo(List<? extends Converter<T>> vos) {
		return vos.parallelStream().map(Converter::to).collect(Collectors.toList());
	}

}
