package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145.00 && visitor.getAge() >= 12) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200.00) {
            return (2 * defaultPrice());
        } else {
            return defaultPrice();
        }

    }
}
