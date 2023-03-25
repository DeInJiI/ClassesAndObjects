package com.methodsandobjects;

public class Transport {

    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public void setValues(float speed1, int weight1, String color1, byte[] coordinate1){
        speed = speed1;
        weight = weight1;
        color = color1;
        coordinate = coordinate1;
    }
    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: "  + color;
        String infoCoordinates = ". Coordinates:\n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";
        return info + infoCoordinates;
    }
}
