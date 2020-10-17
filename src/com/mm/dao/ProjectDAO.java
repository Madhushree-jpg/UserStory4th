package com.mm.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mm.model.Project;

public class ProjectDAO
{
	Connection con;
	Statement stmt;

	public boolean insertProject(Project p)
	{
		try {
			con=DBConnector.getConnection();
			PreparedStatement pst=con.prepareStatement("insert into Project values(?,?,?,?)");
			pst.setInt(1, p.getId());
			pst.setString(2, p.getTitle());
			pst.setString(3, p.getDescription());
			pst.setString(4, p.getDomain());
			pst.executeUpdate();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public List<Project> showAll() throws SQLException, ClassNotFoundException{
	       
        con=DBConnector.getConnection();
        stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from Project");
        List<Project> list = new ArrayList<Project>();
        while(rs.next()) {
       
        Project p = new Project();
        p.setId(rs.getInt(1));
        p.setTitle(rs.getString(2));
        p.setDescription(rs.getString(3));
        p.setDomain(rs.getString(4));
        list.add(p);
       
        }return list;
        
       
       
    }
		
}
	
	
	


