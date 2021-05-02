package poc.dani.kotlin.kotlinsample.repository.mappers

import org.springframework.data.hadoop.hbase.RowMapper
import org.apache.hadoop.hbase.client.Result;
import poc.dani.kotlin.kotlinsample.models.Metrics

class MetricsMapper : RowMapper<Metrics> {
    override fun mapRow(result: Result?, rowNum: Int): Metrics {
        print("adsd")
        return Metrics("a", "b")
    }

}