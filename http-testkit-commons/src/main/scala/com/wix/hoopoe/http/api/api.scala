package com.wix.hoopoe.http.api

import akka.http.scaladsl.model.HttpRequest
import com.wix.hoopoe.http.BaseUri

trait MockWebServer extends BaseWebServer
trait StubWebServer extends BaseWebServer with RequestRecordSupport

trait BaseWebServer {
  def baseUri: BaseUri

  def start(): this.type
  def stop(): this.type
}


trait RequestRecordSupport {
  def recordedRequests: List[HttpRequest]
  def clearRecordedRequests(): Unit
}
