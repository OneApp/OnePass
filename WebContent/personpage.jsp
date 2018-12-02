<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Rectangle Mobile Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/personpage.css">
    </head>
    <body>
        <!-- 顶部start -->
		<jsp:include page="header.jsp"/>
		<!-- 顶部end -->
		
     <div class="site-bg"></div>
        <div class="site-bg-overlay"></div>
        <div class="container" id="page-content">
            <div class="row">
				
				<!-- 左导航开始 -->
				  <div class="col-md-3 hidden-sm">  
                    <nav id="nav" class="main-navigation hidden-xs hidden-sm">
                        <ul class="main-menu">
                            <li>
                                <a class="show-1 active homebutton" href="#"></i>Home</a>
                            </li>
                            <li>、
                                <a class="show-2 aboutbutton" >二级隐私</a>
                            </li>
                            <li>
                                <a class="show-3 projectbutton" href="#"></i>三级隐私</a>
                            </li>
                           
                        </ul>
                    </nav>
                </div>
                 
				<!-- 左导结束-->
				
				<!-- 右部主体开始 -->
                <div class="col-md-9 col-sm-12 content-holder">
                    <!-- CONTENT -->
                    <div id="menu-container">
                        <div class="logo-holder logo-top-margin">
                          <a href="#" class="site-brand">ONEPASS</a>
                        </div>
  						
  						<!-- 一级隐私开始 -->
                        <div id="menu-1" class="homepage home-section text-center">
                            <div class="welcome-text">
                                <h2>Hello, Welcome to <strong>onepass person page</strong></h2>
                            <div class="box-content">
                                <h3 class="widget-title">基本信息</h3>
    
                                <table>
									<tr>
 										<td rowspan="3" style="width:200px; text-align:left;">头像</td>
 										<td  style="width:200px;height:50px; text-align:left;">用户名</td>
 										<td  style="width:200px;height:50px; text-align:left;"> 出生年月日 （阴历 阳历） </td>	
									</tr>
									<tr>
										<td  style="width:200px;height:50px; text-align:left;">身高 </td>
										<td  style="width:200px;height:50px; text-align:left;">体重</td>		
									</tr>
									
									<tr>
										<td  style="width:200px;height:50px; text-align:left;">专业 </td>
										<td  style="height:20px; text-align:left;">兴趣爱好 </td>	
										
									</tr>
									<tr>
										<td colspan="3"  style="height:50px; text-align:left;">个性签名  </td>	
									</tr>
									
								</table>
					     </div>
                            </div>
                        </div>
						<!-- 一级隐私结束-->
						
						<!-- 二级隐私开始-->
                       <div id="menu-2" class="content about-section">
                            <div class="box-content">
                                <h3 class="widget-title">二级隐私</h3>
                         		 <table>
									<tr>
 										<td rowspan="3" style="width:200px; text-align:left;">证件照</td>
 										<td  style="width:200px;height:50px; text-align:left;">国家 </td>
 										<td  style="width:200px;height:50px; text-align:left;">民族</td>	
									</tr>
									<tr>
										<td  style="width:200px;height:50px; text-align:left;"> 性别  </td>
										<td  style="width:200px;height:50px; text-align:left;"> 血型</td>		
									</tr>
									
									<tr>
										<td  style="width:200px;height:50px; text-align:left;">  是否已婚 </td>
										<td  style="width:200px;height:20px; text-align:left;">是否服兵役 </td>	
										
									</tr>
									<tr>
										<td  style="width:200px;height:50px; text-align:left;"> 政治面貌      </td>
										<td  style="width:200px;height:20px; text-align:left;"> 学历 </td>	
										<td  style="width:200px;height:50px; text-align:left;"> 职业  </td>	
									</tr>
									<tr>
										<td  style="width:200px;height:50px; text-align:left;">    qq号         </td>
										<td  style="width:200px;height:20px; text-align:left;">  微信  </td>	
										<td  style="width:200px;height:50px; text-align:left;"> 工资   </td>	
									</tr>
								</table>
                            </div>
                        </div>
						<!-- 二级隐私结束-->
						
						<!-- 三级隐私开始-->
                        <div id="menu-3" class="content gallery-section">
                            <div class="box-content">
                                <h3 class="widget-title">三级隐私</h3>
                               	 <table>
                               	 	<tr><td colspan="3"  style="height:50px; text-align:left;">账号 </td>	</tr>
									<tr>
 										<td  style="width:200px;height:50px;text-align:left;">姓名</td>
 										<td  style="width:200px;height:50px; text-align:left;">身份证号 </td>
 									
									</tr>
									<tr>
										<td  style="width:200px;height:50px; text-align:left;">  籍贯   </td>	
										<td colspan="3"  style="height:50px; text-align:left;">当前所在地  </td>	
									</tr>
									<tr>
										<td  style="width:200px;height:50px; text-align:left;"> 手机号  </td>	
										<td colspan="3"  style="height:50px; text-align:left;">       邮箱   </td>	
									</tr>
								</table>
                            </div>
                        </div>
						<!-- 三级隐私结束-->
						
                    </div>
                </div>
				<!-- 右部主体结束 -->

              
                
            </div>
        </div>
<!-- 底部start -->
<jsp:include page="footer.jsp"/>
<!-- 底部end -->    
     
        <script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
        
		 <script src="js/modernizr-2.6.2.min.js"></script>
      
    
        <script src="js/personmain.js"></script>
		
    </body>
</html>