package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;
import br.edu.ifpb.report.service.Report;

public class TaxReport extends ReportTemplate implements Report {

	private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

	@Override
	public void createDatabaseConnection() {
		System.out.println("Creating Database Connection...");
		connector.openConnection();
	}

	@Override
	public void executeQuery() {
		System.out.println("Executing MySQL Query...");
		String query = "SELECT * FROM taxes";
		connector.executeQuery(query);

	}

	@Override
	public void convert() {
		System.out.println("Converting To PDF...");

	}
	
	public void generateReport() {
		this.generate();
		
	}
}
