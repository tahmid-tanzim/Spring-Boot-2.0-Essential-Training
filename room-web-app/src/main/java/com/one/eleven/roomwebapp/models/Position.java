package com.one.eleven.roomwebapp.models;

public enum Position {
    CUSTOMER_SERVICE_REPRESENTATIVE,
    MARKETING_EXECUTIVE,
    RESTAURANT_MANAGER,
    HOUSEKEEPING,
    FRONT_DESK,
    SECURITY;

    public String toString() {
        switch (this) {
            case SECURITY:
                return "SECURITY";
            case FRONT_DESK:
                return "FRONT DESK";
            case HOUSEKEEPING:
                return "HOUSEKEEPING";
            case RESTAURANT_MANAGER:
                return "RESTAURANT MANAGER";
            case MARKETING_EXECUTIVE:
                return "MARKETING EXECUTIVE";
            case CUSTOMER_SERVICE_REPRESENTATIVE:
                return "CUSTOMER SERVICE REPRESENTATIVE";
            default:
                return "";
        }
    }
}
