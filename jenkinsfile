pipeline{
	agent any 
	stages{
		stage('Upload file in jfrog'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
				rtMavenDeployer (
					id: 'upload_jar',
					serverId: 'ordenamiento',
					releaseRepo: 'parcial2',
					snapshotRepo: '',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'upload_jar'
				)
			}
		}
	}
}
