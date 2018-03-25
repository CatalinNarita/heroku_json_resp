package com.edu.myapp;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by catal on 3/25/2018
 */
@Mapper
public interface GreetingDTOMapper {
    GreetingDTOMapper INSTANCE = Mappers.getMapper(GreetingDTOMapper.class);

    GreetingDTO mapToDTO(Greeting greeting);

    Greeting mapToEntity(GreetingDTO greetingDTO);

}
