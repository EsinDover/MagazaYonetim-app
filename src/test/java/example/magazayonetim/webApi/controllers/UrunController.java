package example.magazayonetim.webApi.controllers;

import example.magazayonetim.business.abstracts.UrunService;
import example.magazayonetim.entities.concretes.Urun;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/urun")

public class UrunController {
    UrunService urunService;

    public UrunController(UrunService urunService) {
        this.urunService = urunService;
    }
    @GetMapping("/getall")
    public List<Urun> getAllUrun(){
        return urunService.getAll();
    }



}
