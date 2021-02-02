package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return defaultPrice();
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return (defaultPrice() / 2);
        }
        return defaultPrice();
    }
}
