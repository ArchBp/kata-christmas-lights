package business;

import business.model.LightCoordinate;

import java.util.ArrayList;
import java.util.List;

public class ChristmasLightSystem {

    public List<LightCoordinate> turnOn(LightCoordinate lightCoordinate1, LightCoordinate lightCoordinate2) {
        List<LightCoordinate> coordinatesOfTurnedOnLights = new ArrayList<>();
        if(lightCoordinate1.equals(lightCoordinate2))
            coordinatesOfTurnedOnLights.add(new LightCoordinate(lightCoordinate1.getX(), lightCoordinate1.getY()));
        else {
            for(int i = lightCoordinate1.getX(); i <= lightCoordinate2.getX(); i++){
                coordinatesOfTurnedOnLights.add(new LightCoordinate(i, lightCoordinate1.getY()));
            }
        }
        return coordinatesOfTurnedOnLights;
    }
}
