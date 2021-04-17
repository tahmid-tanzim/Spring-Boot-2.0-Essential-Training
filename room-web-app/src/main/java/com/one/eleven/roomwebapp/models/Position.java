package com.one.eleven.roomwebapp.models;

public enum Position {
    CUSTOMER_SERVICE_REPRESENTATIVE,
    MARKETING_EXECUTIVE,
    RESTAURANT_MANAGER,
    HOUSEKEEPING,
    FRONT_DESK,
    CONCIERGE,
    SECURITY;

    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
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
