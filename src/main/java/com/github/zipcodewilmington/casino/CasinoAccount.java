package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
    public class CasinoAccount {
        private Integer balance;
        private String accountName;
        private String accountPassword;

        public CasinoAccount () {
            this.accountName = "";
            this.accountPassword = "";
            this.balance = 0;
        }

        public CasinoAccount(String accountName, String accountPassword, Integer balance) {

                this.accountName = accountName;
                this.accountPassword = accountPassword;
                this.balance = balance;

            }

            public String getAccountName () {
                return accountName;
            }

            public void setAccountName (String accountName){
                this.accountName = accountName;
            }

            public String getAccountPassword () {
                return accountPassword;
            }

            public void setAccountPassword (String accountPassword){
                this.accountPassword = accountPassword;
            }

            public int getBalance () {
                return balance;
            }

            public void setBalance ( int balance){
                this.balance = balance;
            }
        }
