package poc.dani.kotlin.kotlinsample.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import poc.dani.kotlin.kotlinsample.models.Metrics
import poc.dani.kotlin.kotlinsample.repository.MetricsRepository

@Component
class MetricsQueryResolver : GraphQLQueryResolver {

    @Autowired
    private lateinit var metricsRepository: MetricsRepository

    fun listAll(): List<Metrics> {
        return metricsRepository.listAll()
    }

    fun findById(metricId: String): Metrics {
        return metricsRepository.findById(metricId)
    }

}