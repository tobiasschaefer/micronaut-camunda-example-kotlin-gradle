package com.example

import org.camunda.bpm.engine.delegate.JavaDelegate
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class LoggerDelegate : JavaDelegate {
    override fun execute(delegateExecution: DelegateExecution) {
        log.info("Hello World: {}", delegateExecution)
    }

    companion object {
        private val log = LoggerFactory.getLogger(LoggerDelegate::class.java)
    }
}