package com.google.gmodule.googlesearch.builder;
/**
 * Join type enum
 * @author Sunil kumar
 *
 */
public enum JoinType {
	NONE(""),
	JOIN("JOIN"),
	INNER("INNER JOIN"),
	RIGHT("RIGHT JOIN"),
	LEFT("LEFT JOIN");
	private String join;
	/**
	 * Join type constructor
	 * @param j
	 */
	JoinType(String j) {
		join = j;
	}
	/**
	 * Method to get join type
	 * @return
	 */
	public String getJoinType() {
		return this.join;
	}
}