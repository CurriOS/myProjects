public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object created c:");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ". \n";
        String infoCoordinates = "Coordinates:\n";

        for(int i = 0; i < this.coordinate.length; i++)
            infoCoordinates += this.coordinate[i] + "\n";

        return info + infoCoordinates;
    }
}
