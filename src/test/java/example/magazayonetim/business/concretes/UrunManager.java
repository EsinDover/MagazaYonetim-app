package example.magazayonetim.business.concretes;

import example.magazayonetim.business.abstracts.UrunService;
import example.magazayonetim.dataAccess.abstracts.UrunRepository;
import example.magazayonetim.entities.concretes.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // bu sınıf bir business nesnesidir.
public class UrunManager implements UrunService {

    private UrunRepository urunRepository;

    @Autowired
    public UrunManager(UrunRepository urunRepository){
        this.urunRepository= urunRepository;

    }
    @Override
    public List<Urun> getAll() {
        return urunRepository.getAll();
    }
}
