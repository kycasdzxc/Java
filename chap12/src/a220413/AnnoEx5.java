package a220413;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@TestInfo(
	count = 10,
	testedBy = "aaa",
	testTools = "JUNIT",
	testType = TestType.FIRST,
	testDate = @DateTime(yymmdd = "220413", hhmmss = "235959")
)
public class AnnoEx5 {
	public static void main(String[] args) {
		
	}
}

enum TestType {FIRST, FINAL}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
	int count();
	String testedBy();
	String[] testTools();
	TestType testType();
	DateTime testDate();
}