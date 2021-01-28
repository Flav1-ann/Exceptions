#!/bin/bash

docker-compose -f "./DB/docker-compose.yml" up -d

java -jar ./Etablissement_Scolaire/out/artifacts0/Etablissement_Scolaire_jar/Etablissement_Scolaire.jar