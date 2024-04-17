package com.withings.authentication.accountConsent;

import com.withings.authentication.accountConsent.i;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.MutableStateFlow;
import ym0.l;
/* compiled from: AccountLoginConsentViewModel.kt */
/* loaded from: classes3.dex */
public final class e {
    public static final void a(MutableStateFlow mutableStateFlow, l lVar) {
        Object value;
        Object obj;
        do {
            value = mutableStateFlow.getValue();
            i iVar = (i) value;
            if (iVar instanceof i.b) {
                obj = i.b.f31444a;
            } else if (iVar instanceof i.a) {
                obj = (i) lVar.invoke(iVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } while (!mutableStateFlow.compareAndSet(value, obj));
    }
}
