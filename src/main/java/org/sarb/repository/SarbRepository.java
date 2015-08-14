package org.sarb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Is this really needed?
 * As an anticipation for additional base repository methods,
 * this will be the base class that all repos must inherit.
 *
 * Created by chazz on 8/6/2015.
 */
@NoRepositoryBean
public interface SarbRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
