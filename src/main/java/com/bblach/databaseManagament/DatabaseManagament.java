package com.bblach.databaseManagament;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bblach.products.Product;


public class DatabaseManagament {
	
	private static final String DB_NAME = "food.db";
	private static final String CONNECTION_STRING = "/home/mrr/eclipse_workspace/meal_planer/electronicnyPlanatorZarelka";
	private static final String TABLE_PRODUCTS="producst";
	private static final String COLUMN_ID="id";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_CALORIES="calories";
	private static final String COLUMN_PROTEINS="proteins";
	private static final String COLUMN_FATS="fats";
    private static final String COLUMN_CARBS="carbs";
    
	private Connection connection;
	
	public void openDbConnection(){
		try {
			connection=DriverManager.getConnection(CONNECTION_STRING);
		} catch (SQLException e) {
			System.out.println("Cannot establish connection with " + DB_NAME);
			e.getMessage();
			
		}
	}
	public void closeDbConnection(){
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Couldn't close the connection with " + DB_NAME);
			e.getMessage();
		}
	}
	
	public List<Product> querryProducts(){
		
		try(Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_PRODUCTS);){
			List<Product> products = new ArrayList<>();
			while (results.next()){
				return products;
			}
		}catch(SQLException e){
			e.getMessage();
		}
		return null;
	}
	
	
	public void insertProduct(Statement statement, Product newProduct){
		StringBuilder iq = new StringBuilder("INSERT INTO ");
		iq.append(TABLE_PRODUCTS);
		iq.append("(");
		iq.append(COLUMN_NAME + " , ");
		iq.append(COLUMN_CALORIES + " , ");
		iq.append(COLUMN_PROTEINS + " , ");
		iq.append(COLUMN_FATS + " , ");
		iq.append(COLUMN_CARBS + " , ");
		iq.append(")");
		iq.append("VALUES( '" + newProduct.getName() + "' , " + newProduct.getCalories());
		iq.append(" , '"  +  newProduct.getProteins() +"' , "  + newProduct.getFats() +"' , "+ newProduct.getCarbs()+  "') ");
			
	}
}
