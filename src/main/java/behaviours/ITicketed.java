package behaviours;

import people.Visitor;

public interface ITicketed {
    abstract double defaultPrice();
    abstract double priceFor(Visitor visitor);
}
