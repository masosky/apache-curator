# PROJECT

## Run Zookekeper GUI
`docker run \
-d \
-p 9000:9000 \
-e HTTP_PORT=9000 \
--name zoonavigator \
--restart unless-stopped \
elkozmon/zoonavigator:latest`

`10.5.0.2:2181,10.5.0.3:2181`