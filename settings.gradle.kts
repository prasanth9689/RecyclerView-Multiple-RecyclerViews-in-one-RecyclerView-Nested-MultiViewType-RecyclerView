pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name =
    "RecyclerView-Multiple-RecyclerViews-in-one-RecyclerView-(Nested-MultiViewType-RecyclerView)"
include(":app")
 