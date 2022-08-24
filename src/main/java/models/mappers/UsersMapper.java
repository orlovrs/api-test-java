package models.mappers;

import models.domain.User;
import models.dtos.PostUserDto;
import org.modelmapper.ModelMapper;

public class UsersMapper {
    static ModelMapper mapper = new ModelMapper();

    static {
        mapper.typeMap(User.class, PostUserDto.class);
    }

    public static <T> T map(User user, Class<T> clazz) {
        return mapper.map(user, clazz);
    }
}
