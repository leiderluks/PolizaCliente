package com.polizaSpringBoot.clientespolizas.servicios;

import com.polizaSpringBoot.clientespolizas.Guia.Usuarios;
import com.polizaSpringBoot.clientespolizas.repositorio.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class ServicioCliente implements Servicio_cliente {

    private final RepositorioUsuario repositorioUsuario;
    @Override
    public Usuarios guardarUsuario(Usuarios usuarios) {
        return repositorioUsuario.save(usuarios);
    }

    @Override
    public Optional<Usuarios> ObtenerUsuario(Long idUsuario) {
        return Optional.ofNullable(repositorioUsuario.findById(idUsuario).orElseThrow(() -> {
            throw new RuntimeException();
        }));
    }
}
