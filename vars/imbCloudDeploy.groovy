#!C:\devops\Groovy-3.0.0\bin groovy
// vars/imbCloudDeploy

//this var will only work if the client and the server go separator in the same directory
def call(String app, String apikey) {
  sh "ibmcloud login --apikey $${apikey} && ibmcloud target --cf && cd client && ibmcloud cf push ${app}"
}
