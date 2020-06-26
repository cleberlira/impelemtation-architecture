/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.MessageConsumer;

/**
 *
 * @author cleberlira
 */
public class BusService extends AbstractVerticle {
    
     EventBus eventBus = vertx.eventBus();
     
     @Override
    public void start() {

        publish();
    }
    
    public void publish(){
        
       MessageService messageservice = new MessageService();
    
       eventBus.publish(messageservice.getAddress(), messageservice.getMessage());
    }
    
    public void consumer(){
        
      MessageService messageservice = new MessageService();
    
        
      MessageConsumer<String> consumer = eventBus.consumer(messageservice.getAddress());

            vertx.setPeriodic(5000, id1 -> {
                consumer.handler(message -> {
                    System.out.println("Recebendo mensagens: " + message.body());
                });
            });
    }
    
    
    
    
    
}
