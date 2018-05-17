# apache-camel-cxfrs

build the application and then deploy it in JBoss Fuse

JBossFuse:karaf@root> install mvn:com.myprojects.examples/apache-camel-cxfrs/1.0-SNAPSHOT
Bundle ID: 294
JBossFuse:karaf@root> START 294

Now that the bundle has started,
Go to http://localhost:8181/cxf to check REST service is successfully deployed.

Can also get WADL URL.

http://localhost:9000/employeeservice/employees/emp1
