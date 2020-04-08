function userLogin() {
    var username=$("#username").val();
    var password=$("#password").val();
    if(username.length==0){
        alert("用户名不能为空！");
        return;
    }
    if(password.length==0){
        alert("密码不能为空！");
        return;
    }
    var params={};
    params.username=username;
    params.password=password;
    $.ajax({
        type:"post",
        url:"/login",
        data:params,
        datatype:"json",
        success:function (messageModel) {
            if(messageModel.code==200){
                var result=messageModel.result;
                $.cookie("username",result.username);
                //$.cookie("userId",result.userId);
                window.location.href="main";
            }else {
                alert(messageModel.msg);
            }
        }
    })
}