//package com.demo.model;
//
//import com.demo.bean.UsuarioRequest;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
///**
// * Created by Mijail on 4/07/2019.
// */
//@Entity
//@Table(name = "cliente")
//public class Cliente {
//
//    @Id
//    private String correo;
//    private String dni;
//    private String nombre;
//    private String apellidos;
//    private String celular;
//
//    @Column(name = "codigo_promocion")
//    private String codigo_promocion;
//
//    public Cliente(){}
//
//    public Cliente(UsuarioRequest user, String codigo_promocion) {
//        this.correo = user.getCorreo();
//        this.nombre = user.getNombre();
//        this.apellidos = user.getApellidos();
//        this.celular = user.getNumero();
//        this.codigo_promocion = codigo_promocion;
//    }
//
//    public String getCorreo() {
//        return correo;
//    }
//
//    public void setCorreo(String correo) {
//        this.correo = correo;
//    }
//
//    public String getDni() {
//        return dni;
//    }
//
//    public void setDni(String dni) {
//        this.dni = dni;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellidos() {
//        return apellidos;
//    }
//
//    public void setApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    public String getCelular() {
//        return celular;
//    }
//
//    public void setCelular(String celular) {
//        this.celular = celular;
//    }
//
//    public String getCodigo_promocion() {
//        return codigo_promocion;
//    }
//
//    public void setCodigo_promocion(String codigo_promocion) {
//        this.codigo_promocion = codigo_promocion;
//    }
//}
