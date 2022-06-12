package business.model;

import lombok.EqualsAndHashCode;

import java.util.Objects;

@EqualsAndHashCode
public class LightCoordinate {
    public static final String X_COORDINATE_COULD_NOT_BE_NULL = "X coordinate could not be null";
    public static final String Y_COORDINATE_COULD_NOT_BE_NULL = "Y coordinate could not be null";
    private Integer x;
    private Integer y;
    public LightCoordinate(Integer x, Integer y) {
        Objects.requireNonNull(x, X_COORDINATE_COULD_NOT_BE_NULL);
        Objects.requireNonNull(y, Y_COORDINATE_COULD_NOT_BE_NULL);
    }
}
