package com.polizaSpringBoot.clientespolizas.Guia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Numero_poliza;
    @Column(nullable = false)
    private Integer Id_cliente;
    @Column(nullable = false)
    private String Nombre_cliente;
    @Column(nullable = false)
    private String FechaNac_cliente;
    @Column(nullable = false)
    private String CiudadRes_cliente;
    @Column(nullable = false)
    private String Direccion_cliente;
    @Column(nullable = false)
    private String Nombre_plan_poliza;
    @Column(nullable = false)
    private String Fecha_inicio_poliza;
    @Column(nullable = false)
    private String Coberturas_cubiertas;
    @Column(nullable = false)
    private String Valormax_poliza;
    @Column(length = 7)
    private String Placa_auto;
    @Column(nullable = false)
    private String Modelo_auto;
    @Column(nullable = false)
    private boolean Inspeccion_vehiculo;
}

