package org.sarb.config.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by chazz on 5/25/2015.
 */
@Configuration
@Profile("env_production")
@PropertySource("classpath:environment/production/env_production.properties")
public class ProdProfile {
}
