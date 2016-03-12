/*
 * Copyright (c) Joachim Ansorg, mail@ansorg-it.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.lexer;

import com.ansorgit.plugins.bash.file.BashFileType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * The definition of a Bash element type.
 * <p/>
 * Date: 22.03.2009
 * Time: 12:06:39
 *
 * @author Joachim Ansorg
 */
public class BashElementType extends IElementType {
    public BashElementType(@NotNull String debugName) {
        super(debugName, BashFileType.BASH_LANGUAGE);
    }

    public String toString() {
        return "[Bash] " + super.toString();
    }
}
