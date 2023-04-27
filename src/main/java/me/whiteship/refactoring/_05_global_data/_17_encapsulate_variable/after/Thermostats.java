package me.whiteship.refactoring._05_global_data._17_encapsulate_variable.after;

// 메서드를 이용한 변수 캡슐화
public class Thermostats {

    private static Integer targetTemperature = 70;

    private static Boolean heating = true;

    private static Boolean cooling = false;

    private static Boolean readInFahrenheit = true;

    // 메서드로 캡슐화
    public static Integer getTargetTemperature() {
        return targetTemperature;
    }

    public static void setTargetTemperature(Integer targetTemperature) {
        // Validation 추가 가능
        Thermostats.targetTemperature = targetTemperature;
    }

    public static Boolean getHeating() {
        return heating;
    }

    public static void setHeating(Boolean heating) {
        // Validation 추가 가능
        Thermostats.heating = heating;
    }

    public static Boolean getCooling() {
        return cooling;
    }

    public static void setCooling(Boolean cooling) {
        // Validation 추가 가능
        Thermostats.cooling = cooling;
    }

    public static Boolean getReadInFahrenheit() {
        return readInFahrenheit;
    }

    public static void setReadInFahrenheit(Boolean readInFahrenheit) {
        // Validation 추가 가능
        Thermostats.readInFahrenheit = readInFahrenheit;
    }
}
