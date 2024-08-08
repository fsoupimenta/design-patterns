package org.example.structural.decorator;

public class NutritionistConsultation extends MedicalPlanDecorator {

    public NutritionistConsultation(MedicalPlan medicalPlan) {
        super(medicalPlan);
    }

    public float getAdditionalCost() {
        return 30.0f;
    }

    public String getAdditionalDescription() {
        return "Nutritionist Consultation";
    }
}