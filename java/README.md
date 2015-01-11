
# Running

either deploy to container of your liking, or

## Local Glassfish server

```xml
  <profiles>
    <profile>
      <id>inject-glassfish-local</id>
      <properties>
        <glassfish.home>/home/nsn/devel/apps/glassfish4</glassfish.home>
        <domain.username>admin</domain.username>
        <domain.password>adminadmin</domain.password>
      </properties>
    </profile>
  </profiles>

  <activeProfiles>
    <activeProfile>inject-glassfish-local</activeProfile>
  </activeProfiles>
```

## embedded Glassfish server

mvn embedded-glassfish:run

http://localhost:8282/stackexample/

