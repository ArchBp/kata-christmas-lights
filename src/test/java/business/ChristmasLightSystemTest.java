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
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(0,0),new LightCoordinate(0,0));

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(0,0)), lightCoordinates);
    }

    @Test
    void must_turn_on_one_light_with_coordinate_999_999() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(999,999),new LightCoordinate(999,999));

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(999, 999)), lightCoordinates);
    }

    @Test
    void must_turn_on_one_light_with_coordinate_500_500() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(500,500),new LightCoordinate(500,500));

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(500, 500)), lightCoordinates);
    }

    @Test
    void must_turn_on_lights_from_coordinate_0_0_to_coordinate_2_0() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(0,0),new LightCoordinate(2,0));

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(0, 0), new LightCoordinate(1, 0), new LightCoordinate(2, 0)), lightCoordinates);
    }

    @Test
    void must_turn_on_lights_from_coordinate_3_0_to_coordinate_5_0() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(3,0),new LightCoordinate(5,0));

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(3, 0), new LightCoordinate(4, 0), new LightCoordinate(5, 0)), lightCoordinates);
    }

    @Test
    void must_turn_on_lights_from_coordinate_0_1_to_coordinate_2_1() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(0,1),new LightCoordinate(2,1));

        //Assert
        Assertions.assertIterableEquals(List.of(new LightCoordinate(0, 1), new LightCoordinate(1, 1), new LightCoordinate(2, 1)), lightCoordinates);
    }

    @Test
    void must_turn_on_all_1000_lights_in_first_line() {
        //Arrange
        ChristmasLightSystem christmasLightSystem = new ChristmasLightSystem();

        //Act
        List<LightCoordinate> lightCoordinates = christmasLightSystem.turnOn(new LightCoordinate(0,0),new LightCoordinate(999,0));

        //Assert
        Assertions.assertEquals(1000, lightCoordinates.size());
    }
}
