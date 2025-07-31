package de.tum.in.ase.eist.collision;

import de.tum.in.ase.eist.Dimension2D;
import de.tum.in.ase.eist.Point2D;
import de.tum.in.ase.eist.car.Car;

public class NewCollision extends  Collision {
    public NewCollision(Car car1, Car car2) {
        super(car1, car2);
    }

    @Override
    public boolean detectCollision() {
        //do we have to apply new type of collisions here too?
        Point2D p1 = getCar1().getPosition();
        Dimension2D d1 = getCar1().getSize();

        Point2D p2 = getCar2().getPosition();
        Dimension2D d2 = getCar2().getSize();

        boolean above = p1.getY() + d1.getHeight() < p2.getY();
        boolean below = p1.getY() > p2.getY() + d2.getHeight();
        boolean right = p1.getX() + d1.getWidth() < p2.getX();
        boolean left = p1.getX() > p2.getX() + d2.getWidth();

        // boolean

        return !above && !below && !right && !left;
    }


    @Override
    public Car evaluate() {
        Point2D p1 = getCar1().getPosition();
        Point2D p2 = getCar2().getPosition();

        Car winnerCar = null;

        //how to use this same condition for two times..

            if (((p1.getX() > p2.getX()) &&
                    (p1.getY() > p2.getY())) ||
                    ((p1.getX() < p2.getX()) &&
                            (p1.getY() < p2.getY()))) {


                 winnerCar = this.getCar1();
            } else {
                winnerCar = this.getCar2();
            }

                return winnerCar;
            }




    }

