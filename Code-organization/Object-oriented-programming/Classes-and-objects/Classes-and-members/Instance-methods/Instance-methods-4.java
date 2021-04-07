// There is a class named Circle. This class has one field radiusof the double type.
//
// Create two instance methods for this class:
// getLength that returns the double representing the length of the circumference of this circle;
// getArea that returns the double representing the area of this circle.
//
// In your calculations, you may use the special constant Math.PI.

class Circle {

    double radius;

    // write methods here
    public double getLength() {
        // double length = 2 * Math.PI * radius; or double length = 2 * Math.PI * this.radius;
        // return length; or return 2 * Math.PI * radius;
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        // double area = Math.PI * Math.pow(radius, 2);
        // return area;
        return Math.PI * Math.pow(this.radius, 2);
    }
}
