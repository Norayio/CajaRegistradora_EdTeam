package team.ed.controllers;

import team.ed.storage.Database;
import team.ed.views.View;

public class Register {

    private Database database;

    public Register(){ // constructor
        database = new Database();
    }

    // register inicia el proceso de la registradora;
    public void register(){

        int option;
        View.showHeaderPrincipal();
        View.showMenuPrincipal();

        do {
            View.showGetOption();
            option = View.getOption();

            switch (option){
                case 1:
                    View.showBuyHeader();
                    break;

                case 2:
                    View.showSalesHeader();
                    break;

                case 3:
                    View.showStockHeader();
                    break;

                case 4:
                    View.showBuyListHeader();
                    break;

                case 5:
                    View.showSaleListHeader();
                    break;

                case 6:
                    View.Thanks();
                    // TODO agregar la salida del sistema;
                    break;

                default:
                    View.showInvalidOption();
                    break;
            } //


        }while (option < 1 || option > 6);
    }





}
