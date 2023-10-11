package com.example.restservice.controllers;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Response;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1.0/greeting")
public interface IGreetingController {

    /**
     * POST
     * /api/v1.0/greeting
     * @param id
     * @param content
     * @return
     * @throws Exception
     */
    @PostMapping("")
    @ApiOperation(value = "Création d'un post")
    public Greeting createGreeting(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "content") String content)
            throws Exception;

    /**
     * getALL
     * /api/v1.0/greeting/
     * @return
     */
    @GetMapping(path = {"", "/"})
    public List<Greeting> getAllGreetings();

    /**
     * GET
     * /api/v1.0/greeting/id
     * @param id
     * @return
     * @throws Exception
     */
    @GetMapping("/{id}")
    public Greeting getGreeting(
            @PathVariable(value = "id") Long id)
            throws Exception;

    /**
     * Update
     * /api/v1.0/greeting/id
     * @param id
     * @param content
     * @return
     * @throws Exception
     */
    @PutMapping("/{id}")
    public Greeting updateGreeting(
            @PathVariable(value = "id") Long id,
            @RequestParam(value = "content")
            String content)
            throws Exception;

    /**
     * delete
     * /api/v1.0/greeting/1
     * @param id
     * @return
     * @throws Exception
     */
    @DeleteMapping("/{id}")
    public Response deleteGreeting(
            @PathVariable(value = "id") Long id)
            throws Exception;
}
