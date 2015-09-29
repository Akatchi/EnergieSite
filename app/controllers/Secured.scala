package controllers

import play.api.mvc._

trait Secured {
  /**
   * retrieve connected user's email
   * @param request
   * @return
   */
  private def username(request: RequestHeader) = request.session.get("email")

  /**
   * not Authorized forward to login
   */
  private def onUnauthorized(request: RequestHeader) = {
    Results.Redirect(routes.Login.index)
  }

  /**
   * Action for authenticated users
   */
  def IsAuthenticated(f: => String => Request[AnyContent] => Result) = {
    Security.Authenticated(username, onUnauthorized) { user =>
      Action(request => f(user)(request))
    }
  }
}
