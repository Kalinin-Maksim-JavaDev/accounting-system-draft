package edu.portfolio.accountingsystem.map;

public abstract class Mapper {
    public abstract <D> D map(Object source, Class<D> destinationType);
}
