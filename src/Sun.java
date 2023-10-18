
public class Sun {
    SolarSystem screen;
    double distance, angle, diameter;
    String col;
    public Sun(SolarSystem screen, double distance, double angle, double diameter, String col){
        this.screen = screen;
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
        screen.drawSolarObject(distance, angle, diameter, col);
    }

    public void setLocation(){
        screen.drawSolarObject(distance, angle, diameter, col);
    }
}
