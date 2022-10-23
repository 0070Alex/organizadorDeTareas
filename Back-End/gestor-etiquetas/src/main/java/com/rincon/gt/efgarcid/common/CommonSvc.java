/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.common;

import java.util.Optional;

/**
 *
 * @author egarc
 */
public interface CommonSvc <E>{
    public Iterable<E> findAll();
	
    public Optional<E> findById(Object id);

    public E save(E entity);

    public void deleteById(Object id);
}
