package com.withings.manualLogging.ui.feature.addNote;

import com.withings.manualLogging.ui.uikit.atoms.SaveManualLogButtonStatus;
/* compiled from: AddNotesViewModel.kt */
/* loaded from: classes4.dex */
final class j1 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Boolean, Boolean>, SaveManualLogButtonStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static final j1 f41474a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final SaveManualLogButtonStatus invoke(nm0.j<Boolean, Boolean> jVar) {
        nm0.j<Boolean, Boolean> jVar2 = jVar;
        Boolean a11 = jVar2.a();
        boolean booleanValue = jVar2.b().booleanValue();
        kotlin.jvm.internal.u.g(a11);
        if (a11.booleanValue()) {
            return SaveManualLogButtonStatus.f41669c;
        }
        if (booleanValue) {
            return SaveManualLogButtonStatus.f41667a;
        }
        return SaveManualLogButtonStatus.f41668b;
    }
}
