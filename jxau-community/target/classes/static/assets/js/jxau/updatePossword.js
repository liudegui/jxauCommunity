function updatePwd() {

    oldPassword = $("#oldPassword").val();
    newPassword = $("#newPassword").val();
    confirmPassword = $("#confirmPassword").val();
    var params = {};
    params.oldPassword = oldPassword;
    params.newPassword = newPassword;
    params.confirmPassword = confirmPassword;

    if (oldPassword.length == 0) {
        alert("原密码不能为空");
        return;
    }

    if (newPassword.length == 0) {
        alert("新密码不能为空");
        return;
    }

    if (confirmPassword.length == 0) {
        alert("确认密码不能为空");
        return;
    }

    if (newPassword != confirmPassword) {
        alert("两次密码不一致");
        return;
    }
    $.ajax({
        type: "post",
        url: "/updatePwd",
        data: {
            oldPassword: $("#oldPassword").val(),
            newPassword: $("#newPassword").val(),
            confirmPassword: $("#confirmPassword").val()
        },
        datatype: "json",
        xhrFields: {
            withCredentials: true // 这里设置了withCredentials
        }
        ,
        success: function (messageModel) {
            if (messageModel.code == 200) {
                alert(messageModel.msg);
            } else {
                alert(messageModel.msg);
            }
        }
    })
}