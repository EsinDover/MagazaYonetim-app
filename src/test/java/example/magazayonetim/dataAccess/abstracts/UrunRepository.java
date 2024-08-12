package example.magazayonetim.dataAccess.abstracts;

import example.magazayonetim.entities.concretes.Urun;

import java.util.List;

public interface UrunRepository {

    List<Urun> getAll();
}
