package testNGListners;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;


public class PriorityInterceptor implements IMethodInterceptor {
	
	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		Comparator<IMethodInstance> c =	(IMethodInstance a1, IMethodInstance a2) -> comparePriority(a1, a2);
		
		Collections.sort(methods, c);
		System.out.println(methods);
		
//		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
//		methods.sort(comparing(IMethodInstance::getPriority()));
//		for (IMethodInstance method : methods) {
//			methods.sort(c);
//			Test testMethod = method.getMethod().getPriority()getConstructorOrMethod().getMethod().getAnnotation(Test.class);
//			if (testMethod.priority() == 1) {
//				result.add(method);
//			}
//		}
		
		return methods;
	}

	public int comparePriority(IMethodInstance A1,IMethodInstance A2){
		Integer x1 = A1.getMethod().getPriority();
		Integer x2 = A2.getMethod().getPriority();
		return x1.compareTo(x2);
	}
}
