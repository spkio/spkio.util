package spkio.common.util;

import java.util.AbstractMap;
import java.util.Map;

public final class Pair {

    public static <T, U> Map.Entry<T, U> of(T key, U value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

}