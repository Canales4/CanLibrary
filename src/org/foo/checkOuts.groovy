package org.foo
class CheckOuts implement Serializable{
  def steps
  CheckOuts(steps) {this.steps = steps}

  // But first that use this method you should make credentialsId
  def checkOutGithubSSH(user, repo, nameCred, branch) {
    if(branch != null){
      steps.git "branch: ${branch}, credentialsId: ${nameCred}, url: git@github.com:${user}/${repo}.git"
    }else{
      steps.git "credentialsId: ${nameCred}, url: git@github.com:${user}/${repo}.git"
    }
  }
}
