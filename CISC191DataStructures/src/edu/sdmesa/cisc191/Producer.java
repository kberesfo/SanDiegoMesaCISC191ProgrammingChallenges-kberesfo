package edu.sdmesa.cisc191;

public interface Producer<T> {
	/**
	 * Adds an element from the collection; making it available for consumption.
	 */
	public void produce(T item);
}