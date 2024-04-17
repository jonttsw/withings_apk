package com.withings.details.height;

import androidx.compose.material.c5;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36640a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f36641b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f36642c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f36643d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(HeightListActivity heightListActivity, CoroutineScope coroutineScope, c5 c5Var, int i11) {
        super(2);
        this.f36640a = heightListActivity;
        this.f36641b = coroutineScope;
        this.f36642c = c5Var;
        this.f36643d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36643d | 1);
        CoroutineScope coroutineScope = this.f36641b;
        c5 c5Var = this.f36642c;
        HeightListActivity.H3(this.f36640a, coroutineScope, c5Var, aVar, g11);
        return nm0.y.f85009a;
    }
}
