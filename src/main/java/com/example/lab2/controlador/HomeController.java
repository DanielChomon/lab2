package com.example.lab2.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value= "/", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal() {
        return "Hola, compañero de carrera y que disfruta de los personajes franceses que pueden teletransportarse y utilizan armas doradas. Envío este mensaje solicitando el punto extra para poder, además de ser más feliz, poder concentrarme en mejorar mis habilidades en diferentes aptitudes tanto en Valorant como League of Legends, ajedrez y posiblemente fútsal, para ayudar a nuestra querida fibra tóxica a tener el mejor resultado en semana de ingeniería como sea posible. \n Muchas gracias por su atención. \nAtte. \nDcrusher";
    }

    @RequestMapping(value= {"/Jugador"} )

    public String jugador() {
        return "jugador/list";
    }
}
