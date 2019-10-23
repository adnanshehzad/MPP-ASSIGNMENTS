package prob1;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		return list.stream()
				.filter(a -> (a.getGpa()>3.0 && a.getMajor()==Majors.CS))
				.collect(Collectors.toList());
	}
}
