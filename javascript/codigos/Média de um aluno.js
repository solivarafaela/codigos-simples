var prompt = require('prompt-sync');
var prompt = prompt();

var pontuacaoTotal = 0, media = 0;

var quantidadeNotas = parseInt(prompt('Informe a quantidade de notas: '));

for (i = 0; i < quantidadeNotas; i++) {
    notaAtual = parseFloat(prompt('Insira a nota: '));
    pontuacaoTotal = pontuacaoTotal + notaAtual;
    console.log('Pontuação total: ' + pontuacaoTotal.toFixed(1));
}

media = (pontuacaoTotal / quantidadeNotas);

console.log('\nA média do aluno foi: ' + media.toFixed(1));

if (media < 5) {
    console.log('Aluno reprovado.');
} else if (media >= 5 && media < 7) {
    console.log('Aluno em recuperação.');
} else {
    console.log('Aluno aprovado.\n');
}