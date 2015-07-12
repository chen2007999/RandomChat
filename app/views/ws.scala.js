$(function(){
        alert("Hello! I am an alert box!!");
        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS("@routes.Application.wsInterface().webSocketURL(request)")


        var writeMessages = function(event){
            $('#socket-messages').prepend('<p>'+event.data+'</p>');
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




     function myFunction() {
        document.getElementById("test").innerHTML = "ddddddw22332d";
     }


