package org.flowtrace;

/**
 * Represents a 3D vector.
 */
public final class Vec3 {

    public double x;
    public double y;
    public double z;

    public Vec3() {
        this(0,0,0);
    }

    public Vec3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vec3 set(Vec3 source) {
        x = source.x;
        y = source.y;
        z = source.z;
        return this;
    }

    public Vec3 set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    /**
     * @return the length of this vector
     */
    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * @return the squared length of this vector
     */
    public double lengthSquared() {
        return x*x + y*y + z*z;
    }

    /**
     * Normalizes this vector.
     */
    public Vec3 normalize() {
        double len = length();

        if (len != 0) {
            x /= len;
            y /= len;
            z /= len;
        } else {
            x = 1;
            y = 0;
            z = 0;
        }

        return this;
    }
}
