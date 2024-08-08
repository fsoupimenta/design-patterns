package org.example.structural.decorator;

public class BasicMedicalPlan implements MedicalPlan {

    private float cost;

    public BasicMedicalPlan(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public String getDescription() {
        return "Basic Medical Plan";
    }
}