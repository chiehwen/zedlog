/* Copyright (C) 2013  Zachary Scott <zscott.dev@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.zeddev.zedlog.logger;

/**
 * An interface to notify observers when a <Code>DataLogger</code> makes a log/record.
 *
 * @author Zachary Scott <zscott.dev@gmail.com>
 */
public interface DataLoggerObserver {

	/**
	 * Notifies the observer that a data log/record has been made.
	 *
	 * @param logger The logger which made the notification.
	 * @param log The log message.
	 */
	public void notifyLog(final DataLogger logger, final LogEntry logEntry);

}
