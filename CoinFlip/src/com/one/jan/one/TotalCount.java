/**
 * 
 */
package com.one.jan.one;

/**
 * @author dilip.duraiswamy
 *
 */
public class TotalCount {

	private int totalHeadCount;
	
	private int totalTailCount;

	public int getTotalHeadCount() {
		return totalHeadCount;
	}

	public void setTotalHeadCount(int totalHeadCount) {
		this.totalHeadCount = totalHeadCount;
	}

	public int getTotalTailCount() {
		return totalTailCount;
	}

	public void setTotalTailCount(int totalTailCount) {
		this.totalTailCount = totalTailCount;
	}

	public TotalCount(int totalHeadCount, int totalTailCount) {
		super();
		this.totalHeadCount = totalHeadCount;
		this.totalTailCount = totalTailCount;
	}

	public TotalCount() {
		super();
	}
	
	
}
