//Retorna a viabilidade de uma viagem e seu possível custo.

var prompt = require('prompt-sync');
var prompt = prompt();

var consumoMedioCombustivel, quantidadeAtualCombustivel, distanciaViagem, valorCombustivel;
var combustivelNecessario, deficitCombustivel, valorNecessarioParaViajar;

consumoMedioCombustivel = parseFloat(prompt('Informe o consumo médio de combustível do veículo (Km por litro): '));
quantidadeAtualCombustivel = parseFloat(prompt('Informe quanto combustível há no tanque (Litros): '));
distanciaViagem = parseFloat(prompt('Informe a distância da viagem (Km): '));

combustivelNecessario = distanciaViagem / consumoMedioCombustivel;
deficitCombustivel = quantidadeAtualCombustivel - combustivelNecessario;

if (deficitCombustivel >= 0) {
    console.log('\nAo final da viagem você terá aproximadamente: ' + deficitCombustivel + ' litro(s) restantes.');
    console.log('Boa viagem!');
} else {
    valorCombustivel = parseFloat(prompt('Informe o valor do litro do combustível: '));
    valorNecessarioParaViajar = deficitCombustivel * valorCombustivel;
    console.log('\nVocê precisa abastecer ' + (deficitCombustivel * (-1)) + ' litro(s) de combustível.'); //invertendo valor negativo.
    console.log('O valor estimado é de: ' + (valorNecessarioParaViajar * (-1)) + ' reais.'); //invertendo valor negativo.
}