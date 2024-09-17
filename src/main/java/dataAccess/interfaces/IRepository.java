/**
 * @file IRepository.java
 * @author Miguel Calambas
 * @Brief It generalice the repositories of the entities
 */
package dataAccess.interfaces;

import java.util.List;

/**
 * @param <model> modelos de nuestro proyecto
 * @brief interface to repositories of the models 
 */
public interface IRepository<model> {
    public boolean almacenar(model obj);
    public List<model> listar();
}
