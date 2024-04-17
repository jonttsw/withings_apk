package com.withings.wiscale2.account.password;

import com.google.android.material.textfield.TextInputLayout;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: PasswordEditionFragment.kt */
/* loaded from: classes4.dex */
final class l extends w implements ym0.l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextInputLayout f48173a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f48174b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TextInputLayout textInputLayout, k kVar) {
        super(1);
        this.f48173a = textInputLayout;
        this.f48174b = kVar;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        Integer num2 = num;
        String str = null;
        if (num2 != null) {
            int intValue = num2.intValue();
            k kVar = this.f48174b;
            if (intValue == C1987R.string._AC_PASSWORD_TOO_SHORT_) {
                str = kVar.getString(num2.intValue(), 8);
            } else if (num2.intValue() > 0) {
                str = kVar.getString(num2.intValue());
            }
        }
        this.f48173a.setError(str);
        return y.f85009a;
    }
}
