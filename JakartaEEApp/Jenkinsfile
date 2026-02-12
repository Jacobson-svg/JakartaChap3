pipeline {
    agent any // Définit l'exécuteur

    stages {
        stage('Checkout') {
            steps {
                checkout scm // Récupère le code automatiquement
            }
        }
        
        // C'est ici que tu ajouteras tes étapes spécifiques
        stage('Build') {
            steps {
                echo 'Compilation en cours...'
            }
        }
    }
    
    post {
        always {
            echo 'Fin du pipeline.'
        }
    }
}