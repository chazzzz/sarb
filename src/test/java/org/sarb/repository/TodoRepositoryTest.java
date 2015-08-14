package org.sarb.repository;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sarb.config.ApplicationConfig;
import org.sarb.config.TestPersistenceConfig;
import org.sarb.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chazz on 7/20/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		DbUnitTestExecutionListener.class
})
@ContextConfiguration(classes = {
		ApplicationConfig.class,
		TestPersistenceConfig.class
})
@WebAppConfiguration
@ActiveProfiles("env_testing")
@DatabaseSetup(value = "classpath:datasets/todos-setup.xml", type = DatabaseOperation.CLEAN_INSERT)
@DatabaseTearDown(value = "classpath:datasets/todos-teardown.xml", type = DatabaseOperation.DELETE_ALL)
public class TodoRepositoryTest {

	@Autowired
	private TodoRepository todoRepository;

	@Test
	public void shouldCountNotZero() {
		Assert.assertTrue(todoRepository.count() != 0);
	}

	@Test
	public void shouldCreateAnEntry() {
		Todo todo = new Todo("Wash, Rinse, Repeat", "This concludes your junit training");
		todo.setId(3L);
		todo.setVersion(0L);

		todoRepository.save(todo);

		Assert.assertEquals(3L, todoRepository.count());
	}
}
