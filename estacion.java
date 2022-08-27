var numerolf;
var numeroWhile = 2;
var estacion;

if(numerolf > 0) {

} else if(numerolf < 0) {

} else(numerolf == 0) {

}

while(numeroWhile < 3){
   numeroWhile = numeroWhile + 1;
    System.out.println(numeroWhile);
}

do{
    System.out.println(numeroWhile);
}while(numeroWhile < 3);

for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
    System.out.println(numeroFor);
    numeroFor = numeroFor + 1;
}

switch(estacion){
    case "VERANO":
        System.out.println("verano");
        break;
    case "OTONIO":
        System.out.println("otonio");
        break;
    case "INVIERNO":
    System.out.println("invierno");
        break;
    case "PRIMAVERA":
        System.out.println("primavera");
        break;
        default:
        System.out.println("estacion invalida");
}