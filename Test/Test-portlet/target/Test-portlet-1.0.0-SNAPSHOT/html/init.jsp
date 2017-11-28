<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page
	import="net.opentrends.training.service.service.EmployeeLocalServiceUtil"%>
<%@page import="net.opentrends.training.service.model.Employee"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileVersion"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>

<portlet:defineObjects />
