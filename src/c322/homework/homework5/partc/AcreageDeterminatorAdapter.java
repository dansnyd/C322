package c322.homework.homework5.partc;

public class AcreageDeterminatorAdapter {

    AcreageDeterminator determinator;
    Estate estate;


    public double determineAcreage(Estate tEstate) {


        determinator = new AcreageDeterminator();
        estate = tEstate;
        Lot tLot = new Lot();

        tLot.length = estate.length;
        tLot.width = estate.width;

        return (determinator.determineAcreage(tLot) / 43560);
    }
}
