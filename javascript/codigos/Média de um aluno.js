//Recebe e calcula a média de um aluno, retornando seu status ao final.

var prompt = require('prompt-sync');
var prompt = prompt();


function receberNotas(quantidadeNotas) { //Recebe as notas e retorna a pontuação total.
    for (i = 0; i < quantidadeNotas; i++) {
        notaAtual = parseFloat(prompt('Insira a nota: '));
        pontuacaoTotal = pontuacaoTotal + notaAtual;
        console.log('Pontuação total: ' + pontuacaoTotal.toFixed(1));
    }

    return pontuacaoTotal;
}

function calcularMedia(pontuacaoTotal, quantidadeNotas) { //Retorna o calculo da média.
    return media = (pontuacaoTotal / quantidadeNotas);
}

function retornarStatusAluno(media) { //Retorna o estado do aluno (Reprovado, Em recuperação ou Aprovado).
    if (media < 5) {
        return 'Aluno reprovado.';
    } else if (media >= 5 && media < 7) {
        return 'Aluno em recuperação.';
    } else {
        return 'Aluno aprovado.';
    }
}

var pontuacaoTotal = 0, media = 0;
var quantidadeNotas = parseInt(prompt('Informe a quantidade de notas: '));

pontuacaoTotal = receberNotas(quantidadeNotas);
media = calcularMedia(pontuacaoTotal, quantidadeNotas);

console.log('\nA média das notas é de: ' + media.toFixed(1));
console.log(retornarStatusAluno(media));