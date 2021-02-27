package br.edu.ifpb;

import br.edu.ifpb.report.service.ExpenseReportService;
import br.edu.ifpb.report.service.ReportService;
import br.edu.ifpb.report.service.TaxReportService;

public class Main {

	public static void main(String[] args) {

		ReportService expenseReportManager = new ExpenseReportService();
		expenseReportManager.takeReport();

		ReportService taxReportManager = new TaxReportService();
		taxReportManager.takeReport();

	}

}
