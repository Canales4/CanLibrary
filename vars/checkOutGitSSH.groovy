#!C:\devops\Groovy-3.0.0\bin groovy
// vars/checkOutGitSSH
def call(String branch = null, String cred, String name, String repo){
  if(branch != null){
    sh "git branch: ${branch}, credentialsId: ${cred}, url: git@github.com:${name}/${repo}.git"
  } else {
    sh "git credentialsId: ${cred}, url: git@github.com:${name}/${repo}.git"
  }
}
