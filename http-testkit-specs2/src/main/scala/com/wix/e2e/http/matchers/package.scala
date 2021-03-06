package com.wix.e2e.http

import org.specs2.matcher.Matcher

package object matchers {
  type ResponseMatcher = Matcher[HttpResponse]
  type RequestMatcher = Matcher[HttpRequest]
}
