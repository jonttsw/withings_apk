package com.withings.weight.ui;

import androidx.camera.camera2.internal.k0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SegmentalBodyCompositionDestination.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/ui/SegmentalBodyCompositionDestination;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SegmentalBodyCompositionDestination {

    /* renamed from: c  reason: collision with root package name */
    public static final SegmentalBodyCompositionDestination f47604c;

    /* renamed from: d  reason: collision with root package name */
    public static final SegmentalBodyCompositionDestination f47605d;

    /* renamed from: e  reason: collision with root package name */
    public static final SegmentalBodyCompositionDestination f47606e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ SegmentalBodyCompositionDestination[] f47607f;

    /* renamed from: a  reason: collision with root package name */
    private final List<r8.d> f47608a;

    /* renamed from: b  reason: collision with root package name */
    private final List<androidx.navigation.p> f47609b;

    static {
        SegmentalBodyCompositionDestination segmentalBodyCompositionDestination = new SegmentalBodyCompositionDestination("Experience", 0);
        f47604c = segmentalBodyCompositionDestination;
        SegmentalBodyCompositionDestination segmentalBodyCompositionDestination2 = new SegmentalBodyCompositionDestination("Graph", 1);
        f47605d = segmentalBodyCompositionDestination2;
        SegmentalBodyCompositionDestination segmentalBodyCompositionDestination3 = new SegmentalBodyCompositionDestination("Tutorial", 2);
        f47606e = segmentalBodyCompositionDestination3;
        SegmentalBodyCompositionDestination[] segmentalBodyCompositionDestinationArr = {segmentalBodyCompositionDestination, segmentalBodyCompositionDestination2, segmentalBodyCompositionDestination3};
        f47607f = segmentalBodyCompositionDestinationArr;
        sm0.b.a(segmentalBodyCompositionDestinationArr);
    }

    private SegmentalBodyCompositionDestination() {
        throw null;
    }

    SegmentalBodyCompositionDestination(String str, int i11) {
        i0 i0Var = i0.f76187a;
        this.f47608a = i0Var;
        this.f47609b = i0Var;
    }

    public static SegmentalBodyCompositionDestination valueOf(String str) {
        return (SegmentalBodyCompositionDestination) Enum.valueOf(SegmentalBodyCompositionDestination.class, str);
    }

    public static SegmentalBodyCompositionDestination[] values() {
        return (SegmentalBodyCompositionDestination[]) f47607f.clone();
    }

    public final List<r8.d> a() {
        return this.f47608a;
    }

    public final List<androidx.navigation.p> b() {
        return this.f47609b;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        for (r8.d dVar : this.f47608a) {
            String a11 = dVar.a();
            if (dVar.b().b()) {
                sb2.append(k0.c("?", a11, "={", a11, "}"));
            } else {
                sb2.append("/{" + a11 + "}");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.u.i(sb3, "toString(...)");
        return sb3;
    }
}
