package com.withings.wiscale2.settings;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class o1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f60221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60222b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(CoroutineScope coroutineScope, SettingsActivity settingsActivity) {
        super(0);
        this.f60221a = coroutineScope;
        this.f60222b = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f60221a, null, null, new n1(this.f60222b, null), 3, null);
        return nm0.y.f85009a;
    }
}
