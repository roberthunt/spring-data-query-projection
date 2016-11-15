package uk.co.rbrt;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author <a href="mailto:roberthunt87@gmail.com">Robert Hunt</a>
 */
public interface PersonRepository extends CrudRepository<Person, Long>
{
    PersonSummaryInterface findPersonSummaryInterfaceById(long id);

    PersonSummaryClass findPersonSummaryClassById(long id);

    @Query("SELECT name AS name, age AS age FROM Person WHERE id = :id")
    PersonSummaryInterface findPersonSummaryInterfaceByIdQuery(@Param("id") long id);

    @Query("SELECT name AS name, age AS age FROM Person WHERE id = :id")
    PersonSummaryClass findPersonSummaryClassByIdQuery(@Param("id") long id);
}
