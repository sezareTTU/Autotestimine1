package reptositories.coordinatesAndCity;


public class Coordinates {


    private double coordinateX;
    private double coordinateY;

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }


    public void setCoordinates(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;

    }

    @Override
    public String toString(){
            return this.coordinateX + ":" + this.coordinateY;

    }



}
