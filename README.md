# 🧑‍🚀 Menor Valor do Vetor
Algoritmo que procura o menor valor dentro de um vetor através de recursão.

## 📝 Enunciado:
Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
tamanho do vetor e o valor da última posição do vetor como o primeiro menor valor, retorne o menor
valor contido neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;

---

## Como usar:

### Clone esse repositório:
```bash
git clone https://github.com/GabrielGit10110/Menor_Valor_do_Vetor.git
```
### Entre no diretório:
```bash
cd Menor_Valor_do_Vetor
```

### ⚙️ Como compilar:
1. Transforme todos os arquivos.java em arquivos.class:
```bash
javac -s src -d dist src/controller/AnaliseVetorController.java src/view/AnaliseVetor.java
```

2. Execute:
```bash
java -cp dist view.AnaliseVetor
``` 

*@ Opcional - Compilação para jar:*
1. Crie um MANIFEST.txt e adicione o caminho correto para a classe Main:
```bash
touch MANIFEST.txt
echo 'Main-Class: view.AnaliseVetor' > MANIFEST.txt
```

2. Faca a compilação para jar:
```bash
jar -cvfm AnaliseVetor.jar MANIFEST.txt -C dist .
```

3. Execute o jar:
```bash
java -jar AnaliseVetor.jar
```
