package sawant.mihir.dynamicviewapp.service;

import org.springframework.stereotype.Service;
import sawant.mihir.dynamicviewapp.model.Avenger;

import java.util.ArrayList;
import java.util.List;

@Service
public class AvengerService {
    private List<Avenger> list;

    public AvengerService(){

        list = new ArrayList<>();
        list.add(new Avenger("Dr.Strange", "Benedict Cumberbatch"));
        list.add(new Avenger("Iron Man", "Robert Downey Jr"));
        list.add(new Avenger("Thor", "Chris Hemsworth"));
    }

    public void addAvenger(Avenger avenger){
        list.add(avenger);
    }

    public List<Avenger> findAllAvengers(){
        return list;
    }
}
