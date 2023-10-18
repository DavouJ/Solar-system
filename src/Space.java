
public class Space {
    
    private SolarSystem screen = new SolarSystem(1000, 800);
    
    public Space(){
        Sun sun1 = new Sun(screen, 0, 0, 100, "yellow");
        Planet earth = new Planet(screen, 100, 60, 15, "blue", 1);
       while(true){
            earth.setLocation();
            screen.finishedDrawing();
        }
    }
}

