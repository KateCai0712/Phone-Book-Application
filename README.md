# Phone-Book-Application
The objective of this exercise is to create a phone book application using the object-oriented programming paradigm.
## PhoneBookDirectory
- The PhoneBookDirectory has an array of 6 PhoneBookEntry’ objects
- We can perform the following commands:
 1. Add an entry to the phonebook
  - Adding an entry to the phone to the array in first empty space in the array. The method signature is as follows: 
   **public int addEntry(PhoneBookEntry entry)**
  - Returns 1 if the object entry was successfully added or 0 otherwise (in case the array is full)
 2. Print all phonebook entries
 3. Search for an entry by Phone Number (Linear Search)
   **public int LinearSearchByPhoneNumber(String PhoneNumber)**
  - Returns 1 if found 0 if not found
 4. Search for an entry by id (Using Binary Search)
   **public PhoneBookEntry SearchbyIdBinarySearch(int id)**
  - Returns a PhoneBookEntry if found
  - Returns an empty PhoneBookEntry if NOT found
 5. Sort Phone Book Entries by id
 6. Edit an entry (allows to edit any attributes (data fields) they want of a specific phone book entry of a given last name and firstname)
   **public int Edit(String firstName, String lastName)**
  - Returns 1 if the object was found and edited, returns 0 if the entry of the given userName and lastName do not exist
 7. Delete an Entry of a given id
  - Returns 1 if the Entry is deleted and 0 if not (not found)
  - Deleting an entry from the array means you set all attributes of the entry’s object to be deleted to default values
   **public int DeleteEntry(int id)**
  - Returns a 0 if the item of the id is being found and deleted, returns a 1 otherwise.
## PhoneBookAdmin and NormalUser
 - Assume that there will be two types of users of the PhoneBookDirectory:
  1. PhoneBookAdmin
   Has a username, password, emailAddress (string) and a PhoneBookDirectory
  2. NormalUser
   Has an id(int), username, password and PhoneBookDirectory
   - **Both PhoneBookAdmin and NormalUser inherit from a class User that needs to be created. The class User has common attributes from both PhoneBookAdmin and NormalUser.**
   - The class User will have a method PrintUserInfo that prints the user name and password of a user object.
   - **The method PrintUserInfo will be overridden in both PhonBookAdmin and NormalUser
that will allow their objects to print ALL attributes.**
 - A PhoneBookAdmin is able to perform the following commands:
  1. Add a phone entry
  2. Edit a phone entry of a given first name and last name
  3. Delete a phone entry of a given first name and last name
  4. Sort the PhoneBookDirectory
  5. Search using Linear Search
  6. Search using Binary Search
  7. Print Admin’s info
  8. Change Password
  9. Change Username
 - A NormalUser is able to perform the following commands:
  1. Add a phone entry
  2. Edit a phone entry of a given first name and last name
  3. Sort the PhoneBookDirectory
  4. Search using Linear Search
  5. Print user’s info
## PhoneBookApplication class (the one that will have the main method)
 - Initially, create an object of type PhoneBookAdmin and another one of type NormalUser
 - PhoneBookAdmin’s object will have a username, password and email address. They should read from a file. Username, password and email address are separated by comma.
 - NormalUser’s object initially has an id, username, password. They will be read from a file (separated by comma).
 - Then, ask the user to login and you will need to check if the user is an admin or a normal user, and display the menu accordingly.
