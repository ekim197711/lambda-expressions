package com.codeinvestigator.demospringbootlambdaexpression.lambda;

import org.junit.Test;

public class SpaceShipTest {


    @Test
    public void testSpaceShipDestination(){
        DestinationTransmitter dt = (ship) -> ship + " should go to Saturn";

        String disc = dt.spaceShipDestination("Disc");
        System.out.println(disc);


        MessageTransmitter mt = System.out::println;
        mt.sendThis("Hello trallalal test 1 2 3");

        MessageTransmitter mt2 = (String mymessage) -> System.out.println(mymessage);
        mt2.sendThis("This the second message");


    }
}
