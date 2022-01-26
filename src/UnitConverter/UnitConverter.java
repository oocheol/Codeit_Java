package UnitConverter;

public class UnitConverter {
    public static final double POUND = 0.45359237;
    public static final double INCH = 2.54;
    
    // private static UnitConverter
    
    public static double toPounds(double kilograms) {
        return kilograms / POUND ;
    }
    public static double toKilograms(double pounds) {
        return pounds * POUND;
    }
    public static double toCentimeters(double inches) {
        return inches * INCH;
    }
    public static double toInches(double centimeters) {
        return centimeters / INCH;
    }
    // 괄호를 묶으면 int값으로 변환되면서 값이 달라질 수 있음 !!
    public static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}