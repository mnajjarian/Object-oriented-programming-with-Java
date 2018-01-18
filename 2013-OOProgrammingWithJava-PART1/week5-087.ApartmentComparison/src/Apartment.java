
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = pricePerSquareMeter * squareMeters;
    }
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
        return true;
    }
    return false;
}
    public int priceDifference(Apartment otherApartment) {
        return Math.abs(this.price - otherApartment.price);
    }
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.price > otherApartment.price) {
            return true;
        }
        return false;
    }
}
