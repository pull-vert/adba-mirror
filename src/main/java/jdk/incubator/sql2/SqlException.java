/*
 * Copyright (c)  2017, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package jdk.incubator.sql2;

/**
 * An exception that provides information on a database access error or other
 * errors.
 *
 * <P>
 * Each {@code SqlException} provides several kinds of information:
 * <UL>
 * <LI> a string describing the error. This is used as the Java Exception
 * message, available via the method {@link getMessage}.
 * <LI> a "SQLstate" string, which follows either the XOPEN SQLstate conventions
 * or the SQL:2003 conventions. The values of the SQLState string are described
 * in the appropriate spec.
 * <LI> an integer error code that is specific to each vendor. Normally this
 * will be the actual error code returned by the underlying database.
 * <LI> the causal relationship, if any for this {@code SqlException}.
 * <LI> the SQL string that was executing when the error occurred. May be {@code null}.
 * <LI> the position in the SQL string where the error was detected.
 * </UL>
 */
public class SqlException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;

  // Fields

  /**
   */
  private final String sqlState;

  /**
   */
  private final int vendorCode;

  /**
   * The SQL string that was sent to the database.
   */
  private final String sqlString;

  /**
   * The index of the first character in SQL where an error is detected. Zero
   * based.
   */
  private final int position;
  
  // Constructors
  
  public SqlException(Throwable ex) {
    super(ex);
    this.sqlState = null;
    this.vendorCode = -1;
    this.sqlString = null;
    this.position = -1;
  }

  /**
   *
   * @param message
   * @param cause
   * @param sqlState
   * @param vendorCode
   * @param sql
   * @param position
   */
  public SqlException(String message, Throwable cause, String sqlState, int vendorCode, String sql, int position) {
    super(message, cause);
    this.sqlState = sqlState;
    this.vendorCode = vendorCode;
    this.sqlString = sql;
    this.position = position;
  }
  
  // Methods
  
  /**
   * Retrieves the SqlState for this {@code SqlException} object.
   *
   * @return the SQLState value
   */
  public String getSqlState() {
    return (sqlState);
  }

  /**
   * Retrieves the vendor-specific exception code for this
   * {@code SqlException} object.
   *
   * @return the vendor's error code
   */
  public int getVendorCode() {
    return (vendorCode);
  }

  /**
   * Get the position.
   *
   * @return the index of the first character in sql where an error is detected.
   * Zero based. {@code -1} if the position is not defined or unknown.
   */
  public int getPosition() {
    return position;
  }

  /**
   * Get the sql.
   *
   * @return the SQL string sent to the database. May be {@code null}.
   */
  public String getSqlString() {
    return sqlString;
  }
}
