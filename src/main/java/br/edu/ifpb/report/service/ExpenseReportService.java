package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;

/**
 * @author andreia
 *
 */
public class ExpenseReportService extends ReportService {

	@Override
	protected Report makeReport() {
		return new ExpenseReport();
	}

}
