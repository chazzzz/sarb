package org.sarb.config.profiles;

/**
 * Created by chazz on 5/25/2015.
 */
public enum EnvironmentProfile {

    DEVELOPMENT
    ("env_development"),

    TESTING
    ("env_testing"),

    PRODUCTION
    ("env_production");

    private String environmentProfile;

    EnvironmentProfile(String environmentProfile) {
        this.environmentProfile = environmentProfile;
    }

    public String getEnvironmentProfile() {
        return environmentProfile;
    }

    public static EnvironmentProfile getEnvironmentProfile(String environmentProfile) {
        if (DEVELOPMENT.getEnvironmentProfile().equalsIgnoreCase(environmentProfile)) {
            return DEVELOPMENT;
        }

        if (TESTING.getEnvironmentProfile().equalsIgnoreCase(environmentProfile)) {
            return TESTING;
        }

        if (PRODUCTION.getEnvironmentProfile().equalsIgnoreCase(environmentProfile)) {
            return PRODUCTION;
        }

        return null;
    }
}
