package fr.efrei.repository;
import fr.efrei.domain.Identity;
import java.util.*;
public interface IIdentityRpository extends IRepository {
    public List<Identity> getAll();
    public Identity getIndex(int i);

    Identity read(String s);

    Identity update(Identity id);

    boolean delete(String o);
}
