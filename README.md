# Application CRUD Spring avec Tailwind CSS

## Description
Cette application est une application CRUD (Créer, Lire, Mettre à jour, Supprimer) simple, développée avec Spring Boot et Tailwind CSS. Elle permet de gérer des entités `Customer` et offre une interface web pour effectuer des opérations CRUD. L'application suit le modèle de conception MVC (Modèle-Vue-Contrôleur).

## Fonctionnalités
- Création de nouveaux clients
- Affichage de la liste des clients
- Mise à jour des informations des clients
- Suppression des clients
- Interface utilisateur responsive avec Tailwind CSS

## Prérequis
Avant de lancer le projet, assurez-vous d'avoir installé :

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 17 ou une version ultérieure
- [Maven](https://maven.apache.org/) (optionnel, car le projet inclut un wrapper Maven)
- [Node.js](https://nodejs.org/) et npm (pour gérer Tailwind CSS)

## Installation

1. **Cloner le dépôt**
   ```bash
   git clone https://github.com/cisse410/spring-crud.git
   cd spring-crud
   ```

2. **Installer les dépendances Tailwind CSS**
   Naviguez à la racine du projet et initialisez npm :
   ```bash
   npm install
   ```


4. **Configurer la base de données**
   Mettez à jour le fichier `src/main/resources/application.properties` avec votre configuration de base de données :
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/crud-spring?createDatabaseIfNotExist=true
   spring.datasource.username=votre_nom_utilisateur
   spring.datasource.password=votre_mot_de_passe
   spring.jpa.hibernate.ddl-auto=update
   ```

5. **Lancer l'application**
   Utilisez le wrapper Maven pour démarrer l'application :
   ```bash
   ./mvnw spring-boot:run
   ```
   Alternativement, vous pouvez construire le projet et exécuter le fichier JAR généré :
   ```bash
   ./mvnw package
   java -jar target/spring-crud-0.0.1-SNAPSHOT.jar
   ```

6. **Accéder à l'application**
   Ouvrez votre navigateur et accédez à `http://localhost:8080`.

## Structure du projet
- `src/main/java/sn/cisse410/`
  - `controller/` : Contient les contrôleurs pour gérer les requêtes HTTP.
  - `model/` : Contient la classe d'entité `Customer`.
  - `repository/` : Contient l'interface `CustomerRepository` pour les opérations sur la base de données.
  - `service/` : Contient la classe `CustomerService` pour la logique métier.
- `src/main/resources/templates/` : Contient les templates Thymeleaf pour l'interface utilisateur.
- `src/main/resources/application.properties` : Fichier de configuration de l'application.

## Tests
Exécutez les tests avec le wrapper Maven :
```bash
./mvnw test
```

## Contribution
N'hésitez pas à forker le dépôt et à soumettre des pull requests. Les contributions sont les bienvenues !

## Licence
Ce projet est sous licence [MIT](https://github.com/cisse410/spring-crud/blob/master/LICENSE). Consultez le fichier LICENSE pour plus de détails.
