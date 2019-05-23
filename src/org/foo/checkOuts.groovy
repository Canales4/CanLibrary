package org.foo


class checkOuts {

  // But first that use this method you should make credentialsId
  def checkOutGithubSSH(user, repo, nameCred, branch) {
    if(branch != null){
      git branch: "${branch}", credentialsId: "${nameCred}", url: "git@github.com:${user}/${repo}.git"
    }else{
      git credentialsId: "${nameCred}", url: "git@github.com:${user}/${repo}.git"
    }
  }
  return this
}
