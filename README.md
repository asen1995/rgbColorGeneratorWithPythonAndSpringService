Angular->Python->Spring->Websocket->Angular application chain

1. Angular front-end part

From the front end - front-end/rgb-color-viewer-application folder 

used version of Node 10, Angular version 8 and Sockjs for the websocket support threw STOMP protocol.

1.Locate into main folder and run 

npm install 

2. run server : 

ng serve


Python rest service is already configured in environment.ts


======================================


2. Python rest service 

From the rgbCssPythonGeneratorApplication folder 

Python version 3.9

1. install python modules - it uses Flask framework 

2. run the main python script - CssGeneratorApp.py



standalone testing with curl  :

curl http://127.0.0.1:5000/cssRgbGenerator -d '{"red": 100 , "green": 150 , "blue" : 200 , "text" : "someText" }' -H 'Content-Type: application/json'

======================================

3. Spring rest service 

Java 8 and Maven


1. mvn clean install
2. Run as java application from main class - HtmlGeneratorApp. 

application.properties are already configured
websocket is configured to call the front-end as well.

standalone testing with curl  :
curl http://localhost:8080/generateHtmlRgbDisplayCode -d '{"rgbValue": "rgb(255, 165, 0)" , "text" : "someText" }' -H 'Content-Type: application/json'

