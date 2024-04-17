package com.withings.details.height;

import androidx.compose.material.c5;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36644a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f36645b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f36646c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(HeightListActivity heightListActivity, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f36644a = heightListActivity;
        this.f36645b = coroutineScope;
        this.f36646c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HeightListActivity.H3(this.f36644a, this.f36645b, this.f36646c, aVar2, 584);
        }
        return nm0.y.f85009a;
    }
}
