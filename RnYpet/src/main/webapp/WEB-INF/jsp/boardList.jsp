<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!-- 게시글목록  -->
<!--blog start -->
<c:forEach var = "board" items = "${boardList}" >
		<section id="blog" class="blog">
			<div class="container">
				<div class="section-header">
					<h2>NOTICE</h2>
				</div><!--/.section-header-->
				<div class="blog-content">
					<div class="row">
						<div class="col-sm-4">
							<div class="single-blog">
								<div class="single-blog-img">
									<img src="assets/images/blog/b1.jpg" alt="blog image">
									<div class="single-blog-img-overlay"></div>
								</div>
								<div class="single-blog-txt">
									<h2><a href="#">공지사항제목</a></h2>
									<h3>By <a href="#">작성자</a> / 작성일자</h3>
									<p>
										공지사항 내용
									</p>
								</div>
							</div>
						</div>	
			</div><!--/.container-->
		</section><!--/.blog-->
		</c:forEach>
		<!--blog end -->
