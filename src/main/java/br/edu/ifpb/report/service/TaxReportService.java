package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.TaxReport;

/**
 * @author andreia
 *
 */
public class TaxReportService extends ReportService {

	@Override
	protected Report makeReport() {
		return new TaxReport();
	}

}
