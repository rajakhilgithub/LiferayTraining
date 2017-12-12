<%@page import="com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil"%>
<%@page import="com.liferay.portlet.dynamicdatamapping.model.DDMTemplate"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portlet.journalcontent.util.JournalContentUtil"%>
<%@page import="com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil"%>
<%@page import="com.liferay.portlet.journal.model.JournalArticle"%>
<%@page import="javax.portlet.PortletPreferences"%>
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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<portlet:defineObjects />
<theme:defineObjects />
<%
PortletPreferences preferences=renderRequest.getPreferences();
String portalResources=request.getParameter("portalResources");
if(Validator.isNotNull(portalResources)){
	preferences=PortletPreferencesFactoryUtil.getPortletSetup(request, portalResources);
}
String structureId=preferences.getValue("structureId", StringPool.BLANK);
String templateId=preferences.getValue("templateId",StringPool.BLANK);

%>
<div align="center"><h1>Automobile News</h1></div>
<%
if(Validator.isNotNull(structureId)&&Validator.isNotNull(templateId)){
	DDMStructure structure=DDMStructureLocalServiceUtil.getStructure(Long.parseLong(structureId));
	DDMTemplate template=DDMTemplateLocalServiceUtil.getTemplate(Long.parseLong(templateId));
	List<JournalArticle> articleList=JournalArticleLocalServiceUtil.getStructureArticles(themeDisplay.getScopeGroupId(), structure.getStructureKey());
	for(JournalArticle article:articleList){
		String content=JournalContentUtil.getContent(themeDisplay.getScopeGroupId(), article.getArticleId(), template.getTemplateKey(), LiferayWindowState.NORMAL.toString(), themeDisplay.getLanguageId(), themeDisplay);
	if(JournalArticleLocalServiceUtil.isLatestVersion(themeDisplay.getScopeGroupId(), article.getArticleId(), article.getVersion())){
	%>
	<div><%=content %></div>
	<%
	}
	}
}

%>



