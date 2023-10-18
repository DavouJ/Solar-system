
public class Space {
    
    private SolarSystem screen = new SolarSystem(1000, 800);
    
    public Space(){
        Sun sun = new Sun(screen, 0, 0, 100, "yellow");
        Planet earth = new Planet(screen, 100, 60, 15, "blue", 1);
        Moon earthsMoon = new Moon(screen, 20, 50, 10, "gray", earth.getDistance(), earth.getAngle(), 3);
       while(true){
            sun.setLocation();
            earth.setLocation();
            earthsMoon.setLocation(earth.getDistance(), earth.getAngle());
            screen.finishedDrawing();
        }
    }
}

