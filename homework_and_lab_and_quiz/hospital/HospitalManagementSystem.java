package homework_and_lab_and_quiz.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {

    private String name, medicalHistory, medications;
    private int age;

    public Patient(String name, int age, String medicalHistory, String medications) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.medications = medications;
    }

    public void displayPatientInfo() {
        System.out.println("Hasta Adı: " + name);
        System.out.println("Yaşı: " + age);
        System.out.println("Tıbbi Geçmiş: " + medicalHistory);
        System.out.println("Reçeteli İlaçlar: " + medications);
    }

    public void updateMedicalHistory(String newHistory) {
        this.medicalHistory = newHistory;
    }

    public void updateMedications(String newMedications) {
        this.medications = newMedications;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hasta: " + name + ", Yaş: " + age + ", Tıbbi Geçmiş: " + medicalHistory + ", Reçeteli İlaçlar: "
                + medications;
    }
}

class PatientManagementSystem {

    private List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Hasta eklendi: " + patient.toString());
        System.out.println();
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("Sistemde kayıtlı hasta yok.");
            return;
        }
        for (Patient patient : patients) {
            patient.displayPatientInfo();
            System.out.println("-----------------------------");
        }
    }

    public void searchPatient(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                patient.displayPatientInfo();
                return;
            }
        }
        System.out.println("Hasta bulunamadı.");
    }
}

public class HospitalManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientManagementSystem system = new PatientManagementSystem();
        while (true) {
            System.out.println("1. Yeni Hasta Ekle");
            System.out.println("2. Tüm Hastaları Görüntüle");
            System.out.println("3. Hasta Ara");
            System.out.println("4. Çıkış");
            System.out.println();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Hasta Adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Yaş: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Tıbbi Geçmiş: ");
                    String medicalHistory = scanner.nextLine();
                    System.out.print("Reçeteli İlaçlar: ");
                    String medications = scanner.nextLine();
                    Patient newPatient = new Patient(name, age, medicalHistory, medications);
                    system.addPatient(newPatient);
                    break;
                case 2:
                    system.displayAllPatients();
                    break;
                case 3:
                    System.out.println("Aranacak Hasta Adı: ");
                    String searchName = scanner.nextLine();
                    system.searchPatient(searchName);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;
            }
            scanner.close();
        }
    }
}
/*
1. Yeni Hasta Ekle
2. Tüm Hastaları Görüntüle
3. Hasta Ara
4. Çıkış

1
Hasta Adı: omer
Yaş: 14
Tıbbi Geçmiş: epilepsi
Reçeteli İlaçlar: Tegratol
Hasta eklendi: Hasta: omer, Yaş: 14, Tıbbi Geçmiş: epilepsi, Reçeteli İlaçlar: Tegratol

1. Yeni Hasta Ekle
2. Tüm Hastaları Görüntüle
3. Hasta Ara
4. Çıkış

2
Hasta Adı: omer
Yaşı: 14
Tıbbi Geçmiş: epilepsi
Reçeteli İlaçlar: Tegratol
-----------------------------
1. Yeni Hasta Ekle
2. Tüm Hastaları Görüntüle
3. Hasta Ara
4. Çıkış

4
Çıkış yapılıyor...
 */
