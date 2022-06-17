FROM openjdk:8-jre
LABEL maintainer="Data Standards Body <technical@consumerdatastandards.gov.au>"

EXPOSE 8383/tcp

COPY payloads /payloads
COPY keystore /keystore
COPY target/data-holder-1.16.2-SNAPSHOT.jar /opt/cds-java-artefacts/data-holder.jar

CMD ["/usr/local/openjdk-8/bin/java", "-jar", "/opt/cds-java-artefacts/data-holder.jar"]
