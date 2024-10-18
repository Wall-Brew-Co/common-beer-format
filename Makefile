MAKE = make

# These are the locations of the directories we'll use
TARGET_DIR = target

#
# Project Versioning
#
.PHONY: version/major
version/major:
	$(info Updating major version and adding CHANGELOG entry...)
	@ lein vcs assert-committed
	@ lein change version leiningen.release/bump-version major
	@ lein change version leiningen.release/bump-version release
	@ lein sealog bump major
	@ lein pom
	@ lein export-specs

.PHONY: version/minor
version/minor:
	$(info Updating minor version and adding CHANGELOG entry...)
	@ lein vcs assert-committed
	@ lein change version leiningen.release/bump-version minor
	@ lein change version leiningen.release/bump-version release
	@ lein sealog bump minor
	@ lein pom
	@ lein export-specs

.PHONY: version/patch
version/patch:
	$(info Updating patch version and adding CHANGELOG entry...)
	@ lein vcs assert-committed
	@ lein change version leiningen.release/bump-version patch
	@ lein change version leiningen.release/bump-version release
	@ lein sealog bump patch
	@ lein pom
	@ lein export-specs

.PHONY: changelog/render
changelog/render:
	$(info Rendering CHANGELOG...)
	@ lein sealog render

#
# Testing
#
.PHONY: tests/all
tests/all: tests/clojure tests/clojurescript

.PHONY: tests/clojure
tests/clojure:
	$(info Running Clojure tests...)
	@ lein test

.PHONY: tests/clojurescript
tests/clojurescript:
	$(info Running ClojureScript tests...)
	@ lein clean
	@ lein cljsbuild once test
	@ lein doo once

#
# Code Formatting
#
.PHONY: format/all
format/all: format/markdown format/clojure

.PHONY: format/markdown
format/markdown:
	$(info Updating Markdown formatting...)
	@ npm run update-toc

.PHONY: format/clojure
format/clojure:
	$(info Updating Clojure formatting...)
	@ lein cljstyle
	@ lein bouncer fix

#
# Code Linting
#
.PHONY: lint/all
lint/all: lint/clojure lint/markdown

.PHONY: lint/clojure
lint/clojure:
	$(info Linting Clojure...)
	@ lein clj-kondo
	@ lein bouncer check
	@ lein sealog check

.PHONY: lint/markdown
lint/markdown:
	$(info Linting Markdown...)
	@ npm run markdownlint
