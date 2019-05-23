def checkOutSSHGit(String branch, String credId,String name, String repo){
  echo "git branch: ${branch}, credentialsId: ${credId}, url: git@github.com:${name}/${repo}.git"
}
