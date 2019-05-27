#!C:\devops\Groovy-3.0.0\bin groovy
// /vars/checkOutGitHTTP
def call(String branch = null, String cred, String name, String repo){
  if(branch != null){
    echo "git branch: ${branch}, credentialsId: ${cred}, url: https://github.com/${name}/${repo}.git"
  } else {
    echo "git credentialsId: ${cred}, url: https://github.com/${name}/${repo}.git"
  }
}
