package jp.yokomark.widget.account.autocomp.internal.model;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.text.TextUtils;

import java.util.HashSet;
import java.util.Set;

import jp.yokomark.widget.account.autocomp.internal.entity.AccountType;
import jp.yokomark.widget.account.autocomp.internal.filter.AccountFilter;

/**
 * @author KeithYokoma
 * @since 2014/03/05
 */
public final class CandidateCollector {
    public static String[] getAccounts(Context context, AccountType type) {
        Set<String> accountSet = new HashSet<String>();
        AccountManager manager = (AccountManager) context.getSystemService(Context.ACCOUNT_SERVICE);
        final Account[] accounts = manager.getAccounts();
        final AccountFilter filter = type.getFilter();
        for (Account account : accounts) {
            String accepted = filter.filter(account);
            if (!TextUtils.isEmpty(accepted)) {
                accountSet.add(accepted);
            }
        }
        return accountSet.toArray(new String[accountSet.size()]);
    }
}