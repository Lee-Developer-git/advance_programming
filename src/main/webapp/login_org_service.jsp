<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.orgDAO" %>

<%!
		private String oid;
		private String orgPassword;
		private String orgName;
		public String getOid(){return oid;}
		public String getOrgPassword(){return orgPassword;}
		public String getOrgName(){return orgName;}
%>
<%
		//��ü ����
		orgDAO orgDAO = new orgDAO();
		int result = orgDAO.login(oid, orgPassword);
		
		//�α��� ����
		if(result == 1){
			session.setAttribute("oid", orgName);
			PrintWriter script = response.getWriter();
			script.println("<script>location.href = 'org_mypage.jsp'</script>");
		}
		//�α��� ����
		else if(result == 0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('��й�ȣ�� Ʋ���ϴ�.')");
			script.println("history.back()");
			script.println("</script>");
		}
		//���̵� ����
		else if(result == -1){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('�������� �ʴ� ���̵� �Դϴ�.')");
		script.println("history.back()");
		script.println("</script>");
		}
		//DB����
		else if(result == -2){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('DB������ �߻��߽��ϴ�.')");
		script.println("history.back()");
		script.println("</script>");
		}
%>