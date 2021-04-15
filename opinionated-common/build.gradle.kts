dependencies {
    api("net.kyori:indra-common:2.0.0-SNAPSHOT")
    api("org.cadixdev.gradle:licenser:0.6.0-SNAPSHOT")
}

indraPluginPublishing {
    plugin(
        id = "opinionated",
        mainClass = "ca.stellardrift.build.common.OpinionatedDefaultsPlugin",
        displayName = "Opinionated JVM Defaults",
        description = "Some basic configuration for JVM projects"
    )
}
