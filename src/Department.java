public class Department {
    private final boolean canPrescribeMedication;
    private final boolean canAdmitInPatient;
    private final boolean canDischargeInPatient;
    private final boolean canTransferPatient;
    private final boolean canHaveOperations;

    public Department(boolean canPrescribeMedication, boolean canAdmitInPatient, boolean canDischargeInPatient, boolean canTransferPatient, boolean canHaveOperations) {
        this.canPrescribeMedication = canPrescribeMedication;
        this.canAdmitInPatient = canAdmitInPatient;
        this.canDischargeInPatient = canDischargeInPatient;
        this.canTransferPatient = canTransferPatient;
        this.canHaveOperations = canHaveOperations;
    }

    public boolean isCanPrescribeMedication() {
        return canPrescribeMedication;
    }

    public boolean isCanAdmitInPatient() {
        return canAdmitInPatient;
    }

    public boolean isCanDischargeInPatient() {
        return canDischargeInPatient;
    }

    public boolean isCanTransferPatient() {
        return canTransferPatient;
    }

    public boolean isCanHaveOperations() {
        return canHaveOperations;
    }
}
