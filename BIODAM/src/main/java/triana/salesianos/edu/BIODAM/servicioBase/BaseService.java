package triana.salesianos.edu.BIODAM.servicioBase;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class BaseService<T,ID,R extends JpaRepository<T,ID>> implements IBaseService<T, ID>{
    @Override
    public T save(T t) {
        return null;
    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T edit(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteById(ID id) {

    }
}
