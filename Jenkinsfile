@Library('jenkins-shared-library-autodeploy') _

def configMap = [
    type: "nodejsEKS",
    component: "backend",
    project: "expense"
]

if (!env.BRANCH_NAME.equalsIgnoreCase('main')) {
    pipelineDecission(configMap)
} else {
    echo "✅ Proceed with CR or NON-PROD pipeline"
}
