package com.example.bank.controllers;

import com.example.bank.models.Citizen;
import com.example.bank.models.Country;
import com.example.bank.models.Human;
import com.example.bank.repositories.CountryRepository;
import com.example.bank.repositories.HumanRepository;
import com.example.bank.services.CitizenService;
import com.example.bank.services.CountryService;
import com.example.bank.services.HumanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HumanController {
    private final HumanService humanService;
    private final HumanRepository humanRepository;
    private final CountryRepository countryRepository;
    private final CitizenService citizenService;
    private final CountryService countryService;
    @GetMapping("/")
    public String humanPage(Model model){
        model.addAttribute("humans", humanService.listHuman());
        return  "main";
    }
    @GetMapping("/newHuman")
    public String newHuman(Model model){
        model.addAttribute("citizens", citizenService.listCitizen());
        return  "reghuman";
    }
    @PostMapping("/newHuman")
    public String newHumanPost(@RequestParam("citizen_id") Long citizenId,@RequestParam("address") String address, @RequestParam("index") String index, Human human, Citizen citizen, Country country){
        citizen.setId(citizenId);
        human.setCitizen(citizen);
        country.setAddress(address);
        country.setIndex(index);
        countryRepository.save(country);
        human.setCountry(country);
        humanService.saveHuman(human);
        humanRepository.save(human);
        return  "redirect:/";
    }
    @PostMapping("/deleteHuman/{id}")
    public String newHumanPost(@PathVariable("id") Long id, Human human) {
        humanService.deleteHuman(id);
        return  "redirect:/";
    }
    @GetMapping("/editHuman/{id}")
    public String changeHuman(@PathVariable("id") Long id,Model model){
        Human human = humanService.getHumanById(id);
        model.addAttribute("citizens", citizenService.listCitizen());
        model.addAttribute("human", human);
        return  "changehuman";
    }
    @PostMapping("/editHuman/name/{id}")
    public String changeHumanName(@PathVariable("id") Long id,@RequestParam("name") String name,Model model){
        Human human = humanService.getHumanById(id);
        human.setName(name);
        humanService.updateHuman(human);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/age/{id}")
    public String changeHumanAge(@PathVariable("id") Long id,@RequestParam("age") Integer age,Model model){
        Human human = humanService.getHumanById(id);
        human.setAge(age);
        humanService.updateHuman(human);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/lastName/{id}")
    public String changeHumanLastName(@PathVariable("id") Long id,@RequestParam("last_name") String last_name,Model model){
        Human human = humanService.getHumanById(id);
        human.setLast_name(last_name);
        humanService.updateHuman(human);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/middleName/{id}")
    public String changeHumanMiddleName(@PathVariable("id") Long id,@RequestParam("middle_name") String middle_name,Model model){
        Human human = humanService.getHumanById(id);
        human.setMiddle_name(middle_name);
        humanService.updateHuman(human);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/pass/{id}")
    public String changeHumanPass(@PathVariable("id") Long id,@RequestParam("passport_series_and_number") String passport_series_and_number,Model model){
        Human human = humanService.getHumanById(id);
        human.setPassport_series_and_number(passport_series_and_number);
        humanService.updateHuman(human);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/address/{id}")
    public String changeHumanAddress(@PathVariable("id") Long id,@RequestParam("address") String address,Model model){
        Human human = humanService.getHumanById(id);
        Country country = human.getCountry();
        country.setAddress(address);
        countryService.updateCountry(country);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/index/{id}")
    public String changeHumanIndex(@PathVariable("id") Long id,@RequestParam("index") String index,Model model){
        Human human = humanService.getHumanById(id);
        Country country = human.getCountry();
        country.setIndex(index);
        countryService.updateCountry(country);
        return  "redirect:/editHuman/{id}";
    }
    @PostMapping("/editHuman/citizen/{id}")
    public String changeHumanCitizen(@PathVariable("id") Long id, @RequestParam("citizen_id") Long citizen_id, Model model){
        Human human = humanService.getHumanById(id);
        Citizen citizen = citizenService.getCitizenById(citizen_id);
        human.setCitizen(citizen);
        humanService.updateHuman(human);
        return  "redirect:/editHuman/{id}";
    }
    @GetMapping("/search")
    public String searchHumans(@RequestParam("citizenship") String citizenship,@RequestParam("index") String index,Model model) {
        List<Human> foundHumans = humanService.searchHuman(citizenship, index);
        model.addAttribute("humans", foundHumans);
        return "searchhumans";
    }
}
