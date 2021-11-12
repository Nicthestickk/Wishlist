package ønskeliste.demo.services;

import ønskeliste.demo.model.Ønske;
import ønskeliste.demo.repository.ØnskeRepo;

import java.util.List;

public class ØnskeService {
    ØnskeRepo repository;

    public ØnskeService() {
        repository = new ØnskeRepo();
    }

    public List<Ønske> getAllØnsker(){
        return repository.getAllØnsker();
    }

}
