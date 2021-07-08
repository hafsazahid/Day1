package p1;

public class Camera {
	int power;
    public Camera(int pw)
    {
    	power=pw;
    }
    public void getpower()
    {
    	power-=20;
    	System.out.println("Camera power consumption"+ power);
    }

}
