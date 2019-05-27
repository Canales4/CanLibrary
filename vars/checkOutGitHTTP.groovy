#!C:\devops\Groovy-3.0.0\bin groovy
// /vars/checkOutGitHTTP
def call(String branch = null, String cred, String name, String repo){
  if(branch != null){
    sh "git branch: '${branch}', credentialsId: '${cred}', url: 'https://github.com/${name}/${repo}.git'"
  } else {
    sh "git credentialsId: '${cred}', url: 'https://github.com/${name}/${repo}.git'"
  }
}
