public class Patient extends Human {
    private Chumber chumber;
    private Doctor doctor;

    public Patient (String name, String surname) {
        System.out.println("Patient");
        super.setName(name);
        super.setSurname(surname);
    }

    public void setChumber(Chumber chumber) {
        this.chumber = chumber;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Chumber getChumber() {
        return chumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void removeDoctor() {
        this.doctor = null;
    }
}
