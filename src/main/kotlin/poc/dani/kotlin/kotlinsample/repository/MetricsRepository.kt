package poc.dani.kotlin.kotlinsample.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.hadoop.hbase.HbaseTemplate
import org.springframework.stereotype.Repository
import poc.dani.kotlin.kotlinsample.models.Metrics

@Repository
class MetricsRepository {

    @Autowired
    private lateinit var hbaseTemplate: HbaseTemplate

    fun listAll(): List<Metrics> {
        return listOf()
    }
}