// You want to create a program that models the behavior of cars. For this purpose, you've created a class named Car containing three fields: the int field yearModel, the string field make, and the int field speed.
//
// You want to add functionality to your cars, so you need methods. Add the following instance methods to your class:
// void accelerate() that adds 5 to the speed each time it's called;
// void brake() that subtracts 5 from the speed field each time it's called, the speed cannot be less than zero.

class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed += 5; // adds 5 to the speed each time it's called
    }

    public void brake() {
        if (this.speed > 4) {
            this.speed -= 5; // subtracts 5 from the speed field each time it's called
        } else if (this.speed < 5) {
            this.speed = 0; // the speed cannot be less than zero
        }

        /*
        OR
        this.speed -= 5;
        if (this.speed < 0) {
            this.speed = 0;
        }
        */
    }
}
