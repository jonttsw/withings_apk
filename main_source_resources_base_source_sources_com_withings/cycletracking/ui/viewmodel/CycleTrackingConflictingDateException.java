package com.withings.cycletracking.ui.viewmodel;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/CycleTrackingConflictingDateException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleTrackingConflictingDateException extends IllegalArgumentException {

    /* renamed from: a  reason: collision with root package name */
    private final int f35761a = C1987R.string.cycleFactor_error_alreadyExist;

    /* renamed from: b  reason: collision with root package name */
    private final String f35762b;

    public CycleTrackingConflictingDateException(String str) {
        this.f35762b = str;
    }

    public final String a() {
        return this.f35762b;
    }

    public final int b() {
        return this.f35761a;
    }
}
