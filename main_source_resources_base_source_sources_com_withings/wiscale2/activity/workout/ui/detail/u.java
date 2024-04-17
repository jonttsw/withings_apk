package com.withings.wiscale2.activity.workout.ui.detail;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: EditPoolLengthSheetFragment.kt */
/* loaded from: classes4.dex */
public final class u implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f49661a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public u(ym0.l<? super String, nm0.y> lVar) {
        this.f49661a = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f49661a.invoke(String.valueOf(editable));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
