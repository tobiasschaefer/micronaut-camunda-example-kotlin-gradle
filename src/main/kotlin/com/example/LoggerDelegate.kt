package com.example

import jakarta.inject.Singleton
import org.camunda.bpm.engine.delegate.JavaDelegate
import org.camunda.bpm.engine.delegate.DelegateExecution
import org.slf4j.LoggerFactory

@Singleton
class LoggerDelegate : JavaDelegate {
    override fun execute(delegateExecution: DelegateExecution) {
        log.info("Hello World: {}", delegateExecution)
    }

    companion object {
        private val log = LoggerFactory.getLogger(LoggerDelegate::class.java)
    }
}