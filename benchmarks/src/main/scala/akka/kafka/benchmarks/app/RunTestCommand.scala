/*
 * Copyright (C) 2014 - 2016 Softwaremill <http://softwaremill.com>
 * Copyright (C) 2016 - 2019 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.kafka.benchmarks.app

case class RunTestCommand(testName: String, kafkaHost: String, msgCount: Int, numberOfPartitions: Int = 1)