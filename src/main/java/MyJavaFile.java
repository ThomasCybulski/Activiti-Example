import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * Very simple bpmn service task.
 */
public class MyJavaFile implements JavaDelegate {

	/**
	 *
	 * @param execution
	 */
	@Override
	public void execute(DelegateExecution execution) {
		execution.setVariable("isCheckPositive", "false");
	}
}
