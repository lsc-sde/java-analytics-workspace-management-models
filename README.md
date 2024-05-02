# java-analytics-workspace-management-models
Analytics Workspace Models for Java

## Executing manually
First copy the CRD files to /tmp/crds, then execute the following command:
```bash
mkdir -p /tmp/java && cd /tmp/java
docker run --rm -v "/tmp/crds":"/tmp/crds" -v /var/run/docker.sock:/var/run/docker.sock  -v "$(pwd)":"$(pwd)" -ti --network host ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6 /generate.sh -u /tmp/crds/AnalyticsWorkspace.yaml -u /tmp/crds/AnalyticsWorkspaceBinding.yaml -n uk.nhs.xlscsde -p uk.nhs.xlscsde.analytics.workspace.management -o "$(pwd)"
```
This will output the java files into /tmp/java