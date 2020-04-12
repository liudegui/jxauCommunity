function submitLostInfo() {
    $.ajax({
        type: "post",
        url: "/insertLost",
        data: {
            lostType: $("#lostType").val(),
            lostName: $("#lostName").val(),
            lostDesc: $("#lostDesc").val(),
            lostContact: $("#lostContact").val(),
            lostAddr: $("#lostAddr").val(),
        },
        datatype: "json",
        xhrFields: {
            withCredentials: true // 这里设置了withCredentials
        },
        success: function (messageModel) {
            if (messageModel.code == 200) {
                var result = messageModel.result;
                $.cookie("username", result.userName, {path: '/'});
                //$.cookie("userId",result.userId);
                window.location.href = "main";
            } else {
                alert(messageModel.msg);
            }
        }
    })
}