package team.ed.views;

import team.ed.objects.Product;

import java.util.List;
import java.util.Scanner;

public class View {

    public static void showHeaderPrincipal(){

        System.out.println("\t\t****************************************");
        System.out.println("\t\t* Bienvenido a mi caja registradora :D *");
        System.out.println("\t\t****************************************");
    }

    public static void showMenuPrincipal(){

        System.out.println("\t\t 1. Comprar");
        System.out.println("\t\t 2. Vender");
        System.out.println("\t\t 3. Inventario");
        System.out.println("\t\t 4. Compras");
        System.out.println("\t\t 5. Ventas");
        System.out.println("\t\t 6. Salir");
    }

    public static void showGetOption(){

        System.out.print("\t\t Digita la opción: ");
    }

    public static int getOption(){

        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static int getAmount(){

        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static double getPrice(){

        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }


    // digite la cantidad
    public static void showGetAmount(){
        System.out.print("\t\t Digite la cantidad: "); // sin ln, el ln significa salto de línea
    }


    // digite el precio para cuando realice la compra
    public static void showGetPrice(){
        System.out.print("\t\t Digite el precio: "); // sin ln, el ln significa salto de línea
    }


    public static void showBuyHeader(){
        System.out.println("\t\t*************************************");
        System.out.println("\t\t*          MENÚ DE COMPRAS          *");
        System.out.println("\t\t*************************************");
        showItemsMenu();
    }


    // menú de ventas
    public static void showSalesHeader(){
        System.out.println("\t\t************************************");
        System.out.println("\t\t*          MENÚ DE VENTAS          *");
        System.out.println("\t\t************************************");
        showItemsMenu();
    }

    // menú inventario
    public static void showStockHeader(){
        System.out.println("\t\t****************************************************");
        System.out.println("\t\t*                    INVENTARIO                    *");
        System.out.println("\t\t****************************************************");
        showItemsHeader();
    }

    // menú item header
    public static void showItemsHeader(){
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t* PRODUCTO\t| Cantidad\t| Vr Unitario\t| Vr Total\t*");
        System.out.println("\t\t****************************************************");
    }

    // menú header litado de compras
    public static void showBuyListHeader(){
        System.out.println("\t\t*************************************");
        System.out.println("\t\t*              COMPRAS              *");
        System.out.println("\t\t*************************************");
        showItemsHeader();
    }

    // menú header litado de ventas
    public static void showSaleListHeader(){
        System.out.println("\t\t**************************************");
        System.out.println("\t\t*               VENTAS               *");
        System.out.println("\t\t**************************************");
        showItemsHeader();
    }
    // listado de producto que tiene para comprar
    public static void showItemsMenu(){
        System.out.println("\t\t\t1. Papas");
        System.out.println("\t\t\t2. Arroz");
        System.out.println("\t\t\t3. Carne");
        System.out.println("\t\t\t4. Volver");
    }

    public static void Thanks(){

        System.out.println("Gracias por utilizar mi app :)");
    }

    public static void showInvalidOption(){

        System.out.println("Opción no válida");
    }

    public static void showGetBack(String name){
        System.out.println("\t\t\tSaliendo del módulo..."+ name);
    }

    public static void showAnyKey(){
        System.out.println("Digite cualquier número para continuar: ");
    }


    public static void showItemsStock(Product[] products){

        for (Product v : products){
            System.out.println("\t\t* "+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()+"\t\t*");
        }
    }

    public static void showInvalidAmount(){
        System.out.println("La cantidad no es válida");
    }


    public static void showPurchases(List<Product> listado){

        for (Product v : listado){
            System.out.println("\t\t* "+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()+"\t\t*");
        }
    }

    public static void showSales(List<Product> listado){

        for (Product v : listado){
            System.out.println("\t\t* "+v.getName()+"\t| "+v.getAmount()+"\t\t| "+v.getPrice()+"\t\t\t| "+v.getAmount()*v.getPrice()*1.25+"\t\t*");
        }
    }


}
