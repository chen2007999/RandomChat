
$(function(){

        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS("@routes.Application.wsInterface().webSocketURL(request)")


        var writeMessages = function(event){
            if(event.data.localeCompare("NEW UNREAD PLEASE CHECK.") == 0) {

               var unread = document.getElementById("unread").value;
               var unreadNum = unread.substring(7);
               var unreadNumInt = parseInt(unreadNum);
               unreadNumInt = unreadNumInt + 1;
               if(unreadNumInt == 0) {
                    document.getElementById("unread").className = "grey";
               } else {
                    document.getElementById("unread").className = "red";
               }
               var unreadNumStr = unreadNumInt.toString();
               document.getElementById("unread").value="Unread " + unreadNumStr;

            } else if (event.data.localeCompare("PLEASE REMOVE ONE UNREAD.") == 0){

               var unread = document.getElementById("unread").value;
               var unreadNum = unread.substring(7);
               var unreadNumInt = parseInt(unreadNum);
               unreadNumInt = unreadNumInt - 1;
               if(unreadNumInt == 0) {
                     document.getElementById("unread").className = "grey";
                } else {
                     document.getElementById("unread").className = "red";
                }
               var unreadNumStr = unreadNumInt.toString();
               document.getElementById("unread").value="Unread " + unreadNumStr;

            }else {
                var x1 =  Boolean(event.data.indexOf("Waiting to be connected to a user.") > -1);
                var x2 =  Boolean(event.data.indexOf("waiting to be connected to the next user.") > -1);
                var x3 = Boolean(event.data.indexOf("just left, waiting to be connected to the next user.") > -1);
                var x4 =  Boolean(event.data.indexOf("Just got connected to") > -1);
                var otherProfile = document.getElementById('other');
                if(x1 || x2 || x3) {
                     otherProfile.style.display="none";
                }
                if(x4) {
                     otherProfile.style.display="";
                }
                $('#socket-messages').append('<p>'+event.data+'</p>');
                var objDiv = document.getElementById("socket-messages");
                objDiv.scrollTop = objDiv.scrollHeight;
            }

        }

         socket.onmessage = writeMessages;


        $('#socket-input').keyup(function(event){

             var charCode = (event.which) ? event.which : event.keyCode ;

            // if enter (charcode 13) is pushed, send message, then clear input field
            if(charCode === 13){
              socket.send($(this).val());
              $(this).val('');
            }
        });


});
