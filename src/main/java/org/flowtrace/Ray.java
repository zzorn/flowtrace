package org.flowtrace;

/**
 * Represents a ray starting from some point.
 */
public class Ray {

    private final Vec3 start = new Vec3();
    private final Vec3 direction = new Vec3();

    public Ray(Vec3 start, Vec3 direction) {
        set(start, direction);
    }

    public void set(Vec3 start, Vec3 direction) {
        setStart(start);
        setDirection(direction);
    }

    public void setStart(Vec3 start) {
        this.start.set(start);
    }

    public void setDirection(Vec3 direction) {
        this.direction.set(direction);
        this.direction.normalize();
    }

    public Vec3 getStart() {
        return start;
    }

    public Vec3 getDirection() {
        return direction;
    }


}
