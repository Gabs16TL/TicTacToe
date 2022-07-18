import java.util.*;

public class TicTacToe {

    //Declararemos un booleano para dar o no paso al jugador
    private static boolean first = false;
    //Luego crearemos nuestro tablero
    private static char[][] tablero = new char[3][3];
    //Agregaremos los puntajes de cada jugador
    private static int PCScore = 0;
    private static int GabsScore = 0;

    //Crearemos el metodo principal de entrada para la aplicacion
    public static void main(String[] args){
        Introduction();
    }

    public static void Introduction(){
        //Ocuparemos una instancia de Scanner para leer la informacion
        Scanner console = new Scanner(System.in);

        System.out.println();
        System.out.println("Bienvenido al Tic-Tac-Toe");
        System.out.println("Como usuario tendra asignada la X para cada jugada");
        System.out.println("Para decidir la ubicacion de su jugada debera indicarlo de la siguiente manera: 1 2");
        System.out.println("");
        System.out.println("¿Desea comenzar usted? (y/n)");
        String answer = console.nextLine();

        if(answer.substring(0,1).equalsIgnoreCase("y")){
            first = true;
        }
        //Ahora que el usuario decidio comenzar debemos mandar a crear y llamar el tablero para comenzar
        createTablero();
        printTablero();
        Start(console);
    }

    //Comenzaremos seleccionando el usuario que comenzara
    public static void Start(Scanner console)
    {
        if (first == true) {
            Gabsturn(console);
        }
        else {
            PCturn(console);
        }
    }

    //Comienza Gabs
    public static void Gabsturn(Scanner console) //Recibimos parametro de consola
    {

        System.out.println("Introduzca la posicion de su jugada de la siguiente manera: 1 3");

        int r = console.nextInt() - 1;
        int c = console.nextInt() - 1;

            if (tablero[r][c] == ' ') {
                tablero[r][c] = 'X';

                if (tablero[0][0] == 'X') {
                    printTablero();
                    GabsScore += 1;
                    checkGabsScore(console);

                } else if (tablero[0][2] == 'X') {
                    printTablero();
                    GabsScore += 3;
                    checkGabsScore(console);

                } else if (tablero[2][0] == 'X') {
                    printTablero();
                    GabsScore += 1000;
                    checkGabsScore(console);

                } else if (tablero[2][2] == 'X') {
                    printTablero();
                    GabsScore += 3000;
                    checkGabsScore(console);

                } else if (tablero[1][1] == 'X') {
                    printTablero();
                    GabsScore += 200;
                    checkGabsScore(console);

                } else if (tablero[0][1] == 'X') {
                    printTablero();
                    GabsScore += 2;
                    checkGabsScore(console);

                } else if (tablero[1][0] == 'X') {
                    printTablero();
                    GabsScore += 100;
                    checkGabsScore(console);

                } else if (tablero[1][2] == 'X') {
                    printTablero();
                    GabsScore += 300;
                    checkGabsScore(console);

                } else if (tablero[2][1] == 'X') {
                    printTablero();
                    GabsScore += 2000;
                    checkGabsScore(console);
                }

            } else if (tablero[r][c] == 'X' || tablero[r][c] == 'O') {
                first = true;
                System.out.println("Escoja un espacio vacio por favor");
                Start(console);
            }

        System.out.println("");
    }

    //Turno de la computadora
    public static void PCturn(Scanner console){

        System.out.println("Turno de la computadora");
        System.out.println("");

        if(tablero[0][0] == ' '){
            tablero[0][0] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 1;

        } else if(tablero[0][2] == ' '){
            tablero[0][2] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 3;

        } else if(tablero[2][0] == ' '){
            tablero[2][0] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 1000;

        } else if(tablero[2][2] == ' '){
            tablero[2][2] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 3000;

        } else if(tablero[1][1] == ' '){
            tablero[1][1] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 200;

        } else if(tablero[0][1] == ' '){
            tablero[0][1] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 2;

        } else if(tablero[1][0] == ' '){
            tablero[1][0] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 100;

        } else if(tablero[1][2] == ' '){
            tablero[1][2] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 300;

        } else if(tablero[2][1] == ' '){
            tablero[2][1] = 'O';
            printTablero();
            Gabsturn(console);
            PCScore += 2000;
        }


    }

    //Revisaremos los puntajes obtenidos por el usuario
    public static void checkGabsScore(Scanner console){
        if(PCScore == 3201 || PCScore == 1203 || PCScore == 6 ||
                PCScore == 600 || PCScore == 6000 || PCScore == 1101 ||
                PCScore == 2202 || PCScore == 3303){
            System.out.println("I won :p");
            Introduction();

        } else if (GabsScore == 3201 || GabsScore == 1203 || GabsScore == 6 ||
                GabsScore == 600 || GabsScore == 6000 || GabsScore == 1101 ||
                GabsScore == 2202 || GabsScore == 3303){
            System.out.println("You won :D");
            Introduction();
        } else {
            PCturn(console);
        }
    }

    //Revisaremos los puntajes obtenidos por la PC
    public static void checkPCScore(Scanner console){
        if(PCScore == 3201 || PCScore == 1203 || PCScore == 6 ||
                PCScore == 600 || PCScore == 6000 || PCScore == 1101 ||
                PCScore == 2202 || PCScore == 3303){
            System.out.println("I won :p");
            Introduction();

        } else if (GabsScore == 3201 || GabsScore == 1203 || GabsScore == 6 ||
                GabsScore == 600 || GabsScore == 6000 || GabsScore == 1101 ||
                GabsScore == 2202 || GabsScore == 3303){
            System.out.println("You won!");
            Introduction();
        } else {
            Gabsturn(console);
        }
    }

    //Inicializaremos el tablero y lo rellenaremos
    public static void createTablero(){

        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                tablero[r][c] = ' ';
            }
        }

    }

    //Imprimiremos  el tablero
    public static void printTablero(){

        String bar = "  ====================";
        System.out.println("    1   2   3");
        System.out.println(bar);
        System.out.println("1   " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2]);
        System.out.println(bar);
        System.out.println("2   " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2]);
        System.out.println(bar);
        System.out.println("3   " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2]);
        System.out.println(bar);
        System.out.println("");
    }

}

