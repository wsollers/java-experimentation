load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "4.3"
RULES_JVM_EXTERNAL_SHA = "6274687f6fc5783b589f56a2f1ed60de3ce1f99bc4e8f9edef3de43bdf7c6e74"

http_archive(
  name = "rules_jvm_external",
  sha256 = RULES_JVM_EXTERNAL_SHA,
  strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
  url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
  artifacts = [
    "org.slf4j:slf4j-api:2.0.9",
    "org.apache.logging.log4j:log4j-api:2.22.0",
    "org.apache.logging.log4j:log4j-core:2.22.0",
    "org.apache.logging.log4j:log4j-to-slf4j:2.16.0",
    "com.google.code.findbugs:jsr305:3.0.2",
    "com.google.errorprone:error_prone_annotations:2.11.0",
    "com.google.j2objc:j2objc-annotations:1.3",
    "org.codehaus.mojo:animal-sniffer-annotations:1.20",
    "org.checkerframework:checker-qual:3.12.0",
  ],
  fetch_sources = True,
  maven_install_json = "//:maven_install.json",
  repositories = [
    "https://repo1.maven.org/maven2",
  ],
  version_conflict_policy = "pinned",
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()
