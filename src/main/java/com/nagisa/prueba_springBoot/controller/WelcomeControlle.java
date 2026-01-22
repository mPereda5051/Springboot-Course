package com.nagisa.prueba_springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

//Anotacion de Controlador
@Controller
public class WelcomeControlle {
    //Anotacion metodo get
    @GetMapping
    //Permite usar el return sin depender de un cuerpo en html
    @ResponseBody
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/cursos")
    public String cursos(){
        return "cursos";
    }

    //PathVariable
    //Nombre/Variable
    //hacer el path opcional
    @GetMapping({"/cursos/{curso}"/* ,"/cursos/{curso}/{categoria}"*/})
    @ResponseBody
    public String mostrarCurso(
       @PathVariable String curso/* ,
        @PathVariable(required=false) String categoria
*/
    ){
       /**  if(categoria != null){
                   return "Curso: " + curso +" Categoria: " + categoria ;

        }**/
          return "Curso: " + curso;
    }
}
