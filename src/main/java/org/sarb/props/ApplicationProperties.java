package org.sarb.props;

import org.sarb.config.profiles.EnvironmentProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by chazz on 5/25/2015.
 */
@Component
public class ApplicationProperties {

    @Value("${app.environment_profile}")
    private String activeEnvironment;

    public EnvironmentProfile getActiveEnvironmentProfile() {
        return EnvironmentProfile.getEnvirontmentProfile(activeEnvironment);
    }

    public String getActiveEnvironment() {
        return activeEnvironment;
    }
}
