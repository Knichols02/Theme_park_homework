package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    double price = 8.4;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 12 && visitor.getHeight() > 1.45){
            return true;
        }
        return false;
    }

    @Override
    public double defaultPrice() {
        return price;
    }


    @Override
    public double priceForVisitor(Visitor visitor) {
        if(visitor.getHeight() > 2.00){
            return (defaultPrice() * 2);
        }
        return defaultPrice();
    }
}
