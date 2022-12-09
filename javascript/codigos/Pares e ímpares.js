//Recebe um número e o classifica em par ou ímpar.

var prompt = require('prompt-sync');
var prompt = prompt();


function classificarNumero(numero) {
    if (numero === 0) {
        return 'Esse número é par.';
    } else {
        return 'Esse número é impar.';
    }
}

var numero;
numero = prompt('Digite um número: ');
numero = numero % 2;

console.log(classificarNumero(numero));