#!C:\devops\Groovy-3.0.0\bin groovy

// vars/checkOutGitSSH

def call(String branch, String cred, String name, String repo){
  echo "git branch: ${branch}, credentialsId: ${cred}, url: git@github.com:${name}/${repo}.git"
}
