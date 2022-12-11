package fr.efrei.repository;
import fr.efrei.domain.Identity;
import java.util.*;

public interface IIdentityRepository extends IRepository<Identity, String> {
    public List<Identity> getAll();
    public Identity getIndex(int i);

}
