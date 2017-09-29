/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.action;

import java.util.List;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.service.FilmService;
import streaming.service.GenreService;

/**
 *
 * @author IB
 */
public class AjouterFilmAction {
    
    private Film film;

    public List<Genre> getGenres(){
        
        return new GenreService().lister();
    }
    
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
    
    public String execute(){
        
        if(film!=null){
            
            // Persiste
            new FilmService().ajouterFilm(this.film);
            
            // Renvoyer vers restultat "success"
            return "success";
        }
        
        return "show_form";
    }
}
