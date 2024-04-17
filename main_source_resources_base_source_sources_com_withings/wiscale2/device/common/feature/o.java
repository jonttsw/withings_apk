package com.withings.wiscale2.device.common.feature;

import androidx.lifecycle.LiveData;
import com.withings.wiscale2.device.common.feature.q;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: FeatureActivationDocument.kt */
/* loaded from: classes5.dex */
public final class o extends LiveData<q> {

    /* renamed from: a  reason: collision with root package name */
    private final d f52399a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f52400b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52401c;

    public o(d dVar, CoroutineScope coroutineScope, String str) {
        this.f52399a = dVar;
        this.f52400b = coroutineScope;
        this.f52401c = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        postValue(q.c.f52408a);
        CoroutineScope coroutineScope = this.f52400b;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineScope.getCoroutineContext().plus(Dispatchers.getIO()), null, new n(this, null), 2, null);
    }

    public final String x() {
        return this.f52401c;
    }
}
