package ønskeliste.demo.services;

import ønskeliste.demo.model.Ønske;
import ønskeliste.demo.repository.Ønskelisterepo;

import java.util.List;

public class test3 {
    Ønskelisterepo repository;

    public test3() {
        repository = new Ønskelisterepo();
    }

    public List<Ønske> getAllMovies(){
        return repository.getAllWishes();
    }

}
