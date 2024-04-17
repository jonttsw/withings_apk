package com.withings.wiscale2.settings;
/* compiled from: TracesLogsActivity.kt */
/* loaded from: classes5.dex */
final class r5 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TracesLogsActivity f60288a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(TracesLogsActivity tracesLogsActivity) {
        super(2);
        this.f60288a = tracesLogsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f60288a.z3(null, aVar2, 0, 1);
        }
        return nm0.y.f85009a;
    }
}
