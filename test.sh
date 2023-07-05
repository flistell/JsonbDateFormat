
echo "### 1. Plain JAX-RS and JSON-B annotations (PLainJaxRSApplication.java) ###"
curl -qs -x '' http://localhost:7001/recordrest-web-jackson/resources/datedemo | jq  

echo "### 2. Use of Jackson registered in JaxRsWithJaksonApplication.java ###"
curl -qs -x '' http://localhost:7001/recordrest-web-jackson/resources2/datedemo | jq 

echo "### 3. Use of Jackson configured in web.xml ###"
curl -qs -x '' http://localhost:7001/recordrest-web-jackson/resources3/datedemo | jq 
