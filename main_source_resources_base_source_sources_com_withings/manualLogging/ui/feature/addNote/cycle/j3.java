package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import com.withings.manualLogging.ui.feature.addNote.cycle.viewmodel.CycleDataStorageViewModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingSymptomsAndPeriodManualLoggingActivity.kt */
/* loaded from: classes4.dex */
public final class j3 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f41064a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41065b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleDataStorageViewModel f41066c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(CycleDataStorageViewModel cycleDataStorageViewModel, String str, ym0.a aVar) {
        super(4);
        this.f41064a = str;
        this.f41065b = aVar;
        this.f41066c = cycleDataStorageViewModel;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        CycleDataStorageViewModel cycleDataStorageViewModel = this.f41066c;
        tx.c.a(this.f41064a, this.f41065b, cycleDataStorageViewModel, null, aVar, 512, 8);
        return nm0.y.f85009a;
    }
}
