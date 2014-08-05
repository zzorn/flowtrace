package org.flowtrace;

/**
 * Some shape in a scene.
 */
public interface Shape {

    /**
     * @return intersection with this shape and the specified ray, or null if the ray does not intersect this shape.
     */
    Intersection calculateIntersection(Ray ray);


}
