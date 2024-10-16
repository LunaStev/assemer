// Copyright [2024] LunaStev. This file is licensed under the Mozilla Public License, v. 2.0.
// You can obtain a copy of the License at https://mozilla.org/MPL/2.0/.

// This file uses the JetBrains library, which is governed by the Apache 2.0 license.
// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package com.gurmstudios.lunastev.wson;

import com.intellij.lexer.FlexAdapter;

public class WsonLexer extends FlexAdapter {
  public WsonLexer() {
    super(new _WsonLexer());
  }
}
