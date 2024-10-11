package co.edu.uniquindio.proyecto.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record RegistrarClienteDTO(

        @NotBlank @Length(min = 4) String identificacion,
        @NotBlank @Length(max = 100)  String nombreCompleto,
        @NotBlank @Email String email,
        @NotBlank @Length(max = 30) String usuario,
        @NotBlank @Length(max = 30)String password,

        @NotBlank @Length(max = 100)String direccion,
        @NotBlank @Length(max = 12) String telefono
) {
}
