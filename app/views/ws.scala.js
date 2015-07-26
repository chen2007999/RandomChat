
$(function(){

        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS("@routes.Application.wsInterface().webSocketURL(request)")


        var writeMessages = function(event){
            if(event.data.localeCompare("NEW UNREAD PLEASE CHECK.") == 0) {

               var unread = document.getElementById("unread").value;
               var unreadNum = unread.substring(7);
               var unreadNumInt = parseInt(unreadNum);
               unreadNumInt = unreadNumInt + 1;
               var unreadNumStr = unreadNumInt.toString();
               document.getElementById("unread").value="Unread " + unreadNumStr;

            } else if (event.data.localeCompare("PLEASE REMOVE ONE UNREAD.") == 0){

               var unread = document.getElementById("unread").value;
               var unreadNum = unread.substring(7);
               var unreadNumInt = parseInt(unreadNum);
               unreadNumInt = unreadNumInt - 1;
               var unreadNumStr = unreadNumInt.toString();
               document.getElementById("unread").value="Unread " + unreadNumStr;

            }else {
                $('#socket-messages').append('<p>'+event.data+'</p>');
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
