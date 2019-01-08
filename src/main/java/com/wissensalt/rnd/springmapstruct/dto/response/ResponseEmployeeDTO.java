package com.wissensalt.rnd.springmapstruct.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created on 1/8/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Getter
@Setter
public class ResponseEmployeeDTO implements Serializable {

    private Long id;
    private String code;
    private String name;
    private String birthPlace;
    private String birthDate;

}
