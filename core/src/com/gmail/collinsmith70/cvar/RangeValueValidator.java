package com.gmail.collinsmith70.cvar;

public interface RangeValueValidator<T> extends ValueValidator<T> {

T getMin();
T getMax();

}
