package team.ed.objects;

import team.ed.controllers.Register;
import team.ed.storage.Database;
import team.ed.views.View;

public class Main {
    public static void main(String[] args) {

        Register register = new Register();
        register.register();

    }

}
