package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;

@Service
public class SSAService {

	public User SaveUser(User user) {
		String ssn = user.getSsn();
		String state = getState(ssn);
		user.setStateName(state);
		return user;
	}
	public String getState(String ssn) {
		char charAt = ssn.charAt(0);
		switch(charAt) {
		case '1':
			return "New Jersey";
		case '2':
			return "Ohio";
		case '3':
			return "Texas";
		case '4':
			return "California";
		case '5':
			return "Rhode Island";
		case '6':
			return "Kentucky";
		case '7':
			return "Invalid SSN";
		case '8':
			return "Invalid SSN";
		case '9':
			return "Invalid SSN";
			
		}
		return ssn;
		
	}
}
