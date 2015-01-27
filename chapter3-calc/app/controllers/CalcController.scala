package controllers

import play.api._
import play.api.mvc._

object CalcController extends Controller {
  // TODO: Create an action called `add`:
  //
  //  - accept two integers extracted from the URL;
  //  - add them together;
  //  - return a plain text HTTP 200 response containing the result.
  def add(a: Int, b: Int) = ???

  // TODO: Create an action called `add`:
  //
  //  - accept two booleans extracted from the URL;
  //  - and them together;
  //  - return a plain text HTTP 200 response containing the result.
  def and(a: Boolean, b: Boolean) = ???

  // TODO: Create an action called `concat`:
  //
  //  - accept a rest argument extracted from the URL;
  //  - concatenate the URL-decoded path fragments from the argument,
  //    effectively removing slashes from the text;
  //  - return a plain text HTTP 200 response containing the result.
  //
  // TIP: Use the `urlDecode` helper method if you need to to decode the .
  def concat(args: String) = ???

  // TODO: Create an action called `concat`:
  //
  //  - accept two list arguments extracted from the URL;
  //  - concatenate and sort the lists;
  //  - return a plain text HTTP 200 response containing a space separated
  //    list of the result.
  def sort(a: Seq[String], b: Seq[String]) = ???

  // TODO: Create an action called `howToAdd`:
  //
  //  - accept two integers extracted from the URL;
  //  - return a plain text HTTP 200 response containing the
  //    HTTP method and URL required to add them together.
  //
  // TIP: Use the reverse route for `add()` to construct the URL.
  def howToAdd(a: Int, b: Int) = ???

  private def urlDecode(str: String) =
    java.net.URLDecoder.decode(str, "UTF-8")
}