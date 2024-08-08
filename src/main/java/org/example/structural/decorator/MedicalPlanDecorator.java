package org.example.structural.decorator;

public abstract class MedicalPlanDecorator implements MedicalPlan {

    private MedicalPlan medicalPlan;

    public MedicalPlanDecorator(MedicalPlan medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public MedicalPlan getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(MedicalPlan medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public abstract float getAdditionalCost();

    public float getCost() {
        return this.medicalPlan.getCost() + this.getAdditionalCost();
    }

    public abstract String getAdditionalDescription();

    public String getDescription() {
        return this.medicalPlan.getDescription() + ", " + this.getAdditionalDescription();
    }
}