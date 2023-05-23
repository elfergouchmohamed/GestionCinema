package org.sid.cinema;

import org.sid.cinema.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionCinemaApplication implements CommandLineRunner {
    @Autowired
    private ICinemaInitService cinemaInitService;
    public static void main(String[] args) {
        SpringApplication.run(GestionCinemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cinemaInitService.initVilles();
        cinemaInitService.initCinemas();
        cinemaInitService.initSalles();
        cinemaInitService.initPlaces();
        cinemaInitService.initSeances();
        cinemaInitService.initCategories();
        cinemaInitService.initFlilms();
        cinemaInitService.initProjections();
        cinemaInitService.inittickets();
    }
}
