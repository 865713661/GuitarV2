<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid" align=center>
	<div class="row-fluid">
		<div class="span12">
			<table class="table">
				<thead>
					<tr>
						<th>
							编号
						</th>
						<th>
							品牌
						</th>
						<th>
							类型
						</th>
						<th>
							价格
						</th>
						<th>
						生产商
						</th>
							<th>
						前面板
						</th>
							<th>
						后面板
						</th>
					</tr>
				</thead>
				<tbody>
				 <s:iterator id="list" value="#request.list">
					<tr>
						<td>
						<s:property value="#list.id"/>
						</td>
						<td>
							<s:property value="#list.guitarspec.type"/>
						</td>
						<td>
							<s:property value="#list.guitarspec.model"/>
						</td>
						<td>
							<s:property value="#list.price"/>
						</td>
						<td>
						<s:property value="#list.guitarspec.builder"/>
						</td>
						<td>
						<s:property value="#list.guitarspec.topwood"/>
						</td>
						<td>
						<s:property value="#list.guitarspec.backwood"/>
						</td>
					</tr>
					</s:iterator>
					
				</tbody>
			</table>
			<div class="row-fluid">
				<div class="span4">
				</div>
				<div class="span4">
				</div>
				<div class="span4">
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>