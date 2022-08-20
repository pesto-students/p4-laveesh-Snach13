class Person {
  constructor() {}
  initialize(name) {
    this.name = name;
  }
}

class Teacher extends Person {
  teach(subject) {
    return `${this.name} is now teaching ${subject}`;
  }
}

let him = new Teacher();
him.initialize("Nachiket");
console.log(him.teach("coding"));
