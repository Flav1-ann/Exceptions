# Exceptions

# Installation

### Les Prérequis sont

- Une base de données MySQL
- recupéré le projet soit : 
  - En utilisant git à l'aide la commande `git clone <lien .git du repository>`.
  - En téléchargeant l'archive du projet depuis le repository du projet et d'extraire le contenu de l'archive.

### 1ère étape 
Pour l'installation il faut tout d'abord créer la base de données, celle-ci se nomme "etablissement_scolaire".

Il faut ensuite importer dans la base de données le fichier "dump.sql". Ce fichier se trouve dans le dossier DB à la racine de l'archive. 

### 2ème étape 

Ensuite ouvrez l’invite de commande et rendez vous dans le dossier "livraison" :

depuis la racine du git :  cd livraison\Etablissement_Scolaire.jar

Maintenant, executez la commande :
java -jar Etablissement_Scolaire.jar

/!\ ATTENTION, si vous déplacez le fichier jar, vous devez vous assurez que le fichier properties ce trouve dans le fichier où vous executez la commande.

### 3ème étape

Le programme est enfin prêt à être utilisé.

# Documentation, JavaDOC
Une JavaDoc existe. Vous la trouverez dans le dossier livraison\javadoc\index.html

# Logs
Vous retrouverez les logs à l'endroit de l'execution de la commande de lancement soit par défaut: 

 livraison/Log.out.txt

# Connexion à l'application
Pour vous connectez des identifiants on déjà été créer pour vous pour accéder à l'application en tant que Directeur ou en Responsable d'étude. 

Le mail : directeur@gmail.com <br />
Le mot de passe : directeur

Le mail : responsable.etude@gmail.com <br />
Le mot de passe : responsable
