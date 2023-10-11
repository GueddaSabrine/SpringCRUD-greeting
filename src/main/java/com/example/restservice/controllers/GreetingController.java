package com.example.restservice.controllers;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Response;
import com.example.restservice.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController implements IGreetingController{

    @Autowired
    private GreetingService service;

    /**
     * Creat
     * @param id
     * @param content
     * @return
     * @throws Exception
     */
    @Override
    public Greeting createGreeting( Long id,  String content) throws Exception{
        return service.createGreeting(id, content);
    }

    /**
     * getALL
     * @return
     */
    @Override
    public List<Greeting> getAllGreetings(){
        return service.getAllGreetings();
    }

    /**
     * GetID
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Greeting getGreeting( Long id) throws Exception{
        return service.getGreeting(id);
    }

    /**
     * UpdateID
     * @param id
     * @param content
     * @return
     * @throws Exception
     */
    @Override
    public Greeting updateGreeting( Long id, String content) throws Exception{
        return service.updateGreeting(id, content);
    }

    /**
     * deleteID
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public Response deleteGreeting( Long id) throws Exception {
        return service.deleteGreeting(id);
    }
}
