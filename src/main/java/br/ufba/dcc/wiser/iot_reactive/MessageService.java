package br.ufba.dcc.wiser.iot_reactive;

import io.vertx.core.AbstractVerticle;

public class MessageService extends AbstractVerticle {

    
    private String address;
    private String message;
    
    @Override
    public void start() {

    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
