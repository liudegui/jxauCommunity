function loading() {
    $.ajax({
        type: "POST",
            url: "/loadResources",
        success:function (messageModel) {
            if(messageModel.code==200){
                var data=messageModel.data;
                //alert(data[1].comment[0].commContent);
                for (var num in data){
                    $("#showData").append("<table style=\"border-collapse:separate; border-spacing:0px 10px; border:1px solid #000000;\" width=\"60%\" align=\"center\">\n" +
                        "        <tr>\n" +
                        "            <td>\n" +
                        "             <span>\n" +
                        "                <font color=\"#191970\" size=\"3px\"><b>"+data[num].studID+"</b></font>\n" +
                        "                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "                <font>"+data[num].postDate+"</font>\n" +
                        "                <hr/>\n" +
                        "            </span>\n" +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "        <tr>\n" +
                        "            <td>\n" +
                        "                <p>"+data[num].postContent+"</p>\n" +
                        "                <hr>\n" +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "        <tr>\n" +
                        "            <td>\n" +
                        "                <input style=\"width:90%;\" type=\"text\" id=\"comment\" maxlength=\"20\" placeholder=\"写评论...\">\n" +
                        "                <button onclick=\"comment(this)\">评论</button>\n" +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "        <tfoot>\n" +
                        "\n" +
                        "        <td >\n" +
                        "            <!--            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-->\n" +
                        "            <span><font><b>unique</b></font><b> : </b></span>\n" +
                        "            <span style=\"align-items: start\">英语协会招新</span>\n" +
                        "            <br/>\n" +
                        "            <span><font><b>admin</b></font><b> : </b></span>\n" +
                        "            <span style=\"align-items: start\">志愿者协会招新</span>\n" +
                        "            <!--            <input id=\"hf\" type=\"text\" name=\"hf\" maxlength=\"20\" >-->\n" +
                        "            <!--            <button onclick=\"\">回复</button>-->\n" +
                        "        </td>\n" +
                        "        <!--        <td align=\"right\" style=\"width:30%;\">-->\n" +
                        "        <!--            -->\n" +
                        "        <!--        </td>-->\n" +
                        "        </tfoot>\n" +
                        "\n" +
                        "    </table>\n" +
                        "    <hr color=\"green\"/>");
                }

            }else {
                alert(messageModel.msg);
            }
        },
        error: function (publish) {
            console.log("发生错误：" + publish.status);
        }
    });
}