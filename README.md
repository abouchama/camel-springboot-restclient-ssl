# Camel Spring-boot Rest+SSL application 

This example shows how to deploy a Rest SSL to Spring Boot StandAlone & OpenShift.

## Requirements

Openshift cluster up and running.

## Setup

### Building

The example can be built with

    mvn clean install

### Running the example in Spring Boot
In resources/spring/camel-context.xml, ensure to uncomment "sslContextParameters" section under 

<!-- Spring Boot StandAlone -->

And comment the "sslContextParameters" section under     

<!-- OpenShift -->

Run the application:

    mvn spring-boot:run

### Running the example in OpenShift

It is assumed that:
- OpenShift platform is already running, if not you can find details how to [Install OpenShift at your site](https://docs.openshift.com/container-platform/3.3/install_config/index.html).
- Your system is configured for Fabric8 Maven Workflow, if not you can find a [Get Started Guide](https://access.redhat.com/documentation/en/red-hat-jboss-middleware-for-openshift/3/single/red-hat-jboss-fuse-integration-services-20-for-openshift/)

The rest port https --> "5117" is defined in fabric8/deployment.yml in order to be exposed.

In order to expose the same port by the service, the following file fabric8/service.yml reference that port.

The certificate keys in the deployment/keys directory are copied to the container in the /deployments/keys path.

In resources/spring/camel-context.xml, ensure to uncomment "sslContextParameters" section under 

<!-- OpenShift -->

And comment the "sslContextParameters" section under     

<!-- Spring Boot StandAlone -->

The example can be built and run on OpenShift using a single goal:

    mvn fabric8:deploy

