<%@page
	import="com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil"%>
<%@page
	import="com.liferay.portlet.dynamicdatamapping.model.DDMTemplate"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page
	import="com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil"%>
<%@page
	import="com.liferay.portlet.dynamicdatamapping.model.DDMStructure"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="javax.portlet.PortletPreferences"%>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>

<%@include file="/html/news/init.jsp"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>

<portlet:defineObjects />
<theme:defineObjects />
<%
	PortletPreferences preferences = renderRequest.getPreferences();
	String portletResource = ParamUtil.getString(request, "portletResource");
	if (Validator.isNotNull(portletResource)) {
		preferences = PortletPreferencesFactoryUtil.getPortletSetup(request, portletResource);
	}
	String structureId = preferences.getValue("structureId", StringPool.BLANK);
	List<DDMStructure> structureList = DDMStructureLocalServiceUtil
			.getStructures(themeDisplay.getScopeGroupId());
	String templateId = preferences.getValue("templateId", StringPool.BLANK);
	List<DDMTemplate> templateList = null;
	if (!structureId.isEmpty()) {
		templateList = DDMTemplateLocalServiceUtil.getTemplates(Long.parseLong(structureId));
	}
%>
<%-- <aui:script>
function getTemplates(){
	var structure=document.getElementById("structure");
	if(structure!=null){
		
	}
	
}
</aui:script> --%>
	





<liferay-portlet:actionURL var="configAction"
	portletConfiguration="true" />
<aui:form action="<%=configAction%>" method="post" name="configForm">
	<aui:select name="structure">
		<aui:option value="">Select Structure</aui:option>
		<%
			for (DDMStructure structure : structureList) {

						if (structure.getStructureId() == (structureId.isEmpty() ? 0 : Long.parseLong(structureId))) {
		%>
		<aui:option value="<%=structure.getStructureId()%>" selected="true"><%=structure.getName()%></aui:option>
		<%
			} else {
		%>
		<aui:option value="<%=structure.getStructureId()%>"><%=structure.getName()%></aui:option>

		<%
			}
					}
		%>

	</aui:select>
	<aui:select name="template">
		<aui:option value="">Select Template</aui:option>
		<%
			if (templateList != null) {
						for (DDMTemplate template : templateList) {
							
								if (template.getTemplateId() == (templateId.isEmpty()?0:Long.parseLong(templateId))) {
		%>
		<aui:option value="<%=template.getTemplateId()%>" selected="true"><%=template.getName()%></aui:option>
		<%
			} else {
		%>
		<aui:option value="<%=template.getTemplateId()%>"><%=template.getName()%></aui:option>

		<%
			}
							

						}
					}
		%>

	</aui:select>
	<input type="submit" value="Save">
</aui:form>
