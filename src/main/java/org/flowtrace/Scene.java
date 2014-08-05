package org.flowtrace;

/**
 * Represents the scene that is being raytraced.
 */
public interface Scene {

    /**
     * @return intersection with the object the ray first hits in the scene.
     */
    Intersection calculateIntersection(Ray ray);

}
