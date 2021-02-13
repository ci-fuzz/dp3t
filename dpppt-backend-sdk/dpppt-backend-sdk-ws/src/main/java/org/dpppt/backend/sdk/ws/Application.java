/*
 * Copyright (c) 2020 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package org.dpppt.backend.sdk.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
ComponentScan(basePackages = {"org.dpppt.backend.sdk.ws.config", "org.dpppt.backend.sdk.ws"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX, pattern = {"org.dpppt.backend.sdk.ws.controller.*", "org.dpppt.backend.sdk.ws.util.*", "org.dpppt.backend.sdk.ws.security.*"})})
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class })
@EnableWebMvc
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }
}
