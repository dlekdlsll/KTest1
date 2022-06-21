<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../includes/header.jsp" %>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">게시판</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            	통계
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>중복된 글 개수</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<tr class="odd gradeX">
                                        <td>${countDistinct }</td>
                                    </tr>
                                </tbody>
                            </table>
                            
                            <table width="100%" class="table table-striped table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>작성일</th>
                                        <th>글 개수</th>
                                    </tr>
                                </thead>
                                <tbody>
	                                <c:forEach var="dateList" items="${description }">
	                                	<tr class="odd gradeX">
	                                        <td><c:out value="${dateList.regdate }"></c:out></td>	<!-- c:out으로 찍으면 input으로 스크립트가 들어와도 실행안함 -->
	                                        <td><c:out value="${dateList.content }"></c:out></td>
	                                    </tr>
	                                </c:forEach>
                                </tbody>
                            </table>
                            
                            <button class="btn btn-success" onclick="location.href='/board/list?pageNum=${criteria.pageNum}&amount=${criteria.amount }'">목록보기</button>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="/resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="/resources/dist/js/sb-admin-2.js"></script>

</body>

</html>
