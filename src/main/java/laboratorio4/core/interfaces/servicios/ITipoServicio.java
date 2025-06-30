package laboratorio4.core.interfaces.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import laboratorio4.core.dominio.entidades.Tipo;

@Service
public interface ITipoServicio {

    List<Tipo> listar();

    Tipo obtener(int id);

    List<Tipo> buscar(String dato);

    Tipo agregar(Tipo tipo);

    Tipo modificar(Tipo tipo);

    boolean eliminar(int id);

}
