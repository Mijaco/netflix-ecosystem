**Spring Boot 1.5.10**

Run all applications:
- discovery-service-eureka (first in order!) (8761 port)
- auth-server (9090 port)
- resource-server (can run several instances for different ports, will be load balancing)
- gateway-ui-container (7070 port) 

Go to http://localhost:7070/resource/swagger-ui.html and test it.

Mocked username and password described inside com.lungesoft.architecture.oauth.server.service.UserServiceMock:
 - admin admin
 - user user

_Code contains some tips for auth customization, marked with CAN-TODO comment_ 


**Gateway-ui-container**

- Available for user.
- here you put static js/css/html content
- send ajax request to proxied /resource/** url

For example:

1. Your rest api has resource on resource-server: http://localhost:8080/rest/project/
2. To retrieve it from resource server do ajax request to /resource/rest/project/ (http://localhost:7070/resource/rest/project/) without thinking about Authentication Bearer token or CORS.


**NOTES: MIJAIL**

Trying multi Auth API (deployed resource-1 and resource-2 of **resource-server** project)

**1.-** Go to 
http://localhost:7070/rest-project/rest/me  -> this will redirect to login 

**2.-** Login with admin/admin or user/user
**3.-** Data is showed
**4.-** Try to show data also with http://localhost:7070/rest-book/rest/me because between share the SSO


