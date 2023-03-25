package task1.t1;

public class Convert {
    private final double temperatureCelsius;

    public Convert(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public double getTemperatureKelvin(){
        return temperatureCelsius + 273.15;
    }

    public double getTemperatureFahrenheit(){
        return temperatureCelsius * 1.8 + 32;
    }
}
