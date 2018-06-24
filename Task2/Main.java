public class Main {
    public static void main(String[] args) {
	    Chumber chumber = new Chumber(1);
	    Doctor doctor = new Doctor("Ivan", "Ivanov", 3);
	    Patient patient= new Patient("Pavel", "Ivanov");
	    patient.setDoctor(doctor);
        System.out.println("Patient " + patient.getName() + " " + patient.getSurname()+ " is treated by a doctor " + doctor.getName() + " " + doctor.getSurname());
        patient.setChumber(chumber);
		System.out.println("Patient " + patient.getName() + " " + patient.getSurname() + " is treated in chumber nomber " + chumber.getNumber());
		System.out.println("Doctor " + doctor.getName() + " " + doctor.getSurname() + " has a category nomber  " + doctor.getCategory());
    }
}
