

public class Moon {
    SolarSystem screen;
    double distance, angle, diameter;
    String col;
    int speed;
    public Moon(SolarSystem screen, double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle, int speed){
        this.screen = screen;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        
        this.speed = speed;
        screen.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);

    }
    
    public void setLocation(double centreOfRotationDistance, double centreOfRotationAngle ){
        screen.drawSolarObjectAbout(distance, angle, diameter, col, centreOfRotationDistance, centreOfRotationAngle);
        angle += speed;
    }
}
