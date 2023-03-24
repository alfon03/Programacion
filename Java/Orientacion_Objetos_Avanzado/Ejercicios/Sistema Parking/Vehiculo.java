package SistemaParking;

import java.util.Date;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private String combustible;
    private Date fechaEntrada;
    private TipoVehiculo tipo;

    public Vehiculo(String marca, String modelo, String matricula, String combustible, Date fechaEntrada, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.combustible = combustible;
        this.fechaEntrada = fechaEntrada;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", combustible='" + combustible + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", tipo=" + tipo +
                '}';
    }
}