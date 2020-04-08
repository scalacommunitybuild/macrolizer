/*
 * Copyright (c) 2020 Mathias Doenitz
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package macrolizer

object Test {

  show("suppress=[java.lang.]") {
    if (System.nanoTime() > 1000) {
      val x: Long = 42
      println(x)
    } else System.exit(0)
  }

}
