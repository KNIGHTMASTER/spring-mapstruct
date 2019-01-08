package com.wissensalt.rnd.springmapstruct.endpoint;

import com.wissensalt.rnd.springmapstruct.dao.IEmployeeDAO;
import com.wissensalt.rnd.springmapstruct.dto.response.ResponseEmployeeDTO;
import com.wissensalt.rnd.springmapstruct.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 1/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class EmployeeEndPointImpl implements IEmployeeEndPoint {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<ResponseEmployeeDTO> findAllEmployee() {
        return employeeDAO.findAll().stream().map(employeeMapper:: toEmployeeDTO).collect(Collectors.toList());
    }
}
