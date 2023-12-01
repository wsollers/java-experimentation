package(default_visibility = ["//visibility:public"])

load("@rules_java//java:defs.bzl", "java_binary")


load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

load("@rules_jvm_external//:defs.bzl", "artifact")

java_binary(
  name = "java-experimentation",
  srcs = glob(["src/main/java/dev/wsollers/**/*.java"]),
  resources = glob(["src/main/resources/**/*"]),
  main_class = "dev.wsollers.Main",
  deps = [
    artifact("org.slf4j:slf4j-api:2.0.9"),
#   artifact("org.apache.logging.log4j:log4j-api:2.22.0"),
#   artifact("org.apache.logging.log4j:log4j-core:2.22.0"),
#   artifact("org.apache.logging.log4j:log4j-to-slf4j:2.16.0"),
  ],
)

