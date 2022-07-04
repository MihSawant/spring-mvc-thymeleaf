# spring-mvc-thymeleaf

This a basic Spring-Boot app which has a simple model Avenger which has avenger name and actor name, Here there is no database but a
simple list is used to store the data.
There is FormController which manages the requests <i>GET</i> and <i>POST</i> for the endpoint <i>/avengers</i>, In the getData method
I am basically getting all the data from the list and passing it to the view table, and while postData accept the data and add to the list
and update the view.

This is a typical MVC style app where each request goes to the server and processing is done on the server side and then a response is given
back by the server to the client. Every request has a trip from client to server. This type of applications are also called <em>Traditional MVC</em>
or <em>Classic MVC</em>.

I am using RequestParam annotation to bind the paramater to the form which has the name attribute which has exactly same name. Now after
mentioning this Spring will automatically configure and bind the values properly, so that we don't have to write the code ourselfs.

To run the app use the ./mvnw.cmd spring-boot:run command which will run the app.
