package ru.eaglebut.logdepot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.eaglebut.logdepot.bean.LogBean;

/**
 * Crud repository for LogBeans
 *
 * @author Veniamin Tischenkov
 * @since 17.08.2022
 */
@RepositoryRestResource(collectionResourceRel = "logdepot", path = "logdepot")
public interface LogRepository extends PagingAndSortingRepository<LogBean, Long> {
}
