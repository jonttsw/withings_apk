package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import com.withings.common.compose.component.z4;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41054a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41055b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41056c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z4 f41057d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f41058e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f41059f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ym0.a<nm0.y> aVar, g3 g3Var, ym0.a<nm0.y> aVar2, z4 z4Var, Context context, CoroutineScope coroutineScope) {
        super(2);
        this.f41054a = aVar;
        this.f41055b = g3Var;
        this.f41056c = aVar2;
        this.f41057d = z4Var;
        this.f41058e = context;
        this.f41059f = coroutineScope;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            a0.f40840a.h(true, false, false, false, new i0(this.f41055b, this.f41056c, this.f41057d, this.f41058e, this.f41059f), this.f41054a, aVar2, 1572870, 14);
        }
        return nm0.y.f85009a;
    }
}
