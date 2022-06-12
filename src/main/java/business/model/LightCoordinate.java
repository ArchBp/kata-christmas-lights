package business.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@ToString
@EqualsAndHashCode
@Getter
public class LightCoordinate {
    public static final String X_COORDINATE_COULD_NOT_BE_NULL = "X coordinate could not be null";
    public static final String Y_COORDINATE_COULD_NOT_BE_NULL = "Y coordinate could not be null";
    private final Integer x;
    private final Integer y;
    public LightCoordinate(Integer x, Integer y) {
        Objects.requireNonNull(x, X_COORDINATE_COULD_NOT_BE_NULL);
        Objects.requireNonNull(y, Y_COORDINATE_COULD_NOT_BE_NULL);
        this.x = x;
        this.y = y;
    }
}
