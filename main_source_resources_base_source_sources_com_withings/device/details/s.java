package com.withings.device.details;

import androidx.compose.material.c5;
import k1.r0;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f36885a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f36886b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f36887c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f36888d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(c5 c5Var, r0 r0Var, h hVar, CoroutineScope coroutineScope) {
        super(2);
        this.f36885a = hVar;
        this.f36886b = coroutineScope;
        this.f36887c = c5Var;
        this.f36888d = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            c5 c5Var = this.f36887c;
            r0<Boolean> r0Var = this.f36888d;
            h hVar = this.f36885a;
            CoroutineScope coroutineScope = this.f36886b;
            n nVar = new n(c5Var, r0Var, hVar, coroutineScope);
            h hVar2 = this.f36885a;
            h.v1(hVar, nVar, new p(c5Var, r0Var, hVar2, coroutineScope), new r(c5Var, r0Var, hVar2, coroutineScope), aVar2, 4096);
        }
        return nm0.y.f85009a;
    }
}
