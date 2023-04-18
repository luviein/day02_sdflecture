package sg.edu.nus.iss;

public interface Startable {
    public void applyBreak(int decreaseValue); //interface is safer, encapsulation to be safe from hackers
    public void speedUp(int increaseValue);
}
