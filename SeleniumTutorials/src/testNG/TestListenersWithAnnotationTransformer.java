package testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;

public class TestListenersWithAnnotationTransformer implements IAnnotationTransformer
{
	public void transform(ITestAnnotation annotation,Class testclass,Constructor con,Method methods)
	{
		annotation.setRetryAnalyzer(ITestListenersExample.class);
	}
}
