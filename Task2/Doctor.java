import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human {
    private int category;
    private List<Patient> patients;

    public Doctor (String name, String surname, int category) {
        System.out.println("Doctor");
        super.setName(name);
        super.setSurname(surname);
        this.category = category;
        this.patients = new ArrayList<>();
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public int getCategory() {
        return category;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient newPatient) {
        patients.add(newPatient);
    }

    public void removePatient(Patient p) {
        patients.remove(p);
    }

}
