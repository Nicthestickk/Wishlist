package ønskeliste.demo.services;

import ønskeliste.demo.model.Ønske;
import ønskeliste.demo.repository.ØnskeRepo;

import java.sql.SQLException;
import java.util.List;

public class ØnskeService {
    ØnskeRepo repository = new ØnskeRepo();

    public ØnskeService() {
        repository = new ØnskeRepo();
    }

    public List<Ønske> tilføjØnskeTilDatabasen(Ønske ønske) throws SQLException {
        return repository.tilføjØnskerTilØnskeListe(ønske);
    }
    public List<Ønske> getAllØnsker(){
        return repository.getAllØnsker();
    }

}
