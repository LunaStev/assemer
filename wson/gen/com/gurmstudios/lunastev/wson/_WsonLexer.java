// Copyright [2024] LunaStev. This file is licensed under the Mozilla Public License, v. 2.0.
// You can obtain a copy of the License at https://mozilla.org/MPL/2.0/.

// This file uses the JetBrains library, which is governed by the Apache 2.0 license.
// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.

package com.gurmstudios.lunastev.wson;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.io.IOException;

public class _WsonLexer implements FlexLexer {


  @Override
  public void yybegin(int state) {
    return;
  }

  @Override
  public int yystate() {
    return 0;
  }

  @Override
  public int getTokenStart() {
    return 0;
  }

  @Override
  public int getTokenEnd() {
    return 0;
  }

  @Override
  public IElementType advance() throws IOException {
    return null;
  }

  @Override
  public void reset(CharSequence buf, int start, int end, int initialState) {

  }
}
