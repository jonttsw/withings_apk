package com.withings.manualLogging.ui.feature.addNote.cycle;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class d0 extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f40971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f40972b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<LocalDate, nm0.y> f40973c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(k1.r0<Boolean> r0Var, g3 g3Var, ym0.l<? super LocalDate, nm0.y> lVar) {
        super(1);
        this.f40971a = r0Var;
        this.f40972b = g3Var;
        this.f40973c = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        LocalDate localDate = new DateTime(l5.longValue(), DateTimeZone.UTC).toLocalDate();
        this.f40971a.setValue(Boolean.valueOf(this.f40972b.n()));
        kotlin.jvm.internal.u.g(localDate);
        this.f40973c.invoke(localDate);
        return nm0.y.f85009a;
    }
}
