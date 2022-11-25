var prompt = require('prompt-sync');
var prompt = prompt();

var numero;

numero = prompt('Digite um número: ')

numero = numero % 2;

if (numero === 0) {
    console.log('Esse número é par.');
} else {
    console.log('Esse número é impar.');
}