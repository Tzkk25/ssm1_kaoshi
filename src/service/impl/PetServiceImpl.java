package service.impl;

import dao.PetDao;
import dao.impl.PetDaoImpl;
import entity.Pet;
import service.PetService;

import java.util.List;

public class PetServiceImpl implements PetService {
    PetDao pd = new PetDaoImpl();
    @Override
    public List<Pet> getPets() {
        return pd.getPet();
    }
}
