package mapper;

public interface Mapper<From, To> {
    To mapToObject(From dao);
    From mapToDto(To origin);
}
