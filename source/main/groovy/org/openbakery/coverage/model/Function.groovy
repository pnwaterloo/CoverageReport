package org.openbakery.coverage.model
/**
 * Created by René Pirringer
 */
class Function {

	List<SourceLine> sourceLines = [];

	Function() {
	}

	String getName() {
		String code =  sourceLines.first().code.trim()
		if (code.endsWith("{")) {
			return code[0..-2].trim()
		}
		return code;
	}

	double getCoverage() {
		return SourceLine.getCoverage(sourceLines)
	}


}
