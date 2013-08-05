package com.lvzu.core.dialect;

public abstract class Dialect {

	public static enum Type{
		MYSQL,
		ORACLE,
        MSSQL
	}
	
	public abstract String getLimitString(String sql, int skipResults, int maxResults);
	
}
