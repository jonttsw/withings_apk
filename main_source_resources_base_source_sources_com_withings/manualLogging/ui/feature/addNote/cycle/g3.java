package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.common.compose.picker.SurveyDateValidator;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.core.entity.cycle.ContraceptiveRegime;
import com.withings.manualLogging.core.entity.cycle.ContraceptiveType;
import com.withings.manualLogging.core.entity.cycle.CycleManualLoggingFactor;
import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
/* compiled from: CycleSurveyFormField.kt */
/* loaded from: classes4.dex */
public final class g3 {

    /* renamed from: a  reason: collision with root package name */
    private final LocalDate f41009a;

    /* renamed from: b  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41010b;

    /* renamed from: c  reason: collision with root package name */
    private final ParcelableSnapshotMutableIntState f41011c;

    /* renamed from: d  reason: collision with root package name */
    private final ParcelableSnapshotMutableIntState f41012d;

    /* renamed from: e  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41013e;

    /* renamed from: f  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41014f;

    /* renamed from: g  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41015g;

    /* renamed from: h  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41016h;

    /* renamed from: i  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41017i;

    /* renamed from: j  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41018j;

    /* renamed from: k  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41019k;

    /* renamed from: l  reason: collision with root package name */
    private final ParcelableSnapshotMutableState f41020l;

    public g3() {
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        ParcelableSnapshotMutableState f13;
        ParcelableSnapshotMutableState f14;
        ParcelableSnapshotMutableState f15;
        ParcelableSnapshotMutableState f16;
        ParcelableSnapshotMutableState f17;
        ParcelableSnapshotMutableState f18;
        ParcelableSnapshotMutableState f19;
        LocalDate now = LocalDate.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        this.f41009a = now;
        f11 = androidx.compose.runtime.l0.f(CycleManualLoggingFactor.f40671a, androidx.compose.runtime.v0.f8878a);
        this.f41010b = f11;
        this.f41011c = ah.p.h(28);
        this.f41012d = ah.p.h(4);
        f12 = androidx.compose.runtime.l0.f(CycleRegularity.f40682b, androidx.compose.runtime.v0.f8878a);
        this.f41013e = f12;
        f13 = androidx.compose.runtime.l0.f(now, androidx.compose.runtime.v0.f8878a);
        this.f41014f = f13;
        f14 = androidx.compose.runtime.l0.f(now, androidx.compose.runtime.v0.f8878a);
        this.f41015g = f14;
        f15 = androidx.compose.runtime.l0.f(now, androidx.compose.runtime.v0.f8878a);
        this.f41016h = f15;
        f16 = androidx.compose.runtime.l0.f(now, androidx.compose.runtime.v0.f8878a);
        this.f41017i = f16;
        f17 = androidx.compose.runtime.l0.f(ContraceptiveType.f40668b, androidx.compose.runtime.v0.f8878a);
        this.f41018j = f17;
        f18 = androidx.compose.runtime.l0.f(ContraceptiveRegime.f40664b, androidx.compose.runtime.v0.f8878a);
        this.f41019k = f18;
        f19 = androidx.compose.runtime.l0.f(now, androidx.compose.runtime.v0.f8878a);
        this.f41020l = f19;
    }

    public final ContraceptiveRegime a() {
        return (ContraceptiveRegime) this.f41019k.getValue();
    }

    public final ContraceptiveType b() {
        return (ContraceptiveType) this.f41018j.getValue();
    }

    public final int c() {
        return this.f41011c.d();
    }

    public final CycleRegularity d() {
        return (CycleRegularity) this.f41013e.getValue();
    }

    public final SurveyDateValidator e() {
        return h3.a(this, Long.valueOf(this.f41009a.minusYears(1).toDate().getTime()));
    }

    public final CycleManualLoggingFactor f() {
        return (CycleManualLoggingFactor) this.f41010b.getValue();
    }

    public final LocalDate g() {
        return (LocalDate) this.f41020l.getValue();
    }

    public final LocalDate h() {
        return (LocalDate) this.f41014f.getValue();
    }

    public final LocalDate i() {
        return (LocalDate) this.f41016h.getValue();
    }

    public final LocalDate j() {
        return this.f41009a;
    }

    public final int k() {
        return this.f41012d.d();
    }

    public final LocalDate l() {
        return (LocalDate) this.f41015g.getValue();
    }

    public final LocalDate m() {
        return (LocalDate) this.f41017i.getValue();
    }

    public final boolean n() {
        LocalDate minusYears = LocalDate.now().minusYears(1);
        LocalDate h11 = h();
        if (h11.compareTo((ReadablePartial) minusYears) >= 0 && h11.compareTo((ReadablePartial) this.f41009a) <= 0) {
            return true;
        }
        return false;
    }

    public final void o(ContraceptiveRegime contraceptiveRegime) {
        kotlin.jvm.internal.u.j(contraceptiveRegime, "<set-?>");
        this.f41019k.setValue(contraceptiveRegime);
    }

    public final void p(ContraceptiveType contraceptiveType) {
        kotlin.jvm.internal.u.j(contraceptiveType, "<set-?>");
        this.f41018j.setValue(contraceptiveType);
    }

    public final void q(int i11) {
        this.f41011c.g(i11);
    }

    public final void r(CycleRegularity cycleRegularity) {
        kotlin.jvm.internal.u.j(cycleRegularity, "<set-?>");
        this.f41013e.setValue(cycleRegularity);
    }

    public final void s(CycleManualLoggingFactor cycleManualLoggingFactor) {
        kotlin.jvm.internal.u.j(cycleManualLoggingFactor, "<set-?>");
        this.f41010b.setValue(cycleManualLoggingFactor);
    }

    public final void t(LocalDate localDate) {
        kotlin.jvm.internal.u.j(localDate, "<set-?>");
        this.f41020l.setValue(localDate);
    }

    public final void u(LocalDate localDate) {
        kotlin.jvm.internal.u.j(localDate, "<set-?>");
        this.f41014f.setValue(localDate);
    }

    public final void v(LocalDate localDate) {
        kotlin.jvm.internal.u.j(localDate, "<set-?>");
        this.f41016h.setValue(localDate);
    }

    public final void w(int i11) {
        this.f41012d.g(i11);
    }

    public final void x(LocalDate localDate) {
        kotlin.jvm.internal.u.j(localDate, "<set-?>");
        this.f41015g.setValue(localDate);
    }

    public final void y(LocalDate localDate) {
        LocalDate minusDays = localDate.minusDays(ConstantsWs.WS_STATUS_WRONGSECRET);
        kotlin.jvm.internal.u.i(minusDays, "minusDays(...)");
        this.f41017i.setValue(minusDays);
    }
}
