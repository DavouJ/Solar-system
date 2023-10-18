
public class Space {
    
    /* 
    *Class instance of SolarSystem, 
    *creating a blank screen with a specified width and height.
    */
    private SolarSystem screen = new SolarSystem(1000, 800);
    
    public Space(){
        Sun sun = new Sun(screen, 0, 0, 100, "yellow");
        Planet earth = new Planet(screen, 100, 60, 15, "blue", 1);
        Moon earthMoon = new Moon(screen, 20, 50, 10, "gray", earth.getDistance(), earth.getAngle(), 3);
       
        Planet jupiter = new Planet(screen, 200, 40, 35, "green", 0.7);
        Moon jupiterMoon = new Moon(screen, 40, 20, 15, "pink", jupiter.getDistance(), jupiter.getAngle(), 5);
        Moon jupiterMoon2 = new Moon(screen, 70, 90, 15, "gray", jupiter.getDistance(), jupiter.getAngle(), 3);
        Moon jupiterMoon3 = new Moon(screen, 100, 50, 20, "white", jupiter.getDistance(), jupiter.getAngle(), 2);

        Planet uranus = new Planet(screen, 400, 10, 25, "cyan", 0.3);
        Moon uransusMoon = new Moon(screen, 20, 50, 10, "blue", uranus.getDistance(), uranus.getAngle(), 6);
        Moon uransusMoon2 = new Moon(screen, 50, 20, 20, "dark_gray", uranus.getDistance(), uranus.getAngle(), 2);

        while(true){
            sun.setLocation();

            earth.setLocation();
            earthMoon.setLocation(earth.getDistance(), earth.getAngle());

            jupiter.setLocation();
            jupiterMoon.setLocation(jupiter.getDistance(), jupiter.getAngle());
            jupiterMoon2.setLocation(jupiter.getDistance(), jupiter.getAngle());
            jupiterMoon3.setLocation(jupiter.getDistance(), jupiter.getAngle());
            
            uranus.setLocation();
            uransusMoon.setLocation(uranus.getDistance(), uranus.getAngle());
            uransusMoon2.setLocation(uranus.getDistance(), uranus.getAngle());
            

            screen.finishedDrawing();
        }
    }
}

