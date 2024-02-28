package team.ed.objects;

import team.ed.storage.Database;
import team.ed.views.View;

public class Main {
    public static void main(String[] args) {

        View.showHeaderPrincipal();
        View.showMenuPrincipal();
        View.showGetOption();

        int option = View.getOption();
        System.out.println("La opción digitada fue: "+ option);

    }

}
