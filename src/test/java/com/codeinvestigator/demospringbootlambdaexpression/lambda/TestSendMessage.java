package com.codeinvestigator.demospringbootlambdaexpression.lambda;

import org.junit.Test;

public class TestSendMessage {

    @Test
    public void testSendMessage(){
        AlienMessageTransmitter alienMessageTransmitter = (String alien, String message) -> {
            System.out.println(message + " - " + alien);
        };

        AlienMessageTransmitter humanMessageTransmitter = new AlienMessageTransmitter() {
            @Override
            public void sendMessage(String alien, String message) {
                System.out.println("Hello " + alien + ", yes you live here. Heres your message: " + message);
            }
        };

        AlienMessageTransmitter welcomeTransmitter = this::welcomeAliens;
        welcomeTransmitter.sendMessage("big and slimy", "Wipe up after your self");

        humanMessageTransmitter.sendMessage("Hugo", "Hi remember to buy milk");
        alienMessageTransmitter.sendMessage("small fluffy alien", "You look cute please visit us!!!");
    }

    private void welcomeAliens(String alien, String message){
        System.out.println("Welcome! " + alien + " heres your special message" + message);
    }
}
