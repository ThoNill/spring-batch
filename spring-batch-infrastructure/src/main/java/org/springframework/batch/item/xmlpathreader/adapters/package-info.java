/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * The different adapters classes of this package are used in {@link org.springframework.batch.item.xmlpathreader.attribute.AttributeWithAdapter}.
 * <p>
 * They all marshal an Object to a String and unmarshal a String to an Object.
 * They all implements {@link javax.xml.bind.annotation.adapters.XmlAdapter}
 * 
 * The {@link AdapterMap} is a map that contains this adapters.
 * 
 * @author Thomas Nill
 * @since 4.0.1
 *
 */
package org.springframework.batch.item.xmlpathreader.adapters;