package com.jamindy;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args )
    {
        ModelFactory modelFactory;
        ShapModel shapModel;

        modelFactory = new CarModelFactory();
        shapModel = modelFactory.factoryMethod();
        shapModel.play();

        modelFactory = new DogModelFactory();
        shapModel = modelFactory.factoryMethod();
        shapModel.play();

        modelFactory = new RoboteModelFactory();
        shapModel = modelFactory.factoryMethod();
        shapModel.play();
    }
}
