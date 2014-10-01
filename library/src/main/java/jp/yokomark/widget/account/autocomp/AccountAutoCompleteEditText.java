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
    private AccountType mAccountType;

    public AccountAutoCompleteEditText(Context context) {
        super(context);

        setUpAttributes(context, null, 0);
    }

    public AccountAutoCompleteEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        setUpAttributes(context, attrs, 0);
    }

    public AccountAutoCompleteEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        setUpAttributes(context, attrs, defStyle);
    }

    private void setUpAttributes(Context context, AttributeSet attrs, int defStyle) {
        TypedArray array = null;
        try {
            array = context.obtainStyledAttributes(attrs, R.styleable.AccountAutoCompleteEditText, defStyle, 0);
            mAccountType = AccountType.valueOf(array);
        } finally {
            if (array != null) {
                array.recycle();
            }
        }
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        if (isInEditMode()) return;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_dropdown_item_1line, CandidateCollector
                .getAccounts(getContext(), mAccountType));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        setAdapter(adapter);
    }
}
