package com.withings.cycletracking.ui.viewmodel;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import dn.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$graphItems$1", f = "CycleTrackingViewModel.kt", l = {ConstantsWs.WS_STATUS_MEASNOTSHARED}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<List<? extends wm.f>, qm0.d<? super List<? extends b.InterfaceC0847b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    CycleTrackingViewModel f35907a;

    /* renamed from: b  reason: collision with root package name */
    Collection f35908b;

    /* renamed from: c  reason: collision with root package name */
    Iterator f35909c;

    /* renamed from: d  reason: collision with root package name */
    wm.f f35910d;

    /* renamed from: e  reason: collision with root package name */
    Collection f35911e;

    /* renamed from: f  reason: collision with root package name */
    Iterator f35912f;

    /* renamed from: g  reason: collision with root package name */
    wm.d f35913g;

    /* renamed from: h  reason: collision with root package name */
    Collection f35914h;

    /* renamed from: i  reason: collision with root package name */
    LocalDate f35915i;

    /* renamed from: j  reason: collision with root package name */
    ArrayList f35916j;

    /* renamed from: k  reason: collision with root package name */
    int f35917k;

    /* renamed from: l  reason: collision with root package name */
    int f35918l;

    /* renamed from: m  reason: collision with root package name */
    /* synthetic */ Object f35919m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Context f35920n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ CycleTrackingViewModel f35921o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, CycleTrackingViewModel cycleTrackingViewModel, qm0.d<? super l> dVar) {
        super(2, dVar);
        this.f35920n = context;
        this.f35921o = cycleTrackingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        l lVar = new l(this.f35920n, this.f35921o, dVar);
        lVar.f35919m = obj;
        return lVar;
    }

    @Override // ym0.p
    public final Object invoke(List<? extends wm.f> list, qm0.d<? super List<? extends b.InterfaceC0847b>> dVar) {
        return ((l) create(list, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0064 -> B:12:0x0080). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0140 -> B:26:0x014c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.viewmodel.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
