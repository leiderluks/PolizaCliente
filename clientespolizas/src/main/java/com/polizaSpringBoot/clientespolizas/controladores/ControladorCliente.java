package com.polizaSpringBoot.clientespolizas.controladores;

import com.polizaSpringBoot.clientespolizas.Guia.Usuarios;
import com.polizaSpringBoot.clientespolizas.servicios.Servicio_cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Usuarios")
@RequiredArgsConstructor
public class ControladorCliente {
    private final Servicio_cliente servicio_cliente;

    @PostMapping
    public ResponseEntity guardarUsuario(@RequestBody Usuarios usuarios){
        return new ResponseEntity(servicio_cliente.guardarUsuario(usuarios), HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity ObtenerUsuario(@PathVariable("id") Long idUsuario){
        return new ResponseEntity(servicio_cliente.ObtenerUsuario(idUsuario), HttpStatus.OK);
    }
}
