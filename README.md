# LibGDX Gradle Kotlin DSL template
This is an template project for [libGDX](https://github.com/libgdx/libgdx)
written in Kotlin and built with Gradle Kotlin DSL. Only desktop
and android backends are available for now.

The gradle scripts created by the libGDX project creator use an
outdated gradle version (4.6) and deprecated features (compile,
classesDir, etc) This template aims to use only the most recent
features.

The template is supposed to work with IntelliJ out of the box but 
it might require some adjustments for other IDEs like Eclipse.

To use Java instead of Kotlin, replace all `kotlin("jvm")` plugin
declarations with `java` and remove all kotlin-related dependencies.