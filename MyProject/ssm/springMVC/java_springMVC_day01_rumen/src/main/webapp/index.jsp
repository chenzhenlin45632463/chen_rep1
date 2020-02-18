<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<br>
<h2>Hello World!</h2>

<a href="myController/find">入门小程序</a>


<form action="myController/user" method="post">
    <input type="text" name="name" value="陈巍"></br>
    <input type="text" name="password" value="23423"></br>
    <input type="text" name="email" value="cw@163.com"></br>
    <input type="text" name="age" value="24"></br>
    <input type="submit" value="提交"></br>
</form>

<a href="myController/user?name='yangYang'&email=combok&password=1234">再测试</a></br>

<a href="myController/servletApi">测试原生api</a></br>

<%--测试requestBody注解--%>

<a href="myController/requestBodyTest?telName='陈巍'&email='cw@'&address='广安'">get方式测试requestBody</a></br>

post方式测试requestBody
<form action="myController/requestBodyTest" method="post">
    <input type="text" name="telName" value="陈镇霖"></br>
    <input type="text" name="email" value="czl@"></br>
    <input type="text" name="address" value="成都"></br>
    <input type="submit"  value="提交数据">
</form>

测试注解在方法上的@ModelAttribute
<form action="anNo/testModelAttribute" method="post">
    name:<input type="text" name="Name" value="令狐冲"></br>
    email:<input type="text" name="email" value="lhc@"></br>
   <%-- password:<input type="text" name="password" value="陕西华山"></br>
    age:<input type="text" name="age" value="500"></br>--%>
    <input type="submit"  value="上传用户信息">
</form>

测试SessionAttributes<br>
<a href="anNo/testPut">设置参数</a></br>
<a href="anNo/testGet">获取参数</a></br>
<a href="anNo/testClean">清空</a></br>
<a href="anNo/testZongHe?name=陈陈&email=陈陈.com">综合测试</a></br>
</body>
</html>
