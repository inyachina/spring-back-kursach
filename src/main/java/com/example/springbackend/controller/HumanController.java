package com.example.springbackend.controller;

import com.example.springbackend.dao.HumanDao;
import com.example.springbackend.facade.ErrorBody;
import com.example.springbackend.facade.Response;
import com.example.springbackend.model.Human;
import com.example.springbackend.service.impl.HumanServiceImpl;
import com.example.springbackend.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/human")
@CrossOrigin(origins = "http://localhost:4200")
public class HumanController {
    private HumanServiceImpl humanService;
    private UserServiceImpl userService;

    @Autowired
    public HumanController(HumanServiceImpl humanService, UserServiceImpl userService) {
        this.humanService = humanService;
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<Response<Object>> findAll() {
        try {
            List<Human> people = this.humanService.findAll();
            return Response.success(people);
        } catch (Exception e) {
            e.printStackTrace();
            return Response.failure(
                    Response.error(
                            new ErrorBody(e.getMessage(),
                                    HttpStatus.INTERNAL_SERVER_ERROR, Arrays.toString(e.getStackTrace()))));
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Response<Object>> save(@RequestBody HumanDao humanDao, HttpServletRequest request) {
        try {
            this.humanService.save(new Human(
                    humanDao.getName(),
                    humanDao.getSurname(),
                    humanDao.getBirthdayDate(),
                    this.userService.findByLogin(request.getHeader("login")).getId(),
                    humanDao.getTime(),
                    humanDao.getFate()));
            return Response.success();
        } catch (Exception e) {
            return Response.failure(
                    Response.error(
                            new ErrorBody(e.getMessage(),
                                    HttpStatus.INTERNAL_SERVER_ERROR, Arrays.toString(e.getStackTrace()))));
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Response<Object>> update(@RequestBody String fate, @PathVariable Integer id) {
        try {
            this.humanService.updateFate(id, fate);
            return Response.success();
        } catch (Exception e) {
            return Response.failure(
                    Response.error(
                            new ErrorBody(e.getMessage(),
                                    HttpStatus.INTERNAL_SERVER_ERROR, Arrays.toString(e.getStackTrace()))));
        }
    }


    @DeleteMapping("delete/{id}")
    public ResponseEntity<Response<Object>> delete(@PathVariable String id) {
        try {
            this.humanService.deleteById(Integer.parseInt(id));
            return Response.success();
        } catch (Exception e) {
            return Response.failure(
                    Response.error(
                            new ErrorBody(e.getMessage(),
                                    HttpStatus.INTERNAL_SERVER_ERROR, Arrays.toString(e.getStackTrace()))));
        }
    }
}
