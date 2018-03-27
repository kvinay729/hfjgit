package com.hfj;

public class DotCom {

	int[] locations;
	int numOfHits=0;

	public void setLocationCells(int locs[]) {
		locations = locs;

	}

	public String checkUserInput(String userguess) {
		String result = "miss";
		int guess = Integer.parseInt(userguess);
		for (int cell : locations) {
			if (guess == cell) {
				numOfHits++;
				result = "hit";
				// return result;
				break;
			}
		}

		if (numOfHits == locations.length) {
			result = "kill";

		}
		System.out.println(result);
		return result;

	}

}
