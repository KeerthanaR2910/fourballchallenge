import processing.core.PApplet;

public class FourBallChallenge extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private int x=0;
    int height = HEIGHT / 5;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawCircle();

    }

    private void drawCircle() {
        for(int i=1;i<=4;i++) {
            ellipse(x*i, height*i, 10, 10);
        }
        x++;
    }

}
