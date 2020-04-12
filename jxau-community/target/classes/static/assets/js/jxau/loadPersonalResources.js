function loading() {
    $.ajax({
        type: "POST",
        url: "/loadPersonalResources",
        success: function (messageModel) {
            if (messageModel.code == 200) {
                var data = messageModel.data;
                //alert(data[1].comment[0].commContent);
                for (var num in data) {
                    var dataDiv = "";
                    var commentDiv = "";
                    var postDiv = "";
                    postDiv = "<div><table style=\"border-collapse:separate; border-spacing:0px 10px; border:1px solid #000000;\" width=\"60%\" align=\"center\">\n" +
                        "        <tr>\n" +
                        "            <td>\n" +
                        "             <span>\n" +
                        "                <font color=\"#191970\" size=\"3px\"><b>" + data[num].studID + "</b></font>\n" +
                        "                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                <font>" + data[num].postDate + "</font>\n" +
                        "                <hr/>\n" +
                        "            </span>\n" +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "        <tr>\n" +
                        "            <td>\n" +
                        "                <p>" + data[num].postContent + "</p>\n" +
                        "                <hr>\n" +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "        <tr>\n" +
                        "            <td>\n" +
                        "                <input style=\"width:90%;\" type=\"text\" name=\"comment\" maxlength=\"20\" placeholder=\"写评论...\">\n" +
                        "                <button value='" + data[num].postID + "' onclick=\"comment(this)\">评论</button>\n" +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "    <hr color=\"green\"/></table></div> <div class='comment'>"

                    for (var i in data[num].comment) {

                        if (data[num].comment[i].commID != null) {
                            commentDiv = commentDiv +
                                "        <span><font><b>" + data[num].comment[i].studID + "</b></font><b> : </b></span>\n" +
                                "        <span>" + data[num].comment[i].commContent + "</span>\n" +
                                "    <br/>";
                        }
                    }
                    dataDiv = postDiv + commentDiv + "</div>";
                    $("#showData").append(dataDiv);
                }


            } else {
                alert(messageModel.msg);
            }
        },
        error: function (publish) {
            console.log("发生错误：" + publish.status);
        }
    });
}