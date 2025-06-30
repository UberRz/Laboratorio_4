package laboratorio4.core.interfaces.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import laboratorio4.core.dominio.entidades.Festivo;

@Service
public interface IFestivoServicio {

    List<Festivo> listar();

    Festivo obtener(int id);

    List<Festivo> buscar(String dato);

    Festivo agregar(Festivo festivo);

    Festivo modificar(Festivo festivo);

    boolean eliminar(int id);

}
