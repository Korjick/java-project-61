ifeq ($(OS),Windows_NT)
    PATHSEP := \\
else
    PATHSEP := /
endif

install-dist:
	@gradlew instalDist

run-dist:
	@build$(PATHSEP)install$(PATHSEP)app$(PATHSEP)bin$(PATHSEP)app

clean:
	@gradlew clean

checkstyle:
	@gradlew checkstyleMain