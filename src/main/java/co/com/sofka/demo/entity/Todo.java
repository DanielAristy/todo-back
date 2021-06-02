package co.com.sofka.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    //Identificando el primaryKey de la clase
    @Id
    //Generar el valor automaticamente autoincrementado
    @GeneratedValue
    private Long id;
    private String name;
    private boolean esCompletado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEsCompletado() {
        return esCompletado;
    }

    public void setEsCompletado(boolean esCompletado) {
        this.esCompletado = esCompletado;
    }
}
