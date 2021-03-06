/*
 * Copyright (c) 2018 Zac Sweers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  kotlin("jvm")
  kotlin("kapt")
}

apply {
  from(rootProject.file("gradle/config-kotlin-sources.gradle"))
}

dependencies {
  kapt(deps.auto.service)
  compileOnly(deps.auto.service)

  implementation(project(":service-registry:service-registry-annotations"))
  implementation(deps.auto.common)
  implementation(deps.crumb.annotations)
  implementation(deps.crumb.compilerApi)
  implementation(deps.dagger.runtime)
  implementation(deps.kotlin.metadata)
  implementation(deps.kotlin.poet)
  implementation(deps.kotlin.stdlib.jdk8)
}
