package de.tum.in.ase.eist;

import java.awt.Point;

public class CelsiusGUI extends TemperatureGUI {

    public CelsiusGUI(TemperatureModel model, Point location) {
        super("Celsius Temperature", model, location);
        addRaiseTempListener(() -> getModel().increaseC(1.0));
        addLowerTempListener(() -> getModel().increaseC(-1.0));
        addDisplayListener(() -> {
            double value = getDisplay();
            getModel().setC(value);
        });
    }

    @Override
    public void onUpdate(Double newState) {
        setDisplay(String.valueOf(newState));
    }

    //TODO: 1.5.1: Implement onUpdate: Invoke the method setDisplay() with the new value converted to a String
}
