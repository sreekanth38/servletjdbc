package com.pawana.DAOImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pawana.DAO.JDBCConnection;
import com.pawana.DAO.SQLQuery;
import com.pawana.been.StudentVO;

public class DataQuery implements SQLQuery {
	 int result;

	@Override
	public int InserQuery(StudentVO s) throws ClassNotFoundException, SQLException {
		Connection con = JDBCConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)") ;
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setInt(3, s.getBranch());
		 result = ps.executeUpdate();
		return result;
		
	}

}
