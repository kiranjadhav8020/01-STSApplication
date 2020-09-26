package com.tech.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		
		String prifix="kj";
		int suffix=0;
		String sql="select hibernate_sequence.NEXTVAL from dual";
		
		Connection con=null;
		Statement stat=null;
		ResultSet rs=null;
		
		try {
			con=session.connection();
			 stat= con.createStatement();
			 rs=stat.executeQuery(sql);
			 if(rs.next()) {
				  suffix=rs.getInt(1);
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prifix+String.valueOf(suffix);
	}

}
