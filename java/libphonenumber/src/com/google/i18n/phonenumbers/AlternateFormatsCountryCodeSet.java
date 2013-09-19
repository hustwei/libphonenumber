/*
 * Copyright (C) 2012 The Libphonenumber Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* This file is automatically generated by {@link BuildMetadataProtoFromXml}.
 * Please don't modify it directly.
 */

package com.google.i18n.phonenumbers;

import java.util.HashSet;
import java.util.Set;

public class AlternateFormatsCountryCodeSet {
  // A set of all country codes for which data is available.
  static Set<Integer> getCountryCodeSet() {
    // The capacity is set to 36 as there are 27 different entries,
    // and this offers a load factor of roughly 0.75.
    Set<Integer> countryCodeSet = new HashSet<Integer>(36);

    countryCodeSet.add(7);
    countryCodeSet.add(30);
    countryCodeSet.add(31);
    countryCodeSet.add(34);
    countryCodeSet.add(43);
    countryCodeSet.add(44);
    countryCodeSet.add(49);
    countryCodeSet.add(55);
    countryCodeSet.add(58);
    countryCodeSet.add(61);
    countryCodeSet.add(62);
    countryCodeSet.add(63);
    countryCodeSet.add(81);
    countryCodeSet.add(90);
    countryCodeSet.add(351);
    countryCodeSet.add(352);
    countryCodeSet.add(359);
    countryCodeSet.add(372);
    countryCodeSet.add(373);
    countryCodeSet.add(375);
    countryCodeSet.add(380);
    countryCodeSet.add(385);
    countryCodeSet.add(595);
    countryCodeSet.add(675);
    countryCodeSet.add(855);
    countryCodeSet.add(971);
    countryCodeSet.add(972);

    return countryCodeSet;
  }
}
