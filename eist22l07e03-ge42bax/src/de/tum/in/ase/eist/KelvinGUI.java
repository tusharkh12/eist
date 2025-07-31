package de.tum.in.ase.eist;

import java.awt.Point;

public class KelvinGUI extends TemperatureGUI  {

    public KelvinGUI(TemperatureModel model, Point location) {
        super("Kelvin Temperature", model, location);
        addRaiseTempListener(() -> getModel().increaseC(1.0));
        addLowerTempListener(() -> getModel().increaseC(-1.0));
        addDisplayListener(() -> {
            double value = getDisplay();
            getModel().setK(value);
        });
    }

    @Override
    public void onUpdate(Double newState) {
        setDisplay(String.valueOf(TemperatureConverter.convertCelsiusToKelvin(newState)));
    }

    //TODO: 1.5.1: Implement onUpdate: Invoke the method setDisplay() with the new value converted to a String
}
