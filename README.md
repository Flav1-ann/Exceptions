# Exceptions

# Installation

Pour l'installation de l'application vous avez le choix entre :

 - utiliser docker et le script d'installation et d'excution.

- installer l'application et ses prérequis manuellement.

## Avec Docker

### Installation de docker
Si vous n'avez pas docker d'installer sur votre machine vous pouvez l'installer.

#### Sous Windows

##### Windows professionnel
Vous pouvez installer docker desktop que vous trouverez [ici](https://www.docker.com/products/docker-desktop)

##### Windows familial
Vous pouvez utiliser docker toolbox, même s'il est déprécié, vous pouvez quand même l'utiliser que vous trouverez [ici](https://github.com/docker/toolbox/releases)
Si vous avez WSL 2 d'installer sur votre machine vous pouvez installer docker desktop avec. vous trouverez les étapes à suivre si vous souhaitez le faire 
[ici](https://docs.docker.com/docker-for-windows/install-windows-home/)

#### Sous Linux
  La documentation officiel explique comment installer docker sous linux. Vous pourrez choisir la distribution que vous utiliser. Vous trouverez la documentation [ici](https://docs.docker.com/engine/install/)

#### Sous MacOS
 vous pouvez installer docker desktop que vous trouverez [ici](https://www.docker.com/products/docker-desktop)

### Lancement de l'application

Après avoir installé docker sur votre machine et l'avoir lancé, il vous suffit d'executer le script correspondant à votre système d'exploitation

## Sans Docker

### Les Prérequis sont

- Une base de données MySQL
- recupéré le projet soit : 
  - En utilisant git à l'aide la commande `git clone <lien .git du repository>`.
  - En téléchargeant l'archive du projet depuis le repository du projet et d'extraire le contenu de l'archive.

### 1ère étape 
Pour l'installation il faut tout d'abord créer la base de données, celle-ci se nomme "etablissement_scolaire".

Il faut ensuite importer dans la base de données le fichier "dump.sql". Ce fichier se trouve dans le dossier DB à la racine de l'archive. 

### 2ème étape 

Ensuite ouvrez l’invite de commande et rendez vous dans le dossier "Etablissement_Scolaire\out\artifacts\Etablissement_Scolaire_jar\" :

depuis la racine du git :  cd Etablissement_Scolaire/out/artifacts/Etablissement_Scolaire_jar/

Maintenant, executez la commande :
java -jar Etablissement_Scolaire.jar

/!\ ATTENTION, si vous déplacez le fichier jar, vous devez vous assurez que le fichier properties ce trouve dans le fichier où vous executez la commande.

### 3ème étape

Le programme est enfin prêt à être utilisé.

# Documentation, JavaDOC
Une JavaDoc existe. Vous la trouverez dans le dossier Etablissement_Scolaire\out\JAVADOC\index.html

# Logs
Vous retrouverez les logs à l'endroit de l'execution de la commande de lancement soit par défaut: 

Etablissement_Scolaire/out/artifacts/Etablissement_Scolaire_jar/Log.out.txt

# Connexion à l'application
Pour vous connectez des identifiants on déjà été créer pour vous pour accéder à l'application en tant que Directeur ou en Responsable d'étude. 

Le mail : directeur@gmail.com <br />
Le mot de passe : directeur

Le mail : responsable.etude@gmail.com <br />
Le mot de passe : responsable
