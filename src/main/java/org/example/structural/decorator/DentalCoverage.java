package org.example.structural.decorator;


public class DentalCoverage extends MedicalPlanDecorator {

    public DentalCoverage(MedicalPlan medicalPlan) {
        super(medicalPlan);
    }

    public float getAdditionalCost() {
        return 15.0f;
    }

    public String getAdditionalDescription() {
        return "Dental Coverage";
    }
}