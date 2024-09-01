package org.example.behavioural.observer;

public enum DeviceType {
    SMARTPHONE, TABLET, DESKTOP;

    @Override
    public String toString() {
        return switch (this) {
            case SMARTPHONE -> "Smartphone";
            case TABLET -> "Tablet";
            case DESKTOP -> "Desktop";
            default -> "";
        };
    }
}
