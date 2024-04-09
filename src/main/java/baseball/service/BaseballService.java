package baseball.service;

import java.util.List;

import baseball.domain.Baseball;
import baseball.util.ComputerNumbers;

public class BaseballService {
	private Baseball computerNumbers;
	private Baseball userNumbers;


	public BaseballService() {
		List<Integer> numbers = ComputerNumbers.generateNumbers(3);
		this.computerNumbers = new Baseball(numbers);
	}

	public List<Integer> getComputerNumbers() {
		return computerNumbers.getNumbers();
	}





}
