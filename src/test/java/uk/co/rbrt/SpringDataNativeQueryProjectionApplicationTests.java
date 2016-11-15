package uk.co.rbrt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataNativeQueryProjectionApplicationTests
{
	@Autowired
	PersonRepository personRepository;

    @Test
    public void testFindPersonSummaryInterfaceById()
    {
        PersonSummaryInterface personSummaryInterface = personRepository.findPersonSummaryInterfaceById(1);
        Assert.assertEquals("Bob", personSummaryInterface.getName());
        Assert.assertEquals(33, personSummaryInterface.getAge());
    }

    @Test
    public void testFindPersonSummaryClassById()
    {
        PersonSummaryClass personSummaryClass = personRepository.findPersonSummaryClassById(1);
        Assert.assertEquals("Bob", personSummaryClass.getName());
        Assert.assertEquals(33, personSummaryClass.getAge());
    }

    @Test
    public void testFindPersonSummaryInterfaceByIdQuery()
    {
        PersonSummaryInterface personSummaryInterface = personRepository.findPersonSummaryInterfaceByIdQuery(1);
        Assert.assertEquals("Bob", personSummaryInterface.getName());
        Assert.assertEquals(33, personSummaryInterface.getAge());
    }

    @Test
    public void testFindPersonSummaryClassByIdQuery()
    {
        PersonSummaryClass personSummaryClass = personRepository.findPersonSummaryClassByIdQuery(1);
        Assert.assertEquals("Bob", personSummaryClass.getName());
        Assert.assertEquals(33, personSummaryClass.getAge());
    }
}
