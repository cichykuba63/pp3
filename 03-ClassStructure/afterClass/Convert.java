package afterClass;

public class Convert {
    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    static double celsiusToFahrenheit(double celsius) {
        return celsius * (9d / 5d) + 32;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    static double kelvinToFahrenheit(double kelvin) {
        return kelvin * (9d / 5d) - 459.67;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / (9d / 5d);
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * (5d / 9d);
    }

    public static void main(String[] args) {
        System.out.println(Convert.celsiusToKelvin(25));
        System.out.println(Convert.celsiusToFahrenheit(25));
        System.out.println(Convert.fahrenheitToCelsius(100));
        System.out.println(Convert.fahrenheitToKelvin(100));
        System.out.println(Convert.kelvinToCelsius(0));
        System.out.println(Convert.kelvinToFahrenheit(0));
    }
}
