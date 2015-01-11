
# Running

either deploy to container of your liking, or


## embedded Glassfish server

```mvn embedded-glassfish:run```

then point your browser to (http://localhost:8282/stackexample/apidocs) or just 

```curl -H "Content-Type: application/json" -X POST -d "{ \"username\": \"test\", \"password\": \"test\"}" http://localhost:8282/stackexample/api/session```


## Local Glassfish server

```mvn glassfish:deploy```

make sure to define the necessarry properties in your ```~/.m2/settings.cml```, e.g.:

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
