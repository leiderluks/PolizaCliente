package com.polizaSpringBoot.clientespolizas.servicios;

import com.polizaSpringBoot.clientespolizas.Guia.Usuarios;


import java.util.Optional;


public interface Servicio_cliente {
    Usuarios guardarUsuario(Usuarios usuarios);

    Optional<Usuarios>ObtenerUsuario(Long IdUsuaario);

}
