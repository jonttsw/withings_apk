package com.withings.wiscale2.activity.logging.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class n implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.appcompat.app.c f48419a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(androidx.appcompat.app.c cVar) {
        this.f48419a = cVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s11) {
        kotlin.jvm.internal.u.j(s11, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s11, int i11, int i12, int i13) {
        kotlin.jvm.internal.u.j(s11, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        int i14;
        boolean z5;
        kotlin.jvm.internal.u.j(charSequence, "charSequence");
        androidx.appcompat.app.c cVar = this.f48419a;
        if (cVar != null) {
            Button g11 = cVar.g(-1);
            String str = "";
            boolean z11 = true;
            try {
                try {
                    String obj = charSequence.toString();
                    int length = obj.length() - 1;
                    int i15 = 0;
                    boolean z12 = false;
                    while (i15 <= length) {
                        if (!z12) {
                            i14 = i15;
                        } else {
                            i14 = length;
                        }
                        if (kotlin.jvm.internal.u.l(obj.charAt(i14), 32) <= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z12) {
                            if (!z5) {
                                z12 = true;
                            } else {
                                i15++;
                            }
                        } else if (!z5) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    str = obj.subSequence(i15, length + 1).toString();
                    Float.parseFloat(dp0.j.O(str, ",", ".", false));
                } catch (NumberFormatException unused) {
                    g11.setEnabled(false);
                    if (str.length() <= 0) {
                        z11 = false;
                    }
                }
                g11.setEnabled(z11);
            } catch (Throwable th2) {
                if (str.length() <= 0) {
                    z11 = false;
                }
                g11.setEnabled(z11);
                throw th2;
            }
        }
    }
}
