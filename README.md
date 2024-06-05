[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=gabriel-vinicios_JUnitTest&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=gabriel-vinicios_JUnitTest)
[![Github Actions Status for Gabriel Vinicios/JUnitTest](https://github.com/gabriel-vinicios/JUnitTest/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/gabriel-vinicios/JUnitTest/actions)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=gabriel-vinicios_JUnitTest&metric=coverage)](https://sonarcloud.io/summary/new_code?id=gabriel-vinicios_JUnitTest)

# Calculadora com CI.
Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção
Pipeline
- dev - Compilação
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento
<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 4.<br>
- A cobertura do código é realizada através do JaCoCo.<br>
