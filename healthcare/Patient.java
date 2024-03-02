package healthcare;

public class Patient {
        private String name;
        private int age;
        private String gender;

        public Patient(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        // Getters and setters for the Patient class
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }

//    // Define a HealthcareFacility interface
//    interface HealthcareFacility {
//        void admitPatient(Patient patient);
//        void dischargePatient(Patient patient);
//    }
//
//    // Define a Hospital class that implements the HealthcareFacility interface
//    class Hospital implements HealthcareFacility {
//        private List<Patient> patients;
//
//        public Hospital() {
//            this.patients = new ArrayList<>();
//        }
//
//        @Override
//        public void admitPatient(Patient patient) {
//            patients.add(patient);
//            System.out.println(patient.getName() + " admitted to the hospital.");
//        }
//
//        @Override
//        public void dischargePatient(Patient patient) {
//            patients.remove(patient);
//            System.out.println(patient.getName() + " discharged from the hospital.");
//        }
//
//        // Additional hospital-specific methods can be added here
//    }
//
//    public class HealthcareExample {
//        public static void main(String[] args) {
//            // Create a new hospital
//            Hospital hospital = new Hospital();
//
//            // Create some patients
//            Patient patient1 = new Patient("John Doe", 35, "Male");
//            Patient patient2 = new Patient("Jane Smith", 45, "Female");
//
//            // Admit patients to the hospital
//            hospital.admitPatient(patient1);
//            hospital.admitPatient(patient2);
//
//            // Discharge a patient from the hospital
//            hospital.dischargePatient(patient1);
//        }
//    }
//
//}
