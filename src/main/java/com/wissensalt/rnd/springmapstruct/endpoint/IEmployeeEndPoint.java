package com.wissensalt.rnd.springmapstruct.endpoint;

import com.wissensalt.rnd.springmapstruct.dto.response.ResponseEmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created on 1/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RequestMapping("/employee")
public interface IEmployeeEndPoint {

    @GetMapping("/findAll")
    public List<ResponseEmployeeDTO> findAllEmployee();
}
