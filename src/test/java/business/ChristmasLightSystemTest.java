package business;

import business.model.LightCoordinate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class ChristmasLightSystemTest {

    @Test
    void must_turn_on_one_light_with_coordinate_0_0() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(0,0,0,0);

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(0,0)), lightCoordinates);
    }
}
