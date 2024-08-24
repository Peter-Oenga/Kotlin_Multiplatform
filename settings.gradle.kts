rootProject.name = "SimpleApplication"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
//                includeGroupAndSubgroups("androidx")
//                includeGroupAndSubgroups("com.android")
//                includeGroupAndSubgroups("com.google")
//                include(":androidx")
//                include(":com.android")
//                include(":com.google")
                include(":google")
                include(":android")
                include(":other-module")

            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
//                includeGroupAndSubgroups("androidx")
//                includeGroupAndSubgroups("com.android")
//                includeGroupAndSubgroups("com.google")
//                include(":androidx")
//                include(":com.android")
//                include(":com.google")
                include(":google")
                include(":android")
                include(":other-module")

            }
        }
        mavenCentral()
    }
}

include(":composeApp")