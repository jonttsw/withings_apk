package com.withings.core.webcontent;

import android.content.Intent;
import hm.d;
import kotlin.jvm.internal.w;
/* compiled from: HMWebViewDelegate.kt */
/* loaded from: classes3.dex */
final class b extends w implements ym0.a<Intent> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ hm.a f35400a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f35401b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hm.a aVar, d dVar) {
        super(0);
        this.f35400a = aVar;
        this.f35401b = dVar;
    }

    @Override // ym0.a
    public final Intent invoke() {
        hm.a aVar = this.f35400a;
        d dVar = this.f35401b;
        aVar.run(dVar);
        return aVar.getIntent(dVar);
    }
}
