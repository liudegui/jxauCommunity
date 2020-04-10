function comment() {
    var comment = $("#comment").val();
    if (comment.length == 0) {
        alert("请输入你的评论...");
        return;
    }
    $.ajax({
        type: "POST",
        url: "/comment",
        dataType: "json",
        data: {
            comment: $("#comment").val(),
        },
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