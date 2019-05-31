package com.pawana.DAO;

import java.sql.SQLException;

import com.pawana.been.StudentVO;

public interface SQLQuery {
	
	
	public	int InserQuery(StudentVO s) throws ClassNotFoundException, SQLException;
}
