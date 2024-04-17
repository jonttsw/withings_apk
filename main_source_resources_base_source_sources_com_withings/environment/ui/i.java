package com.withings.environment.ui;

import com.withings.environment.ui.sleep.SleepSecondaryGraphCard;
import com.withings.library.measure.Measure;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WsdGraphFragment.java */
/* loaded from: classes3.dex */
public final class i extends pm.h<List<Measure>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepSecondaryGraphCard f39011a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f39012b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar, SleepSecondaryGraphCard sleepSecondaryGraphCard) {
        this.f39012b = jVar;
        this.f39011a = sleepSecondaryGraphCard;
    }

    @Override // vh.m.b
    public final void onResult(Object obj) {
        this.f39012b.B1((List) obj, this.f39011a);
    }
}
