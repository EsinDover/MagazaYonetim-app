package example.magazayonetim.dataAccess.concretes;

import example.magazayonetim.dataAccess.abstracts.UrunRepository;
import example.magazayonetim.entities.concretes.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository // bu sınıf bir DataAccess nesnesidir.

public class InMemoryUrunRepository implements UrunRepository {

    List<Urun> urun;
    @Autowired
    public InMemoryUrunRepository(){
        urun = new ArrayList<Urun>();
        urun.add(new Urun(1,"ayakkabı"));
        urun.add(new Urun(1,"çanta"));
        urun.add(new Urun(1,"forma"));
        urun.add(new Urun(1,"bandaj"));
        urun.add(new Urun(1,"şort"));

    }

    @Override
    public List<Urun> getAll() {
        return urun;
    }
}
