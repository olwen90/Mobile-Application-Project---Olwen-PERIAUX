# Mobile-Application-Project---Olwen-PERIAUX

This login page is the one that is launched when starting the application. 

image_2021-03-07_171420

To get access to his bank informations, the app user has to fill the two EditText boxes with his ID and password. 
After 5 failed tries, the login button locks and it quits the application for security. 

image_2021-03-07_171631

Once the user has login, the access to the data is granted and he can make 3 actions, which are represented by 3 buttons. 
The first one is called "SAVE" and is used to download the data in order to be able to read them again even offline with the "LOAD".
The second one is named "REFRESH" and is used to refresh the page. The goal is to redownload the json file. 
If the user is offline, the refresh button will display no data at all. The last one named "LOAD" and is used to read data from the internal storage of the smartphone. This button always work except if the user never saved his bank data. 

image_2021-03-07_173242

The API key is hidden in gradle.properties and we access the key via the buildconfig function as showed below

image_2021-03-07_181058

image_2021-03-07_181126

image_2021-03-07_181208

Finally the file containing the data is protected by the phone's system.
Moreover at the creation of the file a "private mode" is specified. Therefore the access to this file cannot be done by mainstream ways

image_2021-03-07_182005
