package fr.efrei.repository;
import fr.efrei.domain.Identity;
import java.util.*;

public class IdentityRepository implements IIdentityRpository {
    private static IdentityRepository repository = null;
    private List<Identity> idDB = null;


    private IdentityRepository() {
        idDB = new ArrayList<Identity>();
    }
    private IdentityRepository getRepository() {
        if (repository == null) {
            return new IdentityRepository();
        }
        return repository;
    }

    @Override
    public List<Identity> getAll() {
        return idDB;
    }

    @Override
    public Identity getIndex(int i) {
        return idDB.get(i);
    }


    public Identity create(Identity id) {
        boolean success = idDB.add(id);
        if (success) {
            return id;
        } else {
            return null;
        }
    }

    @Override
    public Identity read(String s) {
        for (Identity i : idDB) {
            if (i.getPassport().equals(s)) {
                return i;
            }

        }
        return null;
    }

    @Override
    public Identity update(Identity id) {
        Identity oldid = read(id.getPassport());
        if (id != null) {
            idDB.remove(oldid);
            idDB.add(id);
            return id;
        }
        return null;
    }

    @Override
    public boolean delete(String o) {
        Identity idDelete = read(o);
        if (idDelete == null){
            return false;
        }
        idDB.remove(idDelete);
        return true;
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }
}




