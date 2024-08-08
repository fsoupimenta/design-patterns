package org.example.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalPlanTest {

    @Test
    void shouldReturnBasicPlanCost() {
        MedicalPlan plan = new BasicMedicalPlan(100.0f);

        assertEquals(100.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithDentalCoverage() {
        MedicalPlan plan = new DentalCoverage(new BasicMedicalPlan(100.0f));

        assertEquals(115.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithNutritionistConsultation() {
        MedicalPlan plan = new NutritionistConsultation(new BasicMedicalPlan(100.0f));

        assertEquals(130.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(new BasicMedicalPlan(100.0f));

        assertEquals(125.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithDentalCoverageAndNutritionistConsultation() {
        MedicalPlan plan = new NutritionistConsultation(new DentalCoverage(new BasicMedicalPlan(100.0f)));

        assertEquals(145.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithDentalCoverageAndPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(new DentalCoverage(new BasicMedicalPlan(100.0f)));

        assertEquals(140.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithNutritionistConsultationAndPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(new NutritionistConsultation(new BasicMedicalPlan(100.0f)));

        assertEquals(155.0f, plan.getCost());
    }

    @Test
    void shouldReturnPlanCostWithDentalCoverageNutritionistConsultationAndPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(
                new NutritionistConsultation(
                        new DentalCoverage(new BasicMedicalPlan(100.0f))
                )
        );

        assertEquals(170.0f, plan.getCost());
    }

    @Test
    void shouldReturnBasicPlanDescription() {
        MedicalPlan plan = new BasicMedicalPlan(100.0f);

        assertEquals("Basic Medical Plan", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithDentalCoverage() {
        MedicalPlan plan = new DentalCoverage(new BasicMedicalPlan(100.0f));

        assertEquals("Basic Medical Plan, Dental Coverage", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithNutritionistConsultation() {
        MedicalPlan plan = new NutritionistConsultation(new BasicMedicalPlan(100.0f));

        assertEquals("Basic Medical Plan, Nutritionist Consultation", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(new BasicMedicalPlan(100.0f));

        assertEquals("Basic Medical Plan, Psychologist Consultation", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithDentalCoverageAndNutritionistConsultation() {
        MedicalPlan plan = new NutritionistConsultation(new DentalCoverage(new BasicMedicalPlan(100.0f)));

        assertEquals("Basic Medical Plan, Dental Coverage, Nutritionist Consultation", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithDentalCoverageAndPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(new DentalCoverage(new BasicMedicalPlan(100.0f)));

        assertEquals("Basic Medical Plan, Dental Coverage, Psychologist Consultation", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithNutritionistConsultationAndPsychologistConsultation() {
        MedicalPlan plan = new PsychologistConsultation(new NutritionistConsultation(new BasicMedicalPlan(100.0f)));

        assertEquals("Basic Medical Plan, Nutritionist Consultation, Psychologist Consultation", plan.getDescription());
    }

    @Test
    void shouldReturnPlanDescriptionWithAllOptions() {
        MedicalPlan plan = new PsychologistConsultation(
                new NutritionistConsultation(
                        new DentalCoverage(new BasicMedicalPlan(100.0f))
                )
        );

        assertEquals("Basic Medical Plan, Dental Coverage, Nutritionist Consultation, Psychologist Consultation", plan.getDescription());
    }
}