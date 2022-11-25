var prompt = require('prompt-sync');
var prompt = prompt();

var numero, numeroLimite;

numero = prompt('Informe um número para exibir sua tabuada: ');
numeroLimite = prompt('Até que valor o número incial deve ser multiplicado? ')

for (i = 0; i <= numeroLimite; i++) {
    console.log(numero + ' x ' + i + ' = ' + (numero * i))
}