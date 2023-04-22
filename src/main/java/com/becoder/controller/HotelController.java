package com.becoder.controller;

import com.becoder.model.hotels;
import com.becoder.repository.HotelRepository;
import com.becoder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping("getHotels/")
    public String listUsers(Model model) {
        List<hotels> hotels = UserRepository.getAll();
        model.addAttribute("hotels", hotels);
        return "dashboard";
    }
}
