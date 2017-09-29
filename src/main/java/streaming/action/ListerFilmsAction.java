/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.action;

import java.util.List;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author IB
 */
public class ListerFilmsAction {
    
    public List<Film> getFilms(){
        
        return new FilmService().lister();
    }
    
    public String execute(){
        
        // Renvoyer vers ma vue
        return "success";
    }
}
