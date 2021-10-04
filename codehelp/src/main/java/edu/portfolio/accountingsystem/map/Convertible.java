package edu.portfolio.accountingsystem.map;

public interface Convertible {

    default <T> T as(Mapper mapper, Class<T> tClass) {
        return mapper.map(this, tClass);
    }
}
