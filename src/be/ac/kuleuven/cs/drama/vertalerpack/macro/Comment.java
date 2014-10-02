/**
 *
 * CVS: $Header: /export/home0/cvsroot/socsg/DRAMA/Sources/be/ac/kuleuven/cs/drama/vertalerpack/macro/Comment.java,v 1.1.1.1 2001/09/07 09:41:38 dirkw Exp $
 *
 * (C) 2000
 * Katholieke Universiteit Leuven
 * Developed at Dept. Computer Science
 *
 */
package be.ac.kuleuven.cs.drama.vertalerpack.macro;

/**
 * Utility class to strip comment from a line.
 *
 * @version 1.0.0 08/30/2000
 * @author  Tom Schrijvers
 */

public final class Comment {

   private Comment() {}

   /**
    * @return the given string without comment
    */
   public static String stripComment(String string) {
      if (string.indexOf('|') != -1) {
         return string.substring(0, string.indexOf('|'));
      } else {
         return string;
      }

   }

}