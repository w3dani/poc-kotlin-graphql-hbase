package poc.dani.kotlin.kotlinsample.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.hadoop.hbase.HbaseTemplate

@Configuration
class HBaseConfig {

    @Bean
    fun hbaseTemplate(): HbaseTemplate {
        val config = org.apache.hadoop.conf.Configuration()
        config.set("hbase.zookeeper.quorum", "localhost")
        return HbaseTemplate(config)
    }
}