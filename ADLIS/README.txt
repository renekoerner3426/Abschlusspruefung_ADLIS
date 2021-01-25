1. Starting Services
service docker start
service ssh start

2. Create the .kube durectory
cd ~
mkdir .kube

3. Copy the kubeconfig file to .kube directory
cd ~
cp /home/project/README/20_Configs_Examples/Kube_Configs_GR1/f73-gr1-tg-8-kubeconfig_gke ~/.kube
cd .kube
mv f73-gr1-tg-8-kubeconfig_gke config

4. helm install
curl -fsSL -o get_helm.sh https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3
chmod 700 get_helm.sh
./get_helm.sh

5. add bitnami repo
helm repo add bitnami https://charts.bitnami.com/bitnami

6. initialize mongodb
helm pull bitnami/mongodb
tar xvzf mongodb-10.5.1.tgz cd ~/home/project
helm repo update
helm install mongodb mongodb
