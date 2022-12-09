//Retorna a viabilidade de uma viagem e seu possível custo.

var prompt = require('prompt-sync');
var prompt = prompt();

function calcularCombustivelNecessario(distanciaViagem, consumoMedioCombustivel) { //Retorna a quantidade de combustível necessário.
    return distanciaViagem / consumoMedioCombustivel;
}

function calcularDeficitCombustivel(quantidadeAtualCombustivel, combustivelNecessario) { //Retorna quanto combustível falta/resta.
    return quantidadeAtualCombustivel - combustivelNecessario;
}

function calcularCustoAbastecimento(deficitCombustivel, valorCombustivel) { //Retorna o custo do abastecimento necessário.
    return (deficitCombustivel * (-1)) * valorCombustivel;
}

var distanciaViagem, quantidadeAtualCombustivel, consumoMedioCombustivel, valorCombustivel; //Variáveis de entrada.
var combustivelNecessario, deficitCombustivel, custoAbastecimento; //Variáveis de processamento.

distanciaViagem = parseFloat(prompt('Informe a distância da viagem (Km): '));
quantidadeAtualCombustivel = parseFloat(prompt('Informe quanto combustível há no tanque (Litros): '));
consumoMedioCombustivel = parseFloat(prompt('Informe o consumo médio de combustível do veículo (Km por litro): '));

combustivelNecessario = calcularCombustivelNecessario(distanciaViagem, consumoMedioCombustivel);
deficitCombustivel = calcularDeficitCombustivel(quantidadeAtualCombustivel, combustivelNecessario);

//Seleção de saída:
if (deficitCombustivel > 0) {
    deficitCombustivel * (-1);

    console.log('\nAo final da viagem você terá aproximadamente: ' + deficitCombustivel + ' litro(s) restantes.');
    console.log('Boa viagem!');
} else if (deficitCombustivel == 0) {
    console.log('\nAtenção! Viagem pode ser realizada SEM reserva de combustível.');
} else {
    valorCombustivel = parseFloat(prompt('Informe o valor do litro do combustível: '));
    custoAbastecimento = calcularCustoAbastecimento(deficitCombustivel, valorCombustivel);
    deficitCombustivel = deficitCombustivel * (-1);

    console.log('\nVocê precisa abastecer ' + (deficitCombustivel) + ' litro(s).');
    console.log('O custo da viagem será de: ' + custoAbastecimento + ' real(is).')
}