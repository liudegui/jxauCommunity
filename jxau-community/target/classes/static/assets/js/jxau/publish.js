function publishPd() {
    var content = $("#content").val();
    if (content.length == 0) {
        alert("请输入此刻想法...");
        return;
    }
    $.ajax({
        type: "POST",
        url: "/pulishPersonalDynamic",
        dataType: "json",
        data: {
            content: $("#content").val(),
        },
        success:function (messageModel) {
            if(messageModel.code==200){
                var result=messageModel.data;
                alert(messageModel.msg);
                $("#content").innerHTML="";
                location.reload();
            }else {
                alert(messageModel.msg);
            }
        },
        error: function (publish) {
            console.log("发生错误：" + publish.status);
        }
    });
}