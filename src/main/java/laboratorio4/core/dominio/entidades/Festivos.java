package laboratorio4.core.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "festivos")
public class Festivos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "festivos_id_seq")
    @SequenceGenerator(name = "festivos_id_seq", sequenceName = "festivos_id_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "dia", nullable = false)
    private int dia;

    @Column(name = "mes", nullable = false)
    private int mes;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo", nullable = false)
    private int tipo;

    @Column(name = "dias_de_pascua", nullable = false)
    private int diasDePascua;

    public Festivos() {
    }

    public Festivos(int id, int dia, int mes, String nombre, int tipo, int diasDePascua) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.nombre = nombre;
        this.tipo = tipo;
        this.diasDePascua = diasDePascua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getDiasDePascua() {
        return diasDePascua;
    }

    public void setDiasDePascua(int diasDePascua) {
        this.diasDePascua = diasDePascua;
    }
}