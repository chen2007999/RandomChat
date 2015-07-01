package controllers;
import models.*;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Client currentClient;

    // index to landing page by default
    public static Result index() {
        return redirect(routes.Application.landing());
    }

    public static Result landing() {
        currentClient = null;
        return ok(landing.render());
    }

    // get the information that the user just typed
    public static Client getUser() {
        play.data.Form<Client> userForm = play.data.Form.form(Client.class);
        return userForm.bindFromRequest().get();
    }

    // methods deal with user account
    public static  Result createUser() {

        Client client = getUser();
        if(Client.checkNull(client) || Client.checkEmpty(client)){
            return redirect(routes.Application.register("Empty details"));
        } else if(!client.emailFormat()){
            return redirect(routes.Application.register("Wrong email format"));
        } else if(!Client.checkPasswordConsistency(client)){
            return redirect(routes.Application.register("Passwords do not match"));
        } else if(Client.userEmailExists(client)){
            return redirect(routes.Application.register("Client with email " + client.email + " already exists"));
        }
        Client.createUser(client);
        currentClient = client;
        return ok(mainPage.render());
    }

    public static  Result deleteUserFromDB(String email) {
        Client.deleteUser(email);
        return redirect(routes.Application.displayAllUsersFromDB());
    }

    public static  Result displayAllUsersFromDB() {
        return ok(registration.render(Client.find.findList(), ""));
    }

    public static Result logIn() {
        Client client = getUser();
        if(Client.validate(client)) {
            currentClient = Client.findUser(client);
            return ok(mainPage.render());
        }
        return ok(landing.render());
    }

    public  static Result register(String error) {
        return ok(registration.render(Client.find.findList(), error));
    }
}
