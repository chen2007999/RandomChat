package models;

import play.mvc.*;
import play.libs.*;
import play.libs.F.*;

import java.util.*;

public class RandChat {

    private static List<WebSocket.Out<String>> connections = new ArrayList<WebSocket.Out<String>>();

    public static void start(WebSocket.In<String> in, WebSocket.Out<String> out) {

    }
}
