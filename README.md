For Insert : 
URL POST: http://localhost:8080/api/Persona
Body : {
"name":"bharat",
"lastName":"Goswami",
"address":"B Block Karachi",
"phoneNumber":"03346277791",
"hairColor": "Black"
}

For Update:
URL POST: http://localhost:8080/api/Persona
Body : {
"id":1,
"name":"bharat",
"lastName":"Updated",
"address":"B Block Karachi",
"phoneNumber":"03346277791",
"hairColor": "Black"
}

FindById
URL GET	: http://localhost:8080/api/Persona/2

URL Delete: http://localhost:8080/api/Persona/1

FindByPhoneNumber
URL GET : http://localhost:8080/api/Persona/searchByPhoneNumber/03346277791
Find All
URL GET : http://localhost:8080/api/Persona/findAll/

Version 1
"# PersonaInformationSystem" Created

Version - 2  
Basic Application Structure Created, Such as Entity,Controller,Service,Repository etc.

Version -3
Validations Applied Part 1

Version - 4

Searching functionality added.

Version -5

Exception handling functionality added.

Version -6

Delete functionality added

Version 7
Complete , New Annotation Created for validation for (Hair Colors)


