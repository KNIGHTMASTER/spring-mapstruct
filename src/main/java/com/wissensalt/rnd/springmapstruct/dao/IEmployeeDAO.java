package com.wissensalt.rnd.springmapstruct.dao;

import com.wissensalt.rnd.springmapstruct.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 1/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IEmployeeDAO extends JpaRepository<Employee, Long> {
}
