     function myFunction() {

         document.getElementById("test").innerHTML = "ddddddw22332d";
     }


     $(function(){

        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
        var socket = new WS("@routes.Application.wsInterface().webSocketURL(request)")

        var sendMessage = function(){
              socket.send($("#socket-input").val())
              $("#socket-input").val('')
        }


        var writeMessages = function(event){
             $("#socket-messages").html("Last ping: "+event.data);
        }


         var handleReturnKey = function(e) {
                if(e.charCode == 13 || e.keyCode == 13) {
                    //e.preventDefault()
                    sendMessage()
                }
         }

        $("#socket-input").keypress(handleReturnKey)
        socket.onmessage = writeMessages



    })