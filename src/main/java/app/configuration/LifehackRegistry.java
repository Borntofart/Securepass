package app.configuration;

import app.entities.LifehackSite;

import java.util.List;

public class LifehackRegistry {

    public static List<LifehackSite> getSites() {
        return List.of(
                // Team E
                new LifehackSite(
                        "SecurePass",
                        "Skab stærkere passwords",
                        "/securepass",
                        "/images/teame/securepass-logo.svg"
                )
        );

    }
}
