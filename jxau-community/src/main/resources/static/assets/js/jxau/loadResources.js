function publishPd() {
    var content = $("#content").val();
    if (content.length == 0) {
        alert("请输入此刻想法...");
        return;
    }
    $.ajax({
        type: "POST",
        url: "/loadResources",
        success:function (messageModel) {
            if(messageModel.code==200){
                var result=messageModel.data;
                //$.cookie("username",result.username);
                // $.cookie("trueName",result.trueName);
                // $.cookie("userId",result.userId);
                //window.location.href="pulishPersonalDynamic";
                alert(messageModel.msg);
            }else {
                alert(messageModel.msg);
            }
        },
        error: function (publish) {
            console.log("发生错误：" + publish.status);
        }
    });
}