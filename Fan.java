/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csutortok;

import java.util.Objects;

/**
 *
 * @author ancsangabor
 */
public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = Fan.SLOW;
        this.color = "blue";
        this.on = false;
        this.radius = 5;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" + "speed=" + speed + ", radius=" + radius + ", color=" + color + '}';
        } else {
            return "fan is off" + ", radius=" + radius + ", color=" + color;
        }

    }


    @Override
    public boolean equals(Object obj) {     
        if (obj == null || !(obj instanceof Fan)) 
            return false;
        Fan f = (Fan) obj;
        
        return this.radius== f.getRadius() && this.color.equals(f.getColor());        
        
    }
}
