FROM elasticsearch:5.0.1

MAINTAINER Bryan Perroud <bryan.perroud@heig-vd.ch>

ENV ES_JAVA_OPTS="-Des.patch.conf=/etc/elasticsearch"

CMD ["-E", "http.host=0.0.0.0", "-E", "transport.host=127.0.0.1", "-E", "discovery.zen.minimum_master_nodes=1"]