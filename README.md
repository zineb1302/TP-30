# TP-30 : Pipeline CI/CD avec Jenkins et Docker

## 📋 Description
Ce projet implémente un pipeline CI/CD complet utilisant Jenkins et Docker pour une application Spring Boot.

**Auteur** : Zineb  
**Date** : 2025

---

## 🛠️ Technologies utilisées
- **Spring Boot 3.x** - Framework backend Java
- **Maven** - Gestion des dépendances
- **Jenkins** - Orchestration CI/CD
- **Docker** - Conteneurisation
- **JUnit 5** - Tests unitaires

---

## 📁 Structure du projet
```
TP-30-Zineb/
├── src/
│   ├── main/
│   │   └── java/com/example/demo/
│   │       ├── DemoApplication.java       # Point d'entrée
│   │       └── HelloController.java       # Contrôleur REST
│   └── test/
│       └── java/.../DemoApplicationTests.java
├── Dockerfile                              # Configuration Docker
├── pom.xml                                 # Configuration Maven
└── README.md
```

---

## 🚀 Installation et exécution

### Prérequis
- Java 17+
- Maven 3.8+
- Docker Desktop
- Jenkins (optionnel pour CI/CD)

### Lancer l'application
```bash
# Compiler le projet
mvn clean package

# Exécuter l'application
mvn spring-boot:run

# Ou avec Java
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### Avec Docker
```bash
# Construire l'image
docker build -t demo-app .

# Lancer le conteneur
docker run -p 8080:8080 demo-app
```

---

## 🔗 Endpoints API

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| GET | `/` | Message de bienvenue |
| GET | `/hello` | Retourne "Hello World" |

---

## 📸 Captures d'écran

### Application Spring Boot
<img width="1523" height="781" alt="img" src="https://github.com/user-attachments/assets/de73112d-13c4-422a-8e88-8086b5c2059f" />

---

## 📌 Fonctionnalités
- ✅ API REST simple
- ✅ Configuration Docker
- ✅ Tests unitaires
- ✅ Pipeline Jenkins prêt

---

## 📚 Références
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Docker Documentation](https://docs.docker.com/)
- [Jenkins Documentation](https://www.jenkins.io/doc/)

---
*Réalisé par Zineb - 2025*
