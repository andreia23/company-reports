package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;
import br.edu.ifpb.report.service.Report;

public class ExpenseReport extends ReportTemplate implements Report{

    private PostgreSQLDatabaseConnector connector = new PostgreSQLDatabaseConnector();

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

	@Override
	public void executeQuery() {
		System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
		
	}

	@Override
	public void convert() {
		System.out.println("Converting To XLS...");
		
	}
	
	public void generateReport() {
		this.generate();
		
	}

}
