package org.example.structural.decorator;

public class PsychologistConsultation extends MedicalPlanDecorator {

    public PsychologistConsultation(MedicalPlan medicalPlan) {
        super(medicalPlan);
    }

    public float getAdditionalCost() {
        return 25.0f;
    }

    public String getAdditionalDescription() {
        return "Psychologist Consultation";
    }
}