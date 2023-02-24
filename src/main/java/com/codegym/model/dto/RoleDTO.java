package com.codegym.model.dto;

import com.codegym.model.EnumRole;
import com.codegym.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoleDTO {
    @NotNull(message = "The role is required")
    private Long id;

    private String code;

    public RoleDTO(Long id, EnumRole code) {
        this.id = id;
        this.code = code.name();
    }

    public Role toRole() {
        return new Role()
                .setId(id)
                .setCode(EnumRole.valueOf(code));
    }
}
