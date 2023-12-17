curl -H 'Authorization: default:development.4d4ac67f84611ec01278036a357c71ca142c940223c33c25a32c15fc' http://localhost:32770/api/client/features?project=default | jq '.'
curl -H 'accept: application/json' -H 'Authorization: default:development.4d4ac67f84611ec01278036a357c71ca142c940223c33c25a32c15fc' http://localhost:32770/api/client/features?project=default | jq '.'
curl -X POST http://localhost:32770/api/admin/environments/default/on
curl -v -H "Authorization: default:development.14e7a3278aba90166ebc87e79283b939af159f3b552c26728274d6ba" http://localhost:32770/api/client/features?project=default | jq '.'
curl -v -H 'accept: application/json' -H "Authorization: default:development.14e7a3278aba90166ebc87e79283b939af159f3b552c26728274d6ba" http://localhost:32770/api/client/features?project=default | jq '.'
curl -v -X POST http://localhost:32770/api/admin/environments/default/on
curl http://localhost:32770/api/admin/api-tokens | jq '.'
curl http://localhost:32770/api/admin/environments | jq '.'
curl http://localhost:32770/api/admin/projects/default/api-tokens | jq '.'
curl http://localhost:32770/api/admin/projects/default/features | jq '.'
curl http://localhost:32770/api/admin/user/tokens | jq '.'
curl http://localhost:32770/api/client/features?project=default | jq '.'
curl http://localhost:8080/hello?name=quarkus