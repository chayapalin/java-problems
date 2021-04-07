// You are given a class Clock. It has two int fields: hours and minutes. The clock has a minute scale from 0 to 59 and an hour scale from 1 to 12. The clock does not know whether it's day or night (no AM or PM).
//
// Implement the method next that increases the value of minutes by 1. The minutes must be reset to zero when the current hour ends. Do not forget to change the hours as well.
//
// Do not make the fields and methods private.
//
// Let's consider the examples.
//
// 1) The initial time of a clockobject is 12:00, i.e. hours = 12 and minutes = 0. Applying method next to the clock changes its field minutes to minutes = 1. In this way, time is 12:01.
// Clock clock = new Clock(); // time is 12:00
// clock.next(); // time is 12:01
//
// 2) The initial time of a clock object is 10:59, i.e. hours = 10 and minutes = 59. After applying method next to the clock its fields look like hours = 11 and minutes = 0, i.e. time is 11:00 now.
// Clock clock = new Clock();
// clock.hours = 10;
// clock.minutes = 59;
// // time is 10:59
// clock.next(); // time is 11:00

class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {

        if (this.minutes == 59 && this.hours == 12) { // what happens after 12:59
            this.minutes = 0;
            this.hours = 1;
        } else if (this.minutes == 59) { // what happens after the 59th min
            this.minutes = 0;
            this.hours += 1;
        } else if (0 <= this.minutes && this.minutes < 59 && 1 <= this.hours && this.hours <= 12) { // else what happens
            this.minutes += 1;
        }
    }
}
