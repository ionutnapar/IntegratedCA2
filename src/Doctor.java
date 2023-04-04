public class Doctor {
    private final String name;
    private final String department;
    private final String speciality;
    private final boolean canPerformSurgery;
    private final boolean isOnDuty;

    public Doctor(String name, String department, String speciality, boolean canPerformSurgery, boolean isOnDuty) {
        this.name = name;
        this.department = department;
        this.speciality = speciality;
        this.canPerformSurgery = canPerformSurgery;
        this.isOnDuty = isOnDuty;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isCanPerformSurgery() {
        return canPerformSurgery;
    }

    public boolean isOnDuty() {
        return isOnDuty;
    }
}
