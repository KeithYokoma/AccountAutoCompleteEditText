package jp.yokomark.widget.account.autocomp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import jp.yokomark.widget.account.autocomp.internal.entity.AccountType;
import jp.yokomark.widget.account.autocomp.internal.model.CandidateCollector;

/**
 * @author keishin.yokomaku
 * @since 2014/03/05
 */
public class AccountAutoCompleteEditText extends AutoCompleteTextView {
    public AccountAutoCompleteEditText(Context context) {
        this(context, null);
    }

    public AccountAutoCompleteEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AccountAutoCompleteEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        TypedArray array = null;
        AccountType type = null;
        try {
            array = context.obtainStyledAttributes(attrs, R.styleable.AccountAutoCompleteEditText, defStyle, 0);
            type = AccountType.valueOf(array);
        } finally {
            if (array != null) {
                array.recycle();
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                context, android.R.layout.simple_dropdown_item_1line, CandidateCollector.getAccounts(context, type));
        setAdapter(adapter);
    }
}
