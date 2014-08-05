package org.flowtrace;

/**
 * Intersection point between a ray and a shape.
 */
public final class Intersection {

    /**
     * Intersected shape.
     */
    public Shape shape;

    /**
     * Ray that intersected the shape.
     */
    public Ray ray;

    /**
     * The intersection point between the ray and the shape.
     */
    public final Vec3 point = new Vec3();

    /**
     * The normal vector of the shape at the intersection point between the ray and the shape.
     */
    public final Vec3 normal = new Vec3();


    public void setIntersection(Shape shape, Vec3 point, Vec3 normal) {
        this.shape = shape;
        this.point.set(point);
        this.normal.set(normal);
        this.normal.normalize();
    }

}
