package com.mojang.authlib;

import java.util.StringJoiner;

public interface Environment {

    String getAuthHost();

    String getAccountsHost();

    String getSessionHost();

    String getServicesHost();

    String getName();

    String asString();

    static Environment create(final String auth, final String account, final String session, final String services, final String name) {

        return new Environment() {
            @Override
            public String getAuthHost() {
                return auth;
            }

            @Override
            public String getAccountsHost() {
                return account;
            }

            @Override
            public String getSessionHost() {
                return session;
            }

            @Override
            public String getServicesHost() {
                return services;
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public String asString() {
                return new StringJoiner(", ", "", "")
                           .add("authHost='" + getAuthHost() + "'")
                           .add("accountsHost='" + getAccountsHost() + "'")
                           .add("sessionHost='" + getSessionHost() + "'")
                           .add("servicesHost='" + getServicesHost() + "'")
                           .add("name='" + getName() + "'")
                           .toString();
            }
        };
    }

}
