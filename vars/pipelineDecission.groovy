// This file should be placed inside vars/pipelineDecission.groovy

def call(Map configMap) {
    echo "🔧 Running pipelineDecission shared library..."
    echo "📦 Project: ${configMap.project}"
    echo "🧩 Component: ${configMap.component}"
    echo "⚙️ Type: ${configMap.type}"

    switch(configMap.type) {
        case "nodejsEKS":
            runNodejsPipeline(configMap)
            break
        case "javaEKS":
            runJavaPipeline(configMap)
            break
        default:
            error "❌ Unknown pipeline type: ${configMap.type}"
    }
}

def runNodejsPipeline(Map config) {
    echo "🚀 Starting Node.js EKS deployment for component: ${config.component}"
    // You can replace this with real stages or sh/kubectl steps
    // Sample logic:
    echo "🛠️ Building..."
    echo "📤 Deploying to EKS cluster..."
}

def runJavaPipeline(Map config) {
    echo "🚀 Starting Java EKS deployment for component: ${config.component}"
    // You can replace this with real Maven/Gradle build & deploy
    echo "🧪 Running tests..."
    echo "📤 Deploying to EKS cluster..."
}
