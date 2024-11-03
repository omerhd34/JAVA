package homework_and_lab_and_quiz.employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ömer Halis Demir", "Full Stack Developer", 50000);
        Employee employee2 = new Employee("Nisa Demir", "Psychologist", 45000);

        System.out.println("\nEmployee Details:");   // Çalışan detayları bölümü için bir başlık yazdır
        employee1.printEmployeeDetails();  // employee1 nesnesinin detaylarını yazdır
        employee2.printEmployeeDetails();  // employee2 nesnesinin detaylarını yazdır
        employee1.raiseSalary(8);  // employee1'in maaşını %8 oranında artır
        employee2.raiseSalary(12); // employee2'nin maaşını %12 oranında artır

        System.out.println("\nAfter raising salary:");   // Maaşların artırıldığını belirten bir başlık yazdır

        System.out.println("\n8% for 'Ömer Halis Demir':"); // employee1'in maaş artışı ile ilgili başlık yazdır
        employee1.printEmployeeDetails(); // Güncellenmiş employee1 detaylarını yazdır

        System.out.println("\n12% for 'Nisa Demir':");  // employee2'nin maaş artışı ile ilgili başlık yazdır
        employee2.printEmployeeDetails();  // Güncellenmiş employee2 detaylarını yazdır
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
