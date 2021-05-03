package poc.dani.kotlin.kotlinsample.configuration

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.HBaseAdmin
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.hadoop.hbase.HbaseTemplate


@Configuration
class HBaseConfig {
    @Bean
    fun hbaseTemplate(): Any {
        val config: org.apache.hadoop.conf.Configuration = HBaseConfiguration.create()
        config.set("hbase.zookeeper.quorum", "localhost")
        config.set("hbase.zookeeper.property.clientPort", "2181")

        HBaseAdmin.available(config)

        return Any()
    }
}