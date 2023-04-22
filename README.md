# Phone-Book-Application
The objective of this exercise is to create a phone book application using the object-oriented programming paradigm.
## PhoneBookDirectory
-The PhoneBookDirectory has an array of 6 PhoneBookEntry’ objects
-We can perform the following commands:
 1. Add an entry to the phonebook
Adding an entry to the phone to the array in first empty space in the array. The method signature is as follows: (You must use this signature)
public int addEntry(PhoneBookEntry entry)
the method returns 1 if the object entry was successfully added or 0 otherwise (in
case the array is full)
 Print all phonebook entries
 Search for an entry by Phone Number (Linear Search)
public int LinearSearchByPhoneNumber(String PhoneNumber)
return 1 if found 0 if not found
 Search for an entry by id (Using Binary Search)
public PhoneBookEntry SearchbyIdBinarySearch(int id)
returns a PhoneBookEntry if found
return an empty PhoneBookEntry if NOT found
 Sort Phone Book Entries by id(you can use selection sort for sorting – Do not use the built in .sort function defined in Java)
 Edit an entry (allows to edit any attributes (data fields) they want of a specific phone book entry of a given last name and firstname)
public int Edit(String firstName, String lastName)
 Delete an Entry of a given id, the method should return 1 if the Entry is deleted and 0 if not (not found). Deleting an entry from the array means you set all
return a 1 if the object was found and edited, returns 0 if the entry of the given
 userName and lastName do not exist.
 
attributes of the entry’s object to be deleted to default values (feel free to define your own default values – add comments about your default values)
public int DeleteEntry(int id)
return a 0 if the item of the id is being found and deleted, return a 1 otherwise.
PhoneBookAdmin and NormalUser
 Assume that there will be two types of users of the PhoneBookDirectory  PhoneBookAdmin
has a username, password, emailAddress (string) and a PhoneBookDirectory
 NormalUser
has an id(int), username, password and PhoneBookDirectory
The class User will have a method PrintUserInfo that prints the user name and password of a user object.
A PhoneBookAdmin should be able to do the following:
 Add a phone entry
 Edit a phone entry of a given first name and last name
 Delete a phone entry of a given first name and last name  Sort the PhoneBookDirectory
 Search using Linear Search
 Search using Binary Search
 Print Admin’s info
 Change Password
 Change Username
A NormalUser should be able to do the following:
 Add a phone entry
 Edit a phone entry of a given first name and last name  Sort the PhoneBookDirectory
 Search using Linear Search
 Print user’s info
 Both PhoneBookAdmin and NormalUser should inherit from a class User that you need to create.
 The class User should have common attributes from both PhoneBookAdmin and NormalUser.
 The method PrintUserInfo should be overridden in both PhonBookAdmin and NormalUser
 that will allow their objects to print ALL attributes.
 
 Define an interface for the NormalUser that will have the methods to be implemented by
 NormalUser.
  Define an interface for PhoneBookAdmin that will have the methods to be implemented by
 PhoneBookAdmin
  Hint: make sure the methods be used in NormalUser and PhoneBookAdmin PhoneBookApplication class (the one that will have the main method)
 Initially, You should create an object of type PhoneBookAdmin and another one of type NormalUser.
 PhoneBookAdmin’s object should have a username, password and email address. They should read from a file. Username, password and email address are separated by comma.
 NormalUser’s object initially has an id, username, password. They should be read from a file (separated by comma).
 Then you ask the user to login and you will need to check if the user is an admin or a normal user, then you display the menu accordingly.
Make sure all your functionalities are working before you submit and comment your code.
