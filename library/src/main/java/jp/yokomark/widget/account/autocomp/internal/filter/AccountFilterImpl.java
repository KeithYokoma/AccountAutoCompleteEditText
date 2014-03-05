package jp.yokomark.widget.account.autocomp.internal.filter;

import android.accounts.Account;

import java.util.regex.Pattern;

/**
 * @author keishin.yokomaku
 * @since 2014/03/05
 */
public class AccountFilterImpl implements AccountFilter {
    private final Pattern mPattern;

    public AccountFilterImpl(String regex) {
        mPattern = Pattern.compile(regex);
    }

    protected Pattern getPattern() {
        return mPattern;
    }

    @Override
    public String filter(Account account) {
        if (getPattern().matcher(account.name).find()) {
            return account.name;
        }
        return null;
    }
}
