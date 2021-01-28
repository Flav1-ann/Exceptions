@echo off

docker-compose -f "./DB/docker-compose.yml" up -d

java -jar ./Etablissement_Scolaire/out/artifacts/Etablissement_Scolaire_jar/Etablissement_Scolaire.jar

PAUSE