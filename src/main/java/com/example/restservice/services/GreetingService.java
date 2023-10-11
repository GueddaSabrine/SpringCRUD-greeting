package com.example.restservice.services;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Response;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GreetingService {

    private static List<Greeting> data = new ArrayList<Greeting>();

    /**
     *
     * @return
     */
    public List<Greeting> getAllGreetings(){
        return data;
    }

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public Greeting getGreeting(Long id) throws Exception{
        for(Greeting g : data) {
            if (g.getId() == id)
                return g;
        }
        throw new Exception("Invalid Greeting id");
    }

    /**
     *
     * @param id
     * @param content
     * @return
     * @throws Exception
     */
    public Greeting createGreeting(Long id, String content) throws Exception{
        for(Greeting g : data) {
            if (g.getId() == id)
                throw new Exception("Invalid Greeting id, already exists");
        }
        Greeting greeting = new Greeting(id, content);
        data.add(greeting);
        return greeting;
    }

    public Greeting updateGreeting(Long id, String content) throws Exception{
        for(Greeting g : data) {
            if (g.getId() == id) {
                g.setContent(content);
                return g;
            }
        }
        throw new Exception("Invalid Greeting id");
    }

    public Response deleteGreeting(Long id) throws Exception {
        for(Greeting g : data) {
            if (g.getId() == id) {
                data.remove(g);
                return new Response(String.format("Greeting %d deleted", id));
            }
        }
        throw new Exception("Invalid Greeting id");
    }
}
