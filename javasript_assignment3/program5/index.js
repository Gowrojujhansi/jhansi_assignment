const person = {
    firstName : "Gowroju",
    lastName : "A T",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + this.middleName + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
person.middleName = "Jhansi";
document.write(person.middleName + "  ");
document.write(person.lastName);
console.log(person.greeting());