package ru.atom.geometry;

/**
 * Template class for
 */
public class Point implements Collider {
    // fields
    // and methods
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param o - other object to check equality with
     * @return true if two points are equal and not null.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // cast from Object to Point
        Point point = (Point) o;
        return point.x == x && point.y == y;
    }
    @Override
    public boolean isColliding(Collider other) {
        return this.equals(other);
    }
}
