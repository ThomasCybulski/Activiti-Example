import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

/**
 * Testing my process.
 *
 * @author Thomas Cybulski
 */
public class TestMyJavaFile {

	/*
	 * Method to test the process
	 */
	@Test
	public void testsTheOutput() {

		/*
		 * Start the process engine instance
		 */
		ProcessEngine processEngine = ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResourceDefault()
				.buildProcessEngine();

		/*
		 * Start the runtime service
		 */
		RuntimeService runtimeService = processEngine.getRuntimeService();
		RepositoryService repositoryService = processEngine.getRepositoryService();

		/*
		 * Deploy BPMN XML Diagram
		 */
		repositoryService.createDeployment().addClasspathResource("diagrams/MyProcess.bpmn").deploy();

		// Starting the process
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("myProcess");

		System.out.println("Die Prozess ID lautet: " + pi.getProcessInstanceId());
	}
}
