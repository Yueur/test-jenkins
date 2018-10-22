pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				echo 'This stage will be executed first.'
				sh 'ant compile'
			}
		}
		
		stage('Test') {
			steps {
				echo 'Testing.'
				sh 'ant test'
			}
		}
		
		stage('Report') {
			steps {
				junit 'report/*.xml'
			}
		}
	}
	
	
	// Not working since the prvious steps are already deleted
	/*
	post {
		always {
			echo '-------------------------------------------------'
			unstash 'result-junit'
			junit 'result-junit.xml'
		}
	}
	*/
}
