#mars

A Rest SpringBoot application to explore Mars.

To build the robot, set up the command:
<code>mvn clean install</code>

To run the application, you can run like a SpringBoot application or using the command below:
<code>
java -jar target/mars-1.0.jar
</code>

The available commands to explore Mars are:
-L (Rotate to Left)
-R (Rotate to Right)
-M (Move)

To test the mars Robot, you can make a POST request in the URL below with the commands.

Request Example: 
<code>
curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM
</code>

Expected response:
<code>
(2, 0, S)
</code>

The app also available on Heroku. You can test using:
<code>
curl -s --request POST https://marsexplore.herokuapp.com/rest/mars/MMRMMRMM
</code>

Let's explore!