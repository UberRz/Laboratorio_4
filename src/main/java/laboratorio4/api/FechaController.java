package laboratorio4.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/festivo")
public class FechaController {

    @Autowired
    private ServicioFechas servicioFechas;

    @GetMapping
    public Map<String, Object> validarFecha(@RequestParam("fecha") String fechaTexto) {
        Map<String, Object> respuesta = new HashMap<>();

        try {
            LocalDate fecha = LocalDate.parse(fechaTexto);
            boolean esFestivo = servicioFechas.esFestivo(fecha);

            respuesta.put("fecha", fecha);
            respuesta.put("esFestivo", esFestivo);
        } catch (DateTimeParseException e) {
            respuesta.put("error", "Formato de fecha inválido. Usa yyyy-MM-dd.");
        }

        return respuesta;
    }
}
