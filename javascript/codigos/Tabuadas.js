//Retorna a tabuada solicitada pelo usuário.

var prompt = require('prompt-sync');
var prompt = prompt();


function retornarTabuada(numeroLimite, numero) { //Retorna tabuada solicitada.
    for (i = 0; i <= numeroLimite; i++) {
        console.log(numero + ' x ' + i + ' = ' + (numero * i))
    }
}

var numero, numeroLimite;

numero = prompt('Informe um número para exibir sua tabuada: ');
numeroLimite = prompt('Até que valor o número incial deve ser multiplicado? ')

retornarTabuada(numeroLimite, numero);