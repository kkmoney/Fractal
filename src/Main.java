import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        size(640, 360);
    }

    public void setUp() {
    }

    public void draw() {
        background(255, 191, 230);
        drawCircle(width / 2, height / 2, 200);
        drawsmallercircles(width/2, height/2, 200);
        drawsmall(width/1, height/1, 200);
    }

    public void drawCircle(float x, float y, float radius) {
        stroke(189, 230, 255);
        fill(230, 255, 189);
        ellipse(x, y, radius, radius);
        //recusive - for every circle, smaller circle is drawn
        if (radius > 1) {
            drawCircle(x + radius / 2, y, radius / 2);
            drawCircle(x - radius / 2, y, radius / 2);
            drawCircle(x, y + radius / 2, radius / 2);
            drawCircle(x, y - radius / 2, radius / 2);
        }
    }

    public void drawsmallercircles(float x, float y, float radius){
        stroke(189, 230, 255);
        fill(230, 255, 189);
        ellipse(x, y, radius, radius);
        if (radius > 1) {
            drawCircle(x + radius / 2, y, radius / 2);
            drawCircle(x - radius / 2, y, radius / 2);
        }
    }

    public void drawsmall(float x, float y, float radius){
        stroke(189, 230, 255);
        fill(230, 255, 189);
        ellipse(x, y, radius, radius);
        if (radius > 1) {
            drawCircle(x, y + radius / 2, radius / 2);
            drawCircle(x, y - radius / 2, radius / 2);
        }
    }


        }


