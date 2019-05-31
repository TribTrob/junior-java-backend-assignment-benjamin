Junior Backend Assignment
======

##Requirements
Project Lombok is required for the server to run

#Description
PayloadController class is responsible for handling POST and GET requests while also broadcasting
 to listening clients through Websockets.

Given that the server receives a POST request with a correct JSON he will broadcast it as well as 
save it to the specified DB.

Upon receiving a GET request on the "/list" url
the Payload Controller will call the functions of the PayloadService where we Calculate the longest Palindrome
and set the field in the Payload class.

Calculating the palindrome is based on Dynamic Programing principle where we split the problem into
smaller less complex problems and store our results.
We maintain a boolean table[n][n] that is filled in bottom up manner.
The value of table[i][j] is true, if the substring is palindrome, otherwise false. 
To calculate table[i][j], we first check the value of table[i+1][j-1],
if the value is true and str[i] is same as str[j], then we make table[i][j] true.
Otherwise, the value of table[i][j] is made false.


