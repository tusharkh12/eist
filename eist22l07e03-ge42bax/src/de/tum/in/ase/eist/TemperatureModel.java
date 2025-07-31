package de.tum.in.ase.eist;


//TODO Task 1.2: Make TemperatureModel observable by implementing Subject<Double>
public class TemperatureModel extends Subject<Double> {

    private double celsiusTemperature;

    public void setF(double tempF) {
        setC(TemperatureConverter.convertFahrenheitToCelsius(tempF));
    }

    public void setC(double tempC) {
        celsiusTemperature = tempC;
        super.notifyObservers(tempC);
        //TODO Task 1.2: Notify all observers about the temperature change
    }

    public void increaseF(double amount) {
        final double currentFahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(celsiusTemperature);
        final double newFahrenheit = currentFahrenheit + amount;

        setC(TemperatureConverter.convertFahrenheitToCelsius(newFahrenheit));
    }

    public void increaseC(double amount) {
        setC(celsiusTemperature + amount);
    }

    public void setK(double tempk) {
        setC(TemperatureConverter.convertKelvinToCelsius(tempk));
    }

    public void increaseK(double amount) {
        final double currentKelvin = TemperatureConverter.convertCelsiusToKelvin(celsiusTemperature);
        final double newKelvin = currentKelvin + amount;

        setC(TemperatureConverter.convertKelvinToCelsius(newKelvin));
    }


    //TODO Task 2.2: Add Kelvin-Support by implementing setK() and increaseK()
}
