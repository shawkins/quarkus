package io.quarkus.runtime;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;


import java.util.Optional;


@ConfigRoot(phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class ApplicationConfig {

    /**
     * The name of the application.
     * If not set, defaults to the name of the project (except for tests where it is not set at all).
     */
    @ConfigItem
    public Optional<String> name;

    /**
     * The version of the application.
     * If not set, defaults to the version of the project (except for tests where it is not set at all).
     */
    @ConfigItem
    public Optional<String> version;
}
