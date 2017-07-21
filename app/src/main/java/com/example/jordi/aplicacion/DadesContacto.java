package com.example.jordi.aplicacion;

/**
 * Created by Jordi on 19/07/2017.
 */

public class DadesContacto {

   String usuario;
   double telefono;
   String email;
   String descripcion_contacto;

   public String getUsuario() {

       return usuario;
   }

   public void setUsuario(String usuario) {

       this.usuario = usuario;
   }

   public double getTelefono() {

       return telefono;
   }

   public void setTelefono(double telefono) {

       this.telefono = telefono;
   }

   public String getEmail() {

       return email;
   }

   public void setEmail(String email) {

      this.email = email;
   }

   public String getDescripcion_contacto() {

       return descripcion_contacto;
   }

   public void setDescripcion_contacto(String descripcion_contacto) {

      this.descripcion_contacto = descripcion_contacto;
   }
}
