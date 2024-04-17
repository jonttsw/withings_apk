package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import com.withings.common.compose.component.z4;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41139a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41141c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ z4 f41142d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f41143e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f41144f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ym0.a<nm0.y> aVar, g3 g3Var, ym0.a<nm0.y> aVar2, z4 z4Var, Context context, CoroutineScope coroutineScope) {
        super(2);
        this.f41139a = aVar;
        this.f41140b = g3Var;
        this.f41141c = aVar2;
        this.f41142d = z4Var;
        this.f41143e = context;
        this.f41144f = coroutineScope;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            a0.f40840a.h(false, false, false, false, new n(this.f41140b, this.f41141c, this.f41142d, this.f41143e, this.f41144f), this.f41139a, aVar2, 1572870, 14);
        }
        return nm0.y.f85009a;
    }
}
