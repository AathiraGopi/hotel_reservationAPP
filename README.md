HotelReservation - A Java project for hotel reservation management.
This is a java application for booking hotel rooms which I developed for the Udacity's Java Programming Course. The goal was to create a hotel application which allows users to book and manage room reservations. The project emphasizes the use of Java programming language for practicing and elevating fundamental skills as a Java developer.
You may run the project by executing the HotelApplication class on your favorite Java IDE.

hotel_reservation:

User Scenarios:-
The application provides four user scenarios:
Creating a customer account: The user needs to first create a customer account before they can create a reservation.
Searching for rooms: The app should allow the user to search for available rooms based on provided checkin and checkout dates. If the application has available rooms for the specified date range, a list of the corresponding rooms will be displayed to the user for choosing.
Booking a room: Once the user has chosen a room, the app will allow them to book the room and create a reservation.
Viewing reservations: After booking a room, the app allows customers to view a list of all their reservations.

Admin Scenarios:-
The application provides four administrative scenarios:
Displaying all customers accounts.
Viewing all of the rooms in the hotel.
Viewing all of the hotel reservations.
Adding a room to the hotel application.


Reserving a Room:-
The application allows customers to reserve a room. 
Here are the specifics:
Avoid conflicting reservations: A single room may only be reserved by a single customer per a checkin and checkout date range.
Search for recommended rooms: If there are no available rooms for the customer's date range, a search will be performed that displays recommended rooms on alternative dates. The recommended room search will add seven days to the original checkin and checkout dates to see if the hotel has any availabilities, and then display the recommended rooms/dates to the customer.
Example: If the customers date range search is 1/1/2023 – 1/5/2023 and all rooms are booked, the system will search again for recommended rooms using the date range 1/8/2023 - 1/12/2023. If there are no recommended rooms, the system will not return any rooms.

Room Requirements:-
Room cost: Rooms will contain a price per night. When displaying rooms, paid rooms will display the price per night and free rooms will display "Free" or have a $0 price. Unique room numbers: Each room will have a unique room number, meaning that no two rooms can have the same room number. Room type: Rooms can be either single occupant or double occupant (Enumeration: SINGLE, DOUBLE).

Customer Requirements:-
The application will have customer accounts. Each account has:
A unique email for the customer: RegEx is used to check that the email is in the correct format (i.e., name@domain.com).
A first name and last name.
The email RegEx is simple for the purpose of this exercise and may not cover all real-world valid emails.
For example "name@domain.co.uk" would not be accepted by the above RegEx because it does end with ".com". If you would like to try to make your RegEx more sophisticated, you may—but it is not required for this project.
