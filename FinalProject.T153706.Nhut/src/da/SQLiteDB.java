package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import data.Category;

public class SQLiteDB {
	private Connection connect() {
		String url = "jdbc:sqlite:FOC2-2017.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public void getAllProducts(){
		String sql = "SELECT * FROM unitog";
		
		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				
				System.out.format("%3d %-40s %6.2f %4d \n", 
						rs.getInt("productid"),
						rs.getString("productname"),
						rs.getDouble("unitprice"));				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void insert (String pCode,String pName, int categoryid, int brandid, int unitOfMeasure, double unitprice, String description){
		String sql = "INSERT INTO products(productcode, productname, categoryid, brandid , unitOfMeasure,unitprice, description)"
				+ "VALUES(?,?,?,?)";
		
		try (Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, pCode);
			pstmt.setString(2, pName);
			pstmt.setInt(3, categoryid);
			pstmt.setInt(4, brandid);
			pstmt.setInt(5, unitOfMeasure);
			pstmt.setDouble(6, unitprice);
			pstmt.setString(7, description);
			pstmt.executeUpdate();
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	//
	public void update(String name, int categoryid, double pPrice, int pUnitInStock, int productid){
		String sql = "UPDATE products set productname = ?, categoryid = ?, unitprice = ?, unitinstock = ? "
				+ "WHERE(productid = ?)";
		
		try (Connection conn = connect();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, name);
			pstmt.setInt(2, categoryid);
			pstmt.setDouble(3, pPrice);
			pstmt.setInt(4, pUnitInStock);
			pstmt.setInt(5, productid);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void delete( int productid){
		String sql = "DELETE FROM products WHERE productid = ? ";
		
		try (Connection conn = connect();
		PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setInt(1, productid);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public Vector<Category> getAllCategories(){
		String sql = "SELECT * FROM categories";
		Vector<Category> categoryList = new Vector<>();
		try (Connection conn = connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				
				Category cat = new Category(rs.getInt("categoryid"),rs.getString("categoryname")) ;
				categoryList.add(cat);
				
				
			}
			return categoryList;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return null;
	}

}


