# Spring Observability Project
This project demonstrates a Spring-based microservice application with integrated observability using Prometheus, Loki, Tempo, and Grafana. The goal is to monitor and trace the performance and health of the application effectively (inspired by Pr Youssfi).

# Prerequisites
- Docker
- Docker Compose
- Spring 3.x.x

# Overview
The project consists of the following components:

**Prometheus**: Monitoring system and time series database.
**Loki**: Log aggregation system optimized for storing and querying logs.
**Tempo**: Distributed tracing system.
**Grafana**: Visualization tool for metrics, logs, and traces.

# Services
**Prometheus**: Collects metrics from your Spring services and provides an interface for querying them.
**Tempo**: Stores trace data to understand request flows across services.
**Loki**: Centralized logging for analyzing logs across all services.
**Grafana**: Visualizes data collected from Prometheus, Loki, and Tempo in customizable dashboards.
**Product-Service**: A sample Spring-based microservice to demonstrate observability integration.

# Getting Started

1. Clone the repository:
`git clone <repository_url>
cd <repository_directory>`
2. Build and Start the Services:
`docker-compose up --build`
3. Access Grafana:
Navigate to `http://localhost:3000` in your browser.
Login with the default credentials:
- Username: admin
- Password: password
4. Import Dashboards:
- Add data sources for Prometheus, Loki, and Tempo in Grafana.
- Import relevant dashboards to monitor logs, traces, and metrics.

# Configuration Details
## Prometheus
Prometheus collects metrics from the Spring service and other components. The configuration is defined in docker/prometheus/prometheus.yml.

## Tempo
Tempo stores traces from the Spring application. Configuration is located in docker/tempo/tempo.yml.

## Loki
Loki aggregates logs from all services. The configuration can be found in docker/loki/local-config.yaml.

## Grafana
Grafana is pre-configured to use Prometheus, Loki, and Tempo as data sources. You can find the provisioning files in docker/grafana.

## Observability
With this setup, you can:

- Monitor application performance with Prometheus metrics.
- View logs across services using Loki.
- Trace request flows across distributed services with Tempo.
- Visualize all data in Grafana dashboards.

# Extending the Project
To add more services or customize the existing ones:

- Update the docker-compose.yml file.
- Configure the respective YAML files for Prometheus, Loki, Tempo, and Grafana.
- Rebuild and restart the Docker containers.

# License
This project is licensed under the MIT License.

# Contact
For any inquiries, feel free to reach out to ousmaneelhadji4@gmail.com
