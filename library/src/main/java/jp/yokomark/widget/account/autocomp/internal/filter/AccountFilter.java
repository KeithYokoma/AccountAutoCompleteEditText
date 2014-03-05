package jp.yokomark.widget.account.autocomp.internal.filter;

import android.accounts.Account;

/**
 * @author keishin.yokomaku
 * @since 2014/03/05
 */
public interface AccountFilter {
    public String filter(Account account);
}
