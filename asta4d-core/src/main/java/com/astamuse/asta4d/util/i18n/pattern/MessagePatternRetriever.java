/*
 * Copyright 2014 astamuse company,Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.astamuse.asta4d.util.i18n.pattern;

import java.util.Locale;

import com.astamuse.asta4d.util.i18n.I18nMessageHelper;

/**
 * A retriever used by {@link I18nMessageHelper} to retrieve message
 * 
 * @author e-ryu
 *
 */
public interface MessagePatternRetriever {

    /**
     * 
     * @param locale
     * @param key
     * @return null if no message pattern for the given key can be found
     */
    public String retrieve(Locale locale, String key);
}
