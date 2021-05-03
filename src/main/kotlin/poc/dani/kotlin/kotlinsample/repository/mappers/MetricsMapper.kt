package poc.dani.kotlin.kotlinsample.repository.mappers

import org.springframework.data.hadoop.hbase.RowMapper
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes
import org.slf4j.LoggerFactory
import poc.dani.kotlin.kotlinsample.models.Metrics

class MetricsMapper : RowMapper<Metrics> {

    val log = LoggerFactory.getLogger(MetricsMapper::class.qualifiedName);

    val performanceFamily = Bytes.toBytes("performance")

    val cpuColumn = Bytes.toBytes("cpu")

    override fun mapRow(result: Result?, rowNum: Int): Metrics {
        var metricsRetrieved = Metrics("unknown", "unknown")
        metricsRetrieved.id = "unknown"
        if (result !== null && !result.isEmpty) {
            val resultFamilyMap = result.getFamilyMap(performanceFamily)
            var data = String(resultFamilyMap.getValue(cpuColumn))
            metricsRetrieved = Metrics("cpu", data)
            metricsRetrieved.id = String(result.row)
        }

        return metricsRetrieved
    }
}