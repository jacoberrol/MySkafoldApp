pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "SkafoldExampleApp"
include(":app")

includeBuild("skafold") {
    dependencySubstitution {
        substitute(module("io.oliverj.skafold:skafold"))
            .using(project(":skafold"))   // root project of the included build
    }
}
