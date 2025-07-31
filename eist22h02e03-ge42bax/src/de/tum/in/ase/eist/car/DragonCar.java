package de.tum.in.ase.eist.car;

import de.tum.in.ase.eist.Dimension2D;

public class DragonCar extends Car {
    private static final String DRAGON_CAR_IMAGE_FILE = "DragonCar.jpeg";

    private static final int MIN_SPEED_FAST_CAR = 4;
    private static final int MAX_SPEED_FAST_CAR = 20;


    public DragonCar(Dimension2D gameBoardSize) {
        super(gameBoardSize);
        setMinSpeed(MIN_SPEED_FAST_CAR);
        setMaxSpeed(MAX_SPEED_FAST_CAR);
        setRandomSpeed();
        setIconLocation(DRAGON_CAR_IMAGE_FILE);
    }

    @Override
    public void setSize(Dimension2D size) {
        Dimension2D size1= new Dimension2D(DEFAULT_CAR_WIDTH*(1.5),DEFAULT_CAR_HEIGHT*(1.5));
        super.setSize(size1);
    }

    @Override
    public void incrementSpeed() {
        int newSpeed=getSpeed()+1;
        setSpeed(newSpeed);
        super.incrementSpeed();
    }
}


