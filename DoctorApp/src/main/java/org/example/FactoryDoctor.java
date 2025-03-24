package DoctorApp.src.main.java.org.example;

public class FactoryDoctor {
    public static Doctor createDoctor(String doctorID, String specialization, boolean availability) {
        return new Doctor.DoctorBuilder()
                .setDoctorID(doctorID)
                .setSpecialization(specialization)
                .isAvailable(availability)
                .build();
    }
}
