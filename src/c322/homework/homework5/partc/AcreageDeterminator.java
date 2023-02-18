package c322.homework.homework5.partc;

public class AcreageDeterminator {

    Lot lot;

    public double determineAcreage(Lot tLot) {
        lot = tLot;
        return lot.length * lot.width;

    }
}
