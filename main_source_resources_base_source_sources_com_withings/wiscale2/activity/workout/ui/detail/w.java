package com.withings.wiscale2.activity.workout.ui.detail;

import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditPoolLengthSheetFragment.kt */
/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextInputEditText f49760a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f49761b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(TextInputEditText textInputEditText, v vVar) {
        super(1);
        this.f49760a = textInputEditText;
        this.f49761b = vVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String str2;
        androidx.appcompat.app.c cVar;
        int i11;
        String text = str;
        kotlin.jvm.internal.u.j(text, "text");
        int length = text.length();
        v vVar = this.f49761b;
        if (length >= 2 && !v.z1(vVar, text)) {
            str2 = vVar.getString(C1987R.string._ERROR_);
        } else {
            str2 = null;
        }
        this.f49760a.setError(str2);
        cVar = vVar.f49713e;
        if (cVar != null) {
            Button g11 = cVar.g(-1);
            if (g11 != null) {
                if (v.z1(vVar, text)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                g11.setVisibility(i11);
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("dialog");
        throw null;
    }
}
