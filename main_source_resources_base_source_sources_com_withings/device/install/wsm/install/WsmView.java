package com.withings.device.install.wsm.install;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import go.a;
/* loaded from: classes3.dex */
public class WsmView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private String f37376a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37377b;

    /* renamed from: c  reason: collision with root package name */
    private User f37378c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f37379d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f37380e;

    public WsmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public User getUser() {
        return this.f37378c;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        String str;
        super.onFinishInflate();
        this.f37380e.setText(getContext().getString(C1987R.string._SENSOR_X_, Integer.valueOf(this.f37377b)));
        if (TextUtils.isEmpty(this.f37376a)) {
            str = getContext().getString(C1987R.string._NOT_ASSIGNED_);
        } else {
            str = this.f37376a;
        }
        this.f37379d.setText(str);
    }

    public void setAssignation(User user) {
        this.f37378c = user;
        if (user == null) {
            this.f37376a = getResources().getString(C1987R.string._NOT_ASSIGNED_);
        } else if (TextUtils.isEmpty(user.l())) {
            this.f37376a = getResources().getString(C1987R.string._WSM_ALREADY_USED_);
        } else {
            this.f37376a = user.l();
        }
        this.f37379d.setText(this.f37376a);
    }

    public WsmView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View inflate = View.inflate(context, C1987R.layout.view_wsm, this);
        this.f37379d = (TextView) inflate.findViewById(16908308);
        this.f37380e = (TextView) inflate.findViewById(16908309);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f69398a);
        this.f37376a = obtainStyledAttributes.getString(1);
        this.f37377b = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
    }
}
