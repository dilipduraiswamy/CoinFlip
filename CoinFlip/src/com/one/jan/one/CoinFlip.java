/**
 * 
 */
package com.one.jan.one;

/**
 * @author dilip.duraiswamy
 *
 */
public class CoinFlip {

	/**
	 * @param numberOfTimesCoinFlipped
	 * @return TotalCount class object which contains totalHeadCount and
	 *         totalTailCount
	 * @throws Exception
	 * @Example if numberOfTimesCoinFlipped is 3 it returns totalHeadCount=2 and
	 *          totalTailCount=1
	 * @Description this function is used to count total number of head vs total
	 *              number of tails during flips of coin
	 */
	public static TotalCount getHeadCountAndTailCountBy(int numberOfTimesCoinFlipped) throws Exception {
		int headCount = 0;
		int tailCount = 0;
		boolean headFlag = true;
		boolean tailFlag = false;
		for (int i = 0; i < numberOfTimesCoinFlipped; i++) {
			if (headFlag) {
				headCount = headCount + 1;
				tailFlag = true;
				headFlag = false;
			} else {
				tailCount = tailCount + 1;
				tailFlag = false;
				headFlag = true;
			}

		}
		return new TotalCount(headCount, tailCount);
	}

}
