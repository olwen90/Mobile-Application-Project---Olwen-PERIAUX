# Mobile-Application-Project---Olwen-PERIAUX

This login page is the one that is launched when starting the application. 

![image](https://user-images.githubusercontent.com/64968589/110250186-4d9ffb80-7f7a-11eb-9eda-0035121b0a00.png)


To get access to his bank informations, the app user has to fill the two EditText boxes with his ID and password. 
After 5 failed tries, the login button locks and it quits the application for security. 

![image](https://user-images.githubusercontent.com/64968589/110250187-542e7300-7f7a-11eb-9f05-772e0f401860.png)


Once the user has login, the access to the data is granted and he can make 3 actions, which are represented by 3 buttons. 
The first one is called "SAVE" and is used to download the data in order to be able to read them again even offline with the "LOAD".
The second one is named "REFRESH" and is used to refresh the page. The goal is to redownload the json file. 
If the user is offline, the refresh button will display no data at all. The last one named "LOAD" and is used to read data from the internal storage of the smartphone. This button always work except if the user never saved his bank data. 

![image](https://user-images.githubusercontent.com/64968589/110250198-5e507180-7f7a-11eb-8d4f-cc1144c9e1b7.png)


The API key is hidden in gradle.properties and we access the key via the buildconfig function as showed below

![image](https://user-images.githubusercontent.com/64968589/110250202-67d9d980-7f7a-11eb-8765-166b47f850c9.png)


![image](https://user-images.githubusercontent.com/64968589/110250206-6c05f700-7f7a-11eb-8455-a8016edda413.png)


![image](https://user-images.githubusercontent.com/64968589/110250209-70321480-7f7a-11eb-948e-c7e46fd082df.png)


Finally the file containing the data is protected by the phone's system.
Moreover at the creation of the file a "private mode" is specified. Therefore the access to this file cannot be done by mainstream ways
![image](https://user-images.githubusercontent.com/64968589/110250219-74f6c880-7f7a-11eb-8324-4691dc0ed002.png)

