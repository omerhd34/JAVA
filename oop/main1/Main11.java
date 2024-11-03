package oop.main1;

public class Main11 {

    int modelYear;
    String modelName;

    public Main11(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main11 myCar = new Main11(2023, "TOGG");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
// 2023 TOGG
