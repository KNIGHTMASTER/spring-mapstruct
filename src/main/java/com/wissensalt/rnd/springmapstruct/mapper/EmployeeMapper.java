package com.wissensalt.rnd.springmapstruct.mapper;

import com.wissensalt.rnd.springmapstruct.dto.response.ResponseEmployeeDTO;
import com.wissensalt.rnd.springmapstruct.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

/**
 * Created on 1/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
@Mapper(config = MappingConfig.class)
public abstract class EmployeeMapper {

    @Mappings({
            @Mapping(target = "id", source = "employee.id"),
            @Mapping(target = "code", source = "employee.code"),
            @Mapping(target = "name", source = "employee.name"),
            @Mapping(target = "birthPlace", source = "employee.birthPlace"),
            @Mapping(target = "birthDate", source = "employee.birthDate", dateFormat = "dd-MM-yyyy")
    })
    public abstract ResponseEmployeeDTO toEmployeeDTO(Employee employee);
}
