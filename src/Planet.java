

public class Planet {
SolarSystem screen;
double distance, angle, diameter, speed;
String col;

    public Planet(SolarSystem screen, double distance, double angle, double diameter, String col, double speed){
        this.screen = screen;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        this.speed = speed;

        screen.drawSolarObject(distance, angle, diameter, col);
    }

    public void setLocation(){
        screen.drawSolarObject(distance, angle, diameter, col);
        angle += speed;
    }
    public double getDistance(){
        return distance;
    }

    public double getAngle(){
        return angle;
    }

}
