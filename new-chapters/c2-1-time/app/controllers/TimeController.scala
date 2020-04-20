package controllers

import java.util.Date
import javax.inject._
import play.api._
import play.api.mvc._
import org.joda.time.{DateTime, DateTimeZone}
import org.joda.time.format.DateTimeFormat

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */


object TimeController extends BaseController with TimeHelpers {
  // TODO: Return an HTTP 200 plain text response containing the time.
  //
  // Use the `localTime` and `timeToString` helper methods below.
  def time = ???

  // TODO: Read in a time zone ID (a string) and return an HTTP 200
  // plain text response containing the localized time.
  //
  // Use the `localTimeInZone` and `timeToString` helper methods below.
  def timeIn(zoneId: String) = ???

  // TODO: Return an HTTP 200 plain text response containing a list of
  // available time zone codes.
  //
  // Use the `zoneIds` helper method below.
  def zones = ???
}

trait TimeHelpers {
  def localTime: DateTime =
    DateTime.now

  def localTimeInZone(zoneId: String): Option[DateTime] =
    zoneForId(zoneId) map (DateTime.now.withZone)

  def timeToString(time: DateTime): String =
    DateTimeFormat.shortTime.print(time)

  def zoneIds: List[String] = {
    import scala.collection.JavaConversions._
    DateTimeZone.getAvailableIDs.toList
  }

  def zoneForId(zoneId: String): Option[DateTimeZone] =
    try { Some(DateTimeZone.forID(zoneId)) }
    catch { case exn: IllegalArgumentException => None }
}

