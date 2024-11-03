package oop.main1;

public class Main6 {

    String fname = "Omer Halis";
    String lname = "Demir";
    int age = 26;

    public static void main(String[] args) {
        Main6 myObj = new Main6();
        System.out.println(myObj.fname + " " + myObj.lname);                 // Omer Halis Demir
        System.out.println(myObj.fname.concat(" " + myObj.lname));           // Omer Halis Demir
        System.out.println(myObj.age);                                       // 26
    }
}
