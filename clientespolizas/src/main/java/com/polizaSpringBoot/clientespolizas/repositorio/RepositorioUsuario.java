package com.polizaSpringBoot.clientespolizas.repositorio;

import com.polizaSpringBoot.clientespolizas.Guia.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuarios,Long> {
}
