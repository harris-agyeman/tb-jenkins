job('Tibco') {

  steps {
    shell (
      '''
cd /usr/share/jenkins/synapse/
export GOOGLE_APPLICATION_CREDENTIALS=credentials.json
ls
make init
make plan
make apply
      '''
      )
  }
}