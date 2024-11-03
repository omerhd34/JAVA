package homework_and_lab_and_quiz.employee;

public class Employee {

    private String name; // Çalışanın adını saklamak için özel bir değişken tanımla
    private String jobTitle;  // Çalışanın iş unvanını saklamak için özel bir değişken tanımla
    private double salary;   // Çalışanın maaşını saklamak için özel bir değişken tanımla

    // Employee sınıfının yapıcısı (constructor), ad, iş unvanı ve maaş değişkenlerini başlatır
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;              // Ad değişkenini verilen ad parametresi ile ayarla
        this.jobTitle = jobTitle;      // JobTitle değişkenini verilen iş unvanı parametresi ile ayarla
        this.salary = salary;          // Maaş değişkenini verilen maaş parametresi ile ayarla
    }
    // Çalışanın adını almak için bir yöntem (method)

    public String getName() {
        return name;           // Name değişkeninin değerini geri döndür
    }
    // Çalışanın adını ayarlamak için bir yöntem (method)

    public void setName(String name) {
        this.name = name;            // Name değişkenini verilen ad parametresi ile ayarla
    }
    // Çalışanın iş unvanını almak için bir yöntem (method)

    public String getJobTitle() {
        return jobTitle;             // JobTitle değişkeninin değerini geri döndür
    }
    // Çalışanın iş unvanını ayarlamak için bir yöntem (method)

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;     // JobTitle değişkenini verilen iş unvanı parametresi ile ayarla
    }
    // Çalışanın maaşını almak için bir yöntem (method)

    public double getSalary() {
        return salary;          // Salary (maaş) değişkeninin değerini geri döndür
    }
    // Çalışanın maaşını ayarlamak için bir yöntem (method)

    public void setSalary(double salary) {
        this.salary = salary;           // Salary (maaş) değişkenini verilen maaş parametresi ile ayarla
    }
    // Çalışanın maaşını belirli bir yüzde ile artırmak için bir yöntem

    public void raiseSalary(double percentage) {
        salary = salary + salary * percentage / 100;   // Verilen yüzdeye göre maaşı artırarak yeni maaşı hesapla
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);  // Çalışanın adını yazdır
        System.out.println("Job Title: " + jobTitle);  // Çalışanın iş unvanını yazdır
        System.out.println("Salary: " + salary); // Çalışanın maaşını yazdır
    }
}
/*
Employee Details:
Name: Ömer Halis Demir
Job Title: Full Stack Developer
Salary: 50000.0
Name: Nisa Demir
Job Title: Psychologist
Salary: 45000.0

After raising salary:

8% for 'Ömer Halis Demir':
Name: Ömer Halis Demir
Job Title: Full Stack Developer
Salary: 54000.0

12% for 'Nisa Demir':
Name: Nisa Demir
Job Title: Psychologist
Salary: 50400.0
 */
