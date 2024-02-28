Spring Cloud Stream

This project consumes messages published by apiPublisher project. We can run multiple instances of consumers to increase throughput. Multiple consumers will work as one consumer group and load balance the processing of messages in round robin fashion.

