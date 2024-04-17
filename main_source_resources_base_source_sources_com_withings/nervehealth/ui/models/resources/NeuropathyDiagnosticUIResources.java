package com.withings.nervehealth.ui.models.resources;

import com.withings.common.compose.component.Status;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.nervehealth.ui.models.resources.a;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NeuropathyDiagnosticUIResources.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/nervehealth/ui/models/resources/NeuropathyDiagnosticUIResources;", "", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NeuropathyDiagnosticUIResources {

    /* renamed from: d  reason: collision with root package name */
    public static final NeuropathyDiagnosticUIResources f42740d;

    /* renamed from: e  reason: collision with root package name */
    public static final NeuropathyDiagnosticUIResources f42741e;

    /* renamed from: f  reason: collision with root package name */
    public static final NeuropathyDiagnosticUIResources f42742f;

    /* renamed from: g  reason: collision with root package name */
    public static final NeuropathyDiagnosticUIResources f42743g;

    /* renamed from: h  reason: collision with root package name */
    public static final NeuropathyDiagnosticUIResources f42744h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ NeuropathyDiagnosticUIResources[] f42745i;

    /* renamed from: a  reason: collision with root package name */
    private final int f42746a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f42747b;

    /* renamed from: c  reason: collision with root package name */
    private final Status.Icon f42748c;

    static {
        int b10 = a.b.f42753d.b();
        Integer valueOf = Integer.valueOf((int) C1987R.string.timeline_sleepScore_subtitle_formatted);
        Status.Icon icon = Status.Icon.f33328b;
        NeuropathyDiagnosticUIResources neuropathyDiagnosticUIResources = new NeuropathyDiagnosticUIResources("NEUROPATHY_DETECTED", 0, b10, valueOf, icon);
        f42740d = neuropathyDiagnosticUIResources;
        NeuropathyDiagnosticUIResources neuropathyDiagnosticUIResources2 = new NeuropathyDiagnosticUIResources("LOW_ELECTRODERMAL_ACTIVITY", 1, a.c.f42754d.b(), valueOf, icon);
        f42741e = neuropathyDiagnosticUIResources2;
        NeuropathyDiagnosticUIResources neuropathyDiagnosticUIResources3 = new NeuropathyDiagnosticUIResources("NO_NEUROPATHY_SIGNS", 2, C1987R.string.nerveHealth_status_normal, valueOf, Status.Icon.f33327a);
        f42742f = neuropathyDiagnosticUIResources3;
        Status.Icon icon2 = Status.Icon.f33330d;
        NeuropathyDiagnosticUIResources neuropathyDiagnosticUIResources4 = new NeuropathyDiagnosticUIResources("NEUROPATHY_PROCESSING", 3, C1987R.string.nerveHealth_status_inProgress, null, icon2);
        f42743g = neuropathyDiagnosticUIResources4;
        NeuropathyDiagnosticUIResources neuropathyDiagnosticUIResources5 = new NeuropathyDiagnosticUIResources("NEUROPATHY_INCONCLUSIVE", 4, C1987R.string.nerveHealth_status_inconclusive, null, icon2);
        f42744h = neuropathyDiagnosticUIResources5;
        NeuropathyDiagnosticUIResources[] neuropathyDiagnosticUIResourcesArr = {neuropathyDiagnosticUIResources, neuropathyDiagnosticUIResources2, neuropathyDiagnosticUIResources3, neuropathyDiagnosticUIResources4, neuropathyDiagnosticUIResources5};
        f42745i = neuropathyDiagnosticUIResourcesArr;
        b.a(neuropathyDiagnosticUIResourcesArr);
    }

    private NeuropathyDiagnosticUIResources(String str, int i11, int i12, Integer num, Status.Icon icon) {
        this.f42746a = i12;
        this.f42747b = num;
        this.f42748c = icon;
    }

    public static int e(MeasureCategory category) {
        a aVar;
        u.j(category, "category");
        int ordinal = category.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    aVar = a.C0573a.f42752d;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aVar = a.c.f42754d;
            }
        } else {
            aVar = a.b.f42753d;
        }
        return aVar.c();
    }

    public static NeuropathyDiagnosticUIResources valueOf(String str) {
        return (NeuropathyDiagnosticUIResources) Enum.valueOf(NeuropathyDiagnosticUIResources.class, str);
    }

    public static NeuropathyDiagnosticUIResources[] values() {
        return (NeuropathyDiagnosticUIResources[]) f42745i.clone();
    }

    public final Integer a() {
        return this.f42747b;
    }

    public final Status.Icon b() {
        return this.f42748c;
    }

    public final int d() {
        return this.f42746a;
    }
}
