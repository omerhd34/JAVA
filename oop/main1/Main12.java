package oop.main1;

public class Main12 {

    private String firstName;
    private String lastName;
    private String gender;
    private String nationality;
    private String job;
    private int age;

    // Üç parametreli yapıcı metod (gender, nationality ve job bilgisi olmadan)
    public Main12(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Tüm bilgileri alan yapıcı metod
    public Main12(String firstName, String lastName, int age, String gender, String nationality, String job) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.nationality = nationality;
        this.job = job;
    }

    // Getter metodları
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getJob() {
        return job;
    }

    // Yaş aralığına göre kişinin genç olup olmadığını kontrol eden metod
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        // İlk kişi (gender, nationality ve job bilgisi olmadan)
        Main12 person1 = new Main12("Ömer Halis", "Demir", 26);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());
        System.out.println();

        // İkinci kişi (tüm bilgilerle)
        Main12 person2 = new Main12("Ömer Halis", "Demir", 26, "Male", "Turkish", "Full Stack Developer");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());
        System.out.println("Nationality: " + person2.getNationality());
        System.out.println("Job: " + person2.getJob());
        System.out.println("Is Teen: " + person2.isTeen());
    }
}
/*
Firstname: Ömer Halis
LastName: Demir
Age: 26
Is Teen: false

Firstname: Ömer Halis
LastName: Demir
Age: 26
Gender: Male
Nationality: Turkish
Job: Full Stack Developer
Is Teen: false


----------------------------------------
|                Main12                |
----------------------------------------
| - firstName : String                 |
| - lastName : String                  |
| - gender : String                    |
| - nationality : String               |
| - job : String                       |
| - age : int                          |
----------------------------------------
| + Main12(firstName: String,          |
|          lastName: String,           |
|          age: int)                   |
| + Main12(firstName: String,          |
|          lastName: String,           |
|          age: int,                   |
|          gender: String,             |
|          nationality: String,        |
|          job: String)                |
| + getFirstName() : String            |
| + getLastName() : String             |
| + getAge() : int                     |
| + getGender() : String               |
| + getNationality() : String          |
| + getJob() : String                  |
| + isTeen() : boolean                 |
| + main(args : String[]) : void       |
----------------------------------------



 */
