#Introduction
This repository contain BDD tests for CityBike api

##
How to run the test

1. Open the command prompt and cd until the project root directory.
2. run the command <mvn test>


###
What scenarios was not able to do

1. I was not able to find the city Frankfurt and Germany country in the API response. So instead of testing that scenario I have tested for two other countries which was available in the Api response.


####
What coud do better

This is just a basic framework I created for testing this api. But this framework can improve a lot as below

1. Instead of reading JsonPath response output use Pojo classes to read output. I have started creating pojo clases but hit with some error desrializing the response. So didnt get enough time to fix the error. So I went with Json resposepath output.
2. Implement logging functionality
3. Include extent report to have nice reports

