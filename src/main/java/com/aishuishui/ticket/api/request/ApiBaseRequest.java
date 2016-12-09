package com.aishuishui.ticket.api.request;

import java.util.List;

import com.aishuishui.ticket.api.bean.QueryParam;
import com.aishuishui.ticket.exception.ApiException;

public abstract class ApiBaseRequest {
	public static final String METHOD_GET = "GET";
	public static final String METHOD_POST = "POST";

	protected static void addParameterSafely(List<QueryParam> parameters, String parameterName, Object parameterValue, boolean allowNull) throws ApiException {
		if (null != parameterValue) {
			parameters.add(new QueryParam(parameterName, parameterValue.toString()));
		} else {
			if (!allowNull) {
				throw new ApiException("Parameter '" + parameterName + "' is required and cannot be null.");
			}
		}
	}
}
