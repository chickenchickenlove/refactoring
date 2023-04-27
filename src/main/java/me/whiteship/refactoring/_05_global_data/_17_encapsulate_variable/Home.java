package me.whiteship.refactoring._05_global_data._17_encapsulate_variable;

public class Home {

    public static void main(String[] args) {
        System.out.println(Thermostats.targetTemperature);
        // 전역 변수에 직접 접근 → 메서드로 변수 캡슐화 필요함.
        Thermostats.targetTemperature = 68;
        Thermostats.readInFahrenheit = false;
    }
}
