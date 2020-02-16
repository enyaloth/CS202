package Week5;

public class Angle implements Comparable<Angle> {
    private int degree;
    private int minutes;

    //create constructor
    public Angle(int degree, int minutes) {
        this.degree = degree;
        this.minutes = minutes;
    }
    //getters

    public int getDegree() {
        return degree;
    }

    public int getMinutes() {
        return minutes;
    }

    //method
    public String toString() {
        return "Degree: " + getDegree() + ", Minutes: " + getMinutes();
    }
    //abstract method that I need to define.
    public int compareTo(Angle other) {
        if (degree-other.degree!=0) {
            return this.degree-other.degree;
        }
        else return this.minutes-other.minutes;
    }
}
